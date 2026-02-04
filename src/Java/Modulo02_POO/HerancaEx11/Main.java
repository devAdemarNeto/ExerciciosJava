package Java.Modulo02_POO.HerancaEx11;

public class Main {
    public static void main(String[] args) {
        // Criando um cachorro
        Cachorro cachorro = new Cachorro("Rex", 5);
        System.out.println(cachorro.getNome() + " (" + cachorro.getIdade() + " anos):");
        cachorro.emitirSom();

        System.out.println();

        // Criando um gato
        Gato gato = new Gato("Mimi", 3);
        System.out.println(gato.getNome() + " (" + gato.getIdade() + " anos):");
        gato.emitirSom();
    }
}
