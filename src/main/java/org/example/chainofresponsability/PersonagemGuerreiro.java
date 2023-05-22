package org.example.chainofresponsability;

public class PersonagemGuerreiro extends Personagem {
    public PersonagemGuerreiro(Personagem main) {
        listaFuncoes.add(TipoFuncaoTank.getTipoFuncaoTank());
        setPersonagemMain(main);
    }

    public String getDescricaoClasse() {
        return "Guerreiro";
    }
}
