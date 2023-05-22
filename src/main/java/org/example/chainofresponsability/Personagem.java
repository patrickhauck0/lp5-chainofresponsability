package org.example.chainofresponsability;

import java.util.ArrayList;

public abstract class Personagem {
    protected ArrayList listaFuncoes = new ArrayList();
    private Personagem personagemMain;

    public Personagem getPersonagemMain() {
        return personagemMain;
    }

    public void setPersonagemMain(Personagem personagemMain) {
        this.personagemMain = personagemMain;
    }

    public abstract String getDescricaoClasse();

    public String aptoFuncao(Funcao funcao) {
        if (listaFuncoes.contains(funcao.getTipoFuncao())) {
            return getDescricaoClasse();
        }
        else {
            if (personagemMain != null) {
                return personagemMain.aptoFuncao(funcao);
            }
            else {
                return "Não é apto";
            }
        }
    }
}
