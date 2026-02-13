package Java.Modulo02_POO.Ex18InterfaceAutenticavel;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ademar","123456@");
        if (usuario.autenticar("589456")) {
            System.out.println("Autenticação: SUCESSO");
        } else {
            System.out.println("Autenticação: FALHOU");
        }

        if (usuario.autenticar("123456@")) {
            System.out.println("Autenticação: SUCESSO");
        } else {
            System.out.println("Autenticação: FALHOU");
        }

        Admin admin = new Admin("Neto","123456","!@#$");
        if (admin.autenticarComToken("123456","!@#$")) {
            System.out.println("Admin Autenticação: SUCESSO");
        } else {
            System.out.println("Admin Autenticação: FALHOU");
        }

        if (admin.autenticarComToken("123456","!@oo")) {
            System.out.println("Admin Autenticação: SUCESSO");
        } else {
            System.out.println("Admin Autenticação: FALHOU");
        }
    }
}
