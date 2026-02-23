package Java.Modulo03_Colecoes.Ex20SistemaDeCadastroCompleto;

import Java.Modulo03_Colecoes.Ex14OrdenacaoMultipla.Funcionario;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int opcao;
        boolean valido = false;
        String nome;
        String cpf;
        int idade = 0;
        boolean encontrado = false;
        int novaIdade;
        String novoNome;

        do{
            System.out.println("=== Cadastro ===");
            System.out.println("1. Cadastrar ");
            System.out.println("2. Listar todas");
            System.out.println("3. Buscar por CPF");
            System.out.println("4. Alterar Dados");
            System.out.println("5. Excluir");
            System.out.println("6. Ordernar por nome");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    valido = false;
                    System.out.println("Informe nome: ");
                    nome = sc.nextLine();
                    System.out.println("Informe CPF: ");
                    cpf = sc.nextLine();

                    while (valido == false){
                        try {
                            System.out.println("Informe a idade: ");
                            idade = sc.nextInt();
                            valido = true;
                        }catch (InputMismatchException e){
                            sc.nextLine();
                            System.out.println("Entrada invalida!!");
                        }
                    }
                    Pessoa novaPessoa = new Pessoa(nome,cpf,idade);
                    pessoas.add(novaPessoa);
                    break;



                case 2:
                    System.out.println("Pessoas cadastradas");
                    if (pessoas.isEmpty()){
                        System.out.println("Não existem pessoas cadastradas");
                    }else {
                        for (Pessoa p : pessoas){
                            System.out.println("Nome: " + p.getNome() + "- CPF: " + p.getCpf() + "- Idade: " + p.getIdade());
                        }
                    }
                    break;

                case 3:
                    encontrado = false;
                    System.out.println("Informe CPF:");
                    cpf = sc.nextLine();
                    for (Pessoa p : pessoas){
                        if (p.getCpf().equals(cpf)){
                            encontrado = true;
                            System.out.println("Nome: " + p.getNome() + "- CPF: " + p.getCpf() + "- Idade: " + p.getIdade());
                            break;
                        }
                    }

                    if (encontrado == false){
                        System.out.println("Pessoa não encontrada");
                    }
                    break;


                case 4:
                    encontrado = false;
                    System.out.println("Informe CPF:");
                    cpf = sc.nextLine();
                    for (Pessoa p : pessoas){
                        if (p.getCpf().equals(cpf)){
                            encontrado = true;
                            System.out.println("O que deseja alterar? ");
                            System.out.println("1. Nome");
                            System.out.println("2. Idade");
                            System.out.println("3. Ambos");
                            opcao = sc.nextInt();
                            sc.nextLine();
                            switch (opcao){
                                case 1:
                                    System.out.println("Digite o novo nome: ");
                                    novoNome = sc.nextLine();
                                    p.setNome(novoNome);
                                    System.out.println("Dados alterados com sucesso!");
                                    break;

                                case 2:
                                    System.out.println("Digite a nova idade: ");
                                    novaIdade = sc.nextInt();
                                    p.setIdade(novaIdade);
                                    System.out.println("Dados alterados com sucesso!");
                                    break;

                                case 3:
                                    System.out.println("Digite o novo nome: ");
                                    novoNome = sc.nextLine();
                                    p.setNome(novoNome);
                                    System.out.println("Digite a nova idade: ");
                                    novaIdade = sc.nextInt();
                                    p.setIdade(novaIdade);
                                    System.out.println("Dados alterados com sucesso!");
                                    break;
                            }
                            break;

                        }
                    }

                    if (encontrado == false){
                        System.out.println("Pessoa não encontrada");
                    }
                    break;

                case 5:
                    encontrado = false;
                    System.out.println("Informe CPF:");
                    cpf = sc.nextLine();
                    for (Pessoa p : pessoas){
                        if (p.getCpf().equals(cpf)){
                            encontrado = true;
                            pessoas.remove(p);
                            System.out.println("Pessoa removida com sucesso!!");
                            break;
                        }
                    }

                    if (encontrado == false){
                        System.out.println("Pessoa não encontrada");
                    }
                    break;

                case 6:
                    Collections.sort(pessoas,(a,b) -> a.getNome().compareTo(b.getNome()));
                    int cont = 1;
                    for (Pessoa p : pessoas){
                        System.out.println(cont + ". Nome: " + p.getNome() + " - CPF: " + p.getCpf() + p.getIdade() + " anos" );
                        cont++;
                    }

                    break;







            }

        }while (opcao != 0);
        System.out.println("Encerrando Sistema");
        sc.close();

    }
}
