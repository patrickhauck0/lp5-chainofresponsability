package org.example.chainofresponsability;

public class PersonagemArqueiro extends Personagem{
    public PersonagemArqueiro(Personagem main) {
        listaFuncoes.add(TipoFuncaoDPS.getTipoFuncaoDPS());
        setPersonagemMain(main);
    }

    public String getDescricaoClasse() {
        return "Arqueiro";
    }
}
