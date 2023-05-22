package org.example.chainofresponsability;

public class TipoFuncaoSuporte implements TipoFuncao {
    private static TipoFuncaoSuporte tipoFuncaoSuporte = new TipoFuncaoSuporte();

    private TipoFuncaoSuporte() {};

    public static TipoFuncaoSuporte getTipoFuncaoSuporte() {
        return tipoFuncaoSuporte;
    }
}
