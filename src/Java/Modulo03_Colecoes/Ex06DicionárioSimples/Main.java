package Java.Modulo03_Colecoes.Ex06DicionárioSimples;




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> dicionario = new HashMap();
        int opcao;
        String palavra;



        do {
            System.out.println("=== Dicionário ===");
            System.out.println("1. Adicionar Palavra e siginificado");
            System.out.println("2. Buscar siginificado da palavra");
            System.out.println("3. listar todas as palavras");
            System.out.println("4. Remover palavra");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao){

                case 1:
                    System.out.println("Digite a palavra: ");
                    palavra = sc.nextLine();
                    System.out.println("Digite o significado: ");
                    String significado = sc.nextLine();
                    dicionario.put(palavra,significado);
                    System.out.println("Adicionado com sucesso!!");
                    break;

                case 2:
                    System.out.println("Digite a palavra");
                    palavra = sc.nextLine();
                    if (dicionario.containsKey(palavra)){
                        System.out.println(palavra + ": " + dicionario.get(palavra));
                    }else {

                        System.out.println("Palavra não encontrada!");
                    }
                    break;

                case 3:
                    System.out.println("=== Dicionário ===");
                    for (String chave : dicionario.keySet()){
                        System.out.println(chave + ": " + dicionario.get(chave));
                    }
                    break;

                case 4:
                    System.out.println("Digite a palavra: ");
                    palavra = sc.nextLine();
                    if (dicionario.isEmpty()){
                        System.out.println("Dicionário vazio");
                    }else {
                        String resultado = dicionario.remove(palavra);
                        System.out.println("Removido com sucesso");
                    }
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Numer inválido ");

            }

        }while (opcao !=0);
        System.out.println("Encerrando Sistema");
    }
}
