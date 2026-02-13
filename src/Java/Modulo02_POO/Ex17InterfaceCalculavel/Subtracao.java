package Java.Modulo02_POO.Ex17InterfaceCalculavel;

public class Subtracao implements Calculavel {


    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
