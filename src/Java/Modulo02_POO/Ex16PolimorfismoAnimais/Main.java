package Java.Modulo02_POO.Ex16PolimorfismoAnimais;

public class Main {
    public static void main(String[] args) {
        Animal[] animais = new Animal[4];
        animais[0] = new Cachorro("Rex");
        animais[1] = new Gato("Mimi");
        animais[2] = new Cachorro("Bob");
        animais[3] = new Gato("Luna");

        for (Animal a : animais) {
            a.emitirSom();  // Polimorfismo em ação!
        }
    }
}
