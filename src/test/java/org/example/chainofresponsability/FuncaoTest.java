package org.example.chainofresponsability;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncaoTest {
    PersonagemGuerreiro guerreiro;
    PersonagemCurandeiro curandeiro;
    PersonagemArqueiro arqueiro;

    @BeforeEach
    void setUp() {
        guerreiro = new PersonagemGuerreiro(guerreiro);
        curandeiro = new PersonagemCurandeiro(curandeiro);
        arqueiro = new PersonagemArqueiro(arqueiro);
    }

    @Test
    void deveRetornarGuerreiroParaFuncaoTank() {
        assertEquals("Guerreiro", guerreiro.aptoFuncao(new Funcao(TipoFuncaoTank.getTipoFuncaoTank())));
    }

    @Test
    void deveRetornarArqueiroParaFuncaoDPS() {
        assertEquals("Arqueiro", arqueiro.aptoFuncao(new Funcao(TipoFuncaoDPS.getTipoFuncaoDPS())));
    }

    @Test
    void deveRetornarCurandeiroParaFuncaoSuporte() {
        assertEquals("Curandeiro", curandeiro.aptoFuncao(new Funcao(TipoFuncaoSuporte.getTipoFuncaoSuporte())));
    }
}