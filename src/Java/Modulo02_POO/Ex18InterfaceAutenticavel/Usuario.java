package Java.Modulo02_POO.Ex18InterfaceAutenticavel;

public class Usuario implements Autenticavel {
    private String nome;
    private String senhaCorreta;

    public Usuario(String nome, String senhaCorreta) {
        this.nome = nome;
        this.senhaCorreta = senhaCorreta;
    }

    @Override
    public boolean autenticar(String senha) {
        if (senhaCorreta.equals(senha)){
            return true;
        }
        return false;
    }
}
