package Java.Modulo02_POO.VeiculosEx12;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Uno", 4);
        System.out.println("Veículo: " + carro.getMarca() + " " + carro.getModelo());
        System.out.println("Tipo: Carro - " + carro.getNumPortas() + " portas");
        carro.acelerar();

        Moto moto = new Moto("Honda", "CB500", 500);
        System.out.println("Veículo: " + moto.getMarca() + " " + moto.getModelo());
        System.out.println("Tipo: Moto - " + moto.getCilindradas() + " cilindradas");
        moto.acelerar();
    }


}
