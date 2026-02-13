package Java.Modulo02_POO.Ex18InterfaceAutenticavel;

public class Admin implements Autenticavel{

    private String nome;
    private String senhaCorreta;
    private String tokenCorreto;

    public Admin(String nome, String senhaCorreta, String tokenCorreto) {
        this.nome = nome;
        this.senhaCorreta = senhaCorreta;
        this.tokenCorreto = tokenCorreto;
    }

    @Override
    public boolean autenticar(String senha) {
        if (senhaCorreta.equals(senha)){
            return true;
        }
        return false;
    }

    public boolean autenticarComToken(String senha, String token){
        if (senhaCorreta.equals(senha) && tokenCorreto.equals(token)){
            return true;
        }
        return false;
    }
}
