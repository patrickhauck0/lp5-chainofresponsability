package org.example.chainofresponsability;

public class PersonagemCurandeiro extends Personagem {
    public PersonagemCurandeiro(Personagem main) {
        listaFuncoes.add(TipoFuncaoTank.getTipoFuncaoTank());
        setPersonagemMain(main);
    }

    public String getDescricaoClasse() {
        return "Curandeiro";
    }
}
