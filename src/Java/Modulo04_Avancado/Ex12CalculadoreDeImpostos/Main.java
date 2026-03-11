package Java.Modulo04_Avancado.Ex12CalculadoreDeImpostos;

public class Main {
    public static void main(String[] args) {
        double valor = 1000.00;
        double icms = TipoImposto.ICMS.calcular(valor);
        double iss = TipoImposto.ISS.calcular(valor);
        double pis = TipoImposto.PIS.calcular(valor);
        double confins = TipoImposto.COFINS.calcular(valor);
        double total = icms + iss + pis + confins;

        System.out.println("O valor total de imposto a ser pago: " + total);
    }
}
