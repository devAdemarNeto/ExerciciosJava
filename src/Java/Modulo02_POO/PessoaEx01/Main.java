package Java.Modulo02_POO.PessoaEx01;

public class Main {


    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Ademar";
        p1.idade = 38;
        p1.cpf = "00350302243";
        p1.apresentar();

        Pessoa p2 = new Pessoa();
        p2.nome = "Neto";
        p2.idade = 38;
        p2.cpf = "00350302243";
        p2.apresentar();
    }
}
