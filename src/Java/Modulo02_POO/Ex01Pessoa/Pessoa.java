package Java.Modulo02_POO.Ex01Pessoa;

public class Pessoa {
    String nome;
    int idade;
    String cpf;

    public void apresentar(){
        System.out.println("Olá, meu nome é " + this.nome + ", tenho " + this.idade + " anos, e meu CPF é "+ this.cpf);
    }
}
