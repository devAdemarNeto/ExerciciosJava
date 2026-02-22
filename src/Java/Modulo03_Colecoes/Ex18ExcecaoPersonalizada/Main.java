package Java.Modulo03_Colecoes.Ex18ExcecaoPersonalizada;

public class Main {
    public static void main(String[] args) {

        Cadastro aluno1 = new Cadastro();
        aluno1.nome = "Neto";
        aluno1.idade = 15;
        Conta contaAluno1 = new Conta();
        contaAluno1.saldo = 100;

        try {
            aluno1.definirIdade(aluno1.idade);
        }catch (IdadeInvalidaException e){
            System.out.println(e.getMessage());

        }

        try {
            contaAluno1.sacar(150);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}
