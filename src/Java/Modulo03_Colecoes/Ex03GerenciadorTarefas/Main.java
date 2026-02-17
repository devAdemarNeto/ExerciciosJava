package Java.Modulo03_Colecoes.Ex03GerenciadorTarefas;



import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        int opcao;
        String descricao;


        do {
            System.out.println("=== Lista de tarefas ===");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Marcar como Concluida");
            System.out.println("3. Listar Pendentes");
            System.out.println("4. Remover Tarefa");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao){
                case 1:
                    System.out.println("Informe a descrição da tarefa");
                    String nome = sc.nextLine();
                    boolean status = false;
                    Tarefa novaTarefa = new Tarefa(nome,status);
                    tarefas.add(novaTarefa);
                    break;

                case 2:
                    System.out.println("Informa tarefa que você quer concluir: ");
                    descricao = sc.nextLine();
                    boolean encontrada = false;

                    for (Tarefa t : tarefas){
                        if (t.getDescricao().equals(descricao)){
                            t.setConcluida(true);
                            encontrada = true;
                            System.out.println("Tarefa concluida!");
                            break;
                        }
                    }
                    if (encontrada == false){
                        System.out.println("Tarefa não encontrada!");
                    }
                    break;


                case 3:
                    if (tarefas.isEmpty()){
                        System.out.println("A lista está vazia");
                    }else {
                        System.out.println("Tarefas Pendentes");
                        for (Tarefa t : tarefas){
                            if (t.getConcluida() == false){
                                t.exibirTarefa();
                            }
                        }

                        System.out.println("Tarefas concluidas ");
                        for (Tarefa t : tarefas){
                            if (t.getConcluida() == true){
                                t.exibirTarefa();
                            }
                        }
                    }
                    break;


                case 4:
                    System.out.println("Informa tarefa que você quer remover: ");
                    descricao = sc.nextLine();
                    encontrada = false;
                    for (Tarefa t : tarefas){
                        if (t.getDescricao().equals(descricao)){
                            encontrada = true;
                            tarefas.remove(t);
                            break;
                        }
                    }
                    if (encontrada == false){
                        System.out.println("Tarefa não encontrada!");
                    }
                    break;


                case 0:
                    System.out.println("Você selecionou a opção: SAIR");
                    break;

                default:
                    System.out.println("Opção incorreta");
                    System.out.println("Saindo...");

            }

        }while (opcao !=0);
        System.out.println("Encerrando sistema...");

        sc.close();

    }

}
