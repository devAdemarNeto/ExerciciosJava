package Java.Modulo03_Colecoes.Ex09ControleEstoque;



import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> produto = new HashMap<>();
        int opcao;

        do {
            System.out.println("=== Controle de Estoque ===");
            System.out.println("1. Adicionar produto:");
            System.out.println("2. Dar entrada:");
            System.out.println("3. Dar saída:");
            System.out.println("4. Consultar estoque:");
            System.out.println("5. Listar produtos com estoque baixo");

            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Digite o nome d produto: ");
                    String nome = sc.nextLine();
                    System.out.println("Quantidade: ");
                    int quantidade = sc.nextInt();
                    produto.put(nome,quantidade);
                    System.out.println("Produto cadastrado com sucesso!!");
                    break;

                case 2:
                    System.out.println("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    if(produto.containsKey(nome)){
                        System.out.println("Quantidade a adicionar:");
                        int qtd = sc.nextInt();
                        int atual = produto.get(nome); // pega a quantidade atual
                        produto.put(nome, atual + qtd);
                        System.out.println("Estoque atualizado" + produto.get(nome));
                    }else{
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do produto: ");
                    nome = sc.nextLine();
                    if(produto.containsKey(nome)){
                        System.out.println("Quantidade a retirar:");
                        int qtd = sc.nextInt();
                        int atual = produto.get(nome); // pega a quantidade atual
                        if (qtd > atual){
                            System.out.println("Estoque insuficiente: " + atual);
                        }else{
                            produto.put(nome, atual - qtd);
                            System.out.println("Estoque atualizado" + produto.get(nome));
                        }

                    }else{
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 4:
                    System.out.println("Digite o nome do produto:");
                    nome = sc.nextLine();
                    if (produto.containsKey(nome)){
                        System.out.println(produto.get(nome));
                    }else {
                        System.out.println("Produto não encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Lista de produtos com estoque baixo: ");
                    for (String chave : produto.keySet()) {
                        if (produto.get(chave) < 5){
                            System.out.println("Produto: " + chave + " Quantidade: " + produto.get(chave));
                        }

                    }

                default:
                    System.out.println("Opção inválida!!");


            }

        }while (opcao != 0);
        System.out.println("Encerrando Sistema");



    }
}
