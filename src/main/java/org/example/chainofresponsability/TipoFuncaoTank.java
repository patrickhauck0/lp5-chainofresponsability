package org.example.chainofresponsability;

public class TipoFuncaoTank implements TipoFuncao {
    private static TipoFuncaoTank tipoFuncaoTank = new TipoFuncaoTank();

    private TipoFuncaoTank() {};

    public static TipoFuncaoTank getTipoFuncaoTank() {
        return tipoFuncaoTank;
    }
}
