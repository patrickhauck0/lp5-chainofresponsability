package org.example.chainofresponsability;

public class Funcao {
    private TipoFuncao tipoFuncao;

    public Funcao(TipoFuncao tipoFuncao) {
        this.tipoFuncao = tipoFuncao;
    }

    public TipoFuncao getTipoFuncao() {
        return tipoFuncao;
    }

    public void setTipoFuncao(TipoFuncao tipoFuncao) {
        this.tipoFuncao = tipoFuncao;
    }
}
