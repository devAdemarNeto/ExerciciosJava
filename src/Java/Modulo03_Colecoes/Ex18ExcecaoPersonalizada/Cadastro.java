package Java.Modulo03_Colecoes.Ex18ExcecaoPersonalizada;

public class Cadastro {
    String nome;
    int idade;

    public void definirIdade(int idade) throws  IdadeInvalidaException{
        if (idade < 18){
            throw new IdadeInvalidaException("Idade deve ser maior que 18 anos");
        }
    }
}
