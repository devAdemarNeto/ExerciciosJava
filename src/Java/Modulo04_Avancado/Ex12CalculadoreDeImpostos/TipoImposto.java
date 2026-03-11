package Java.Modulo04_Avancado.Ex12CalculadoreDeImpostos;

public enum TipoImposto {
    ICMS(0.18),
    ISS(0.05),
    PIS(0.0165),
    COFINS(0.076);

    private final double percentual;

    TipoImposto(double percentual) {
        this.percentual = percentual;
    }

    public double getPercentual() {
        return percentual;
    }

    public double calcular(double valor){
        return valor * percentual;
    }
}
