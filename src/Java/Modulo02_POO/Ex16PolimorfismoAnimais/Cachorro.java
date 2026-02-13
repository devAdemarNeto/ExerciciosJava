package Java.Modulo02_POO.Ex16PolimorfismoAnimais;

public class Cachorro extends Animal{
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}
