package Java.Modulo04_Avancado.Ex13AgendaDeEventos;



import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Evento> eventos = new ArrayList<>();
        int opcao;
        String nome;
        String local;
        int dia;
        int mes;
        int ano;
        int hora;
        int min;
        LocalDate hoje = LocalDate.now();
        boolean encontrado = false;

        do {
            System.out.println("=== Cadastro de Eventos ===");
            System.out.println("1. Cadastrar evento ");
            System.out.println("2. Listar eventos de hoje");
            System.out.println("3. Listar eventos da semana");
            System.out.println("4. Verificar se o evento já passou");
            System.out.println("5. Ver dias restantes");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o nome do evento:");
                    nome = sc.nextLine();
                    System.out.println("Digite o local do evento:");
                    local = sc.nextLine();
                    System.out.println("Digite o dia do eventos:");
                    dia = sc.nextInt();
                    System.out.println("Digite o mês do evento:");
                    mes = sc.nextInt();
                    System.out.println("Digite o ano do evento:");
                    ano = sc.nextInt();
                    System.out.println("Digite a hora do evento");
                    hora = sc.nextInt();
                    System.out.println("Digite os minutos do evento");
                    min = sc.nextInt();
                    LocalDate diaEvento = LocalDate.of(ano,mes,dia);
                    LocalTime horaEvento = LocalTime.of(hora,min);

                    Evento novoEvento = new Evento(nome,local,diaEvento,horaEvento);
                    eventos.add(novoEvento);
                    break;

                case 2:
                    System.out.println("Eventos de hoje:");
                    if (eventos.isEmpty()){
                        System.out.println("Não existem eventos cadastrados");
                    }else {
                        for (Evento e : eventos){
                            if (LocalDate.now().equals(e.getData())){
                                System.out.println(e.getNome() + e.getHora());
                            }

                        }
                    }
                    break;

                case 3:
                    System.out.println("Eventos da semana:");

                    hoje = LocalDate.now();
                    LocalDate semana = hoje.plusDays(7);
                    if (eventos.isEmpty()){
                        System.out.println("Não existem eventos cadastrados");
                    }else {
                        for (Evento e : eventos){
                            if (e.getData().isEqual(hoje) || e.getData().isAfter(hoje) && e.getData().isBefore(semana)){
                                System.out.println(e.getNome() + e.getHora());
                            }
                        }
                    }
                    break;


                case 4:
                    encontrado = false;
                    System.out.println("Digite o nome do evento:");
                    nome = sc.nextLine();
                    if (eventos.isEmpty()){
                        System.out.println("Não existem eventos cadastrados");
                    }else {
                        for (Evento e : eventos){
                            if (e.getNome().equals(nome)){
                                encontrado = true;
                                if (e.getData().isBefore(hoje)){
                                    System.out.println("O evento já passou");
                                }else {
                                    System.out.println("O evento ainda não aconteceu");
                                }
                            }
                        }
                    }

                    if (encontrado == false){
                        System.out.println("Pessoa não encontrada");
                    }
                    break;

                case 5:
                    encontrado = false;
                    System.out.println("Digite o nome do evento:");
                    nome = sc.nextLine();
                    if (eventos.isEmpty()){
                        System.out.println("Não existem eventos cadastrados");
                    }else {
                        for (Evento e : eventos){
                            if (e.getNome().equals(nome)){
                                encontrado = true;
                                long falta = ChronoUnit.DAYS.between(hoje,e.getData());
                                System.out.println("Faltam " + falta + " para o evento");
                            }
                        }
                    }

                    if (encontrado == false){
                        System.out.println("Pessoa não encontrada");
                    }
                    break;


            }

        }while (opcao != 0);
        System.out.println("Encerrando Sistema");



        sc.close();
    }
}
