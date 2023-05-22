package org.example.chainofresponsability;

public class TipoFuncaoDPS implements TipoFuncao {
    private static TipoFuncaoDPS tipoFuncaoDPS = new TipoFuncaoDPS();

    private TipoFuncaoDPS() {};

    public static TipoFuncaoDPS getTipoFuncaoDPS() {
        return tipoFuncaoDPS;
    }
}
