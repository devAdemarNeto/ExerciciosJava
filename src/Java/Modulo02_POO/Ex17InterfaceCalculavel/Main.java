package Java.Modulo02_POO.Ex17InterfaceCalculavel;

public class Main {
    public static void main(String[] args) {
        Calculavel soma = new Soma();
        Calculavel sub = new Subtracao();
        Calculavel mult = new Multiplicacao();
        System.out.println("10 + 5 = " + soma.calcular(10, 5));
        System.out.println("10 - 5 = " + sub.calcular(10, 5));
        System.out.println("10 * 5 = " + mult.calcular(10, 5));
    }
}
