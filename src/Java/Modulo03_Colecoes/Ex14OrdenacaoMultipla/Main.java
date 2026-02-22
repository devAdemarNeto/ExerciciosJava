package Java.Modulo03_Colecoes.Ex14OrdenacaoMultipla;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ademar", 1900.00, 38));
        funcionarios.add(new Funcionario("Estela", 1630.00, 68));
        funcionarios.add(new Funcionario("Thayane", 1000.00, 32));
        funcionarios.add(new Funcionario("Cleoice", 1600.00, 80));
        funcionarios.add(new Funcionario("Reinaldo", 2600.00, 83));

        int opcao;


        do {
            System.out.println("Ordenar por: ");
            System.out.println("1. Nome");
            System.out.println("2. Salario");
            System.out.println("3. Idade");
            System.out.println("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();
            boolean encontrado = false;

            switch (opcao){

                case 1:

                    Collections.sort(funcionarios,(a,b) -> a.getNome().compareTo(b.getNome()));
                    System.out.println("Funcionarios por nome: ");
                    int cont = 1;
                    for (Funcionario f : funcionarios){
                        System.out.println(cont + "." + f.getNome() + " - " + f.getIdade() + " anos" + " R$: " + f.getSalario());
                        cont++;
                    }

                    break;

                case 2:
                    Collections.sort(funcionarios,(a,b) -> Double.compare(a.getSalario(), b.getSalario()));
                    System.out.println("Funcionarios por Salario: ");
                    cont = 1;
                    for (Funcionario f : funcionarios){
                        System.out.println(cont + "." + f.getNome() + " - " + f.getIdade() + " anos" + " R$: " + f.getSalario());
                        cont++;
                    }
                    break;

                case 3:
                    Collections.sort(funcionarios,(a,b) -> Integer.compare(a.getIdade(), b.getIdade()));
                    System.out.println("Funcionarios por Idade: ");
                    cont = 1;
                    for (Funcionario f : funcionarios){
                        System.out.println(cont + "." + f.getNome() + " - " + f.getIdade() + " anos" + " R$: " + f.getSalario());
                        cont++;
                    }
                    break;

            }

        }while (opcao !=0);
        System.out.println("Encerrando Sistema");

        sc.close();





    }


}
