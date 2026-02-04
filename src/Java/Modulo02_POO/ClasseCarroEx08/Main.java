package Java.Modulo02_POO.ClasseCarroEx08;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Fiat");
        carro.setModelo("Uno");
        carro.setAno(2020);
        carro.setVelocidadeAtual(0);

        carro.informacoesCarro();
        carro.acelerar(50);
        carro.frear(30);
        carro.buzinar();


    }
}
