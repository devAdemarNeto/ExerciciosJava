package Java.EstudosJava.LocalDate;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeApp {
    public static void main(String[] args) {
        // hora sem data

        //Utilizando o relogio do sitema
        LocalTime horaAtual = LocalTime.now();

        LocalTime horaMinutoSegundoEspecifico = LocalTime.of(13,21,42); // 13:21:42

        LocalTime horaMinutoEspecifico = LocalTime.of(13,21); // 13:21

        LocalTime horaDeUmaString = LocalTime.parse("13:21:42");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");
        LocalTime horaDeUmaStringDespadronizada = LocalTime.parse("132142", formatter); // 13:21:42


        //Manipulação

        LocalTime horaAtual2 = LocalTime.now();
        LocalTime horaAtualMais30Minutos = horaAtual2.plusMinutes(30);
        LocalTime horaAtualMenos2Horas = horaAtual2.minusHours(2);

        System.out.println(horaAtual2);
        System.out.println(horaAtualMais30Minutos);
        System.out.println(horaAtualMenos2Horas);

        //Comparação
        LocalTime horaAtual3 = LocalTime.now();
        LocalTime horaAtual3Menos2Horas = horaAtual.minusHours(2);

        boolean passado = horaAtual3.isBefore(horaAtualMenos2Horas);

        System.out.println(passado);



        //Formatação

        LocalTime hora = LocalTime.of(13,21,42);
        DateTimeFormatter formatte = DateTimeFormatter.ofPattern("ss-mm-HH");
        String horaFormatada = hora.format(formatte);
        System.out.println(horaFormatada); //42-21-13




        //Dados especificos

        LocalTime hora1 = LocalTime.of(13,21,42);

        System.out.println(hora1.getHour());     //13
        System.out.println(hora1.getMinute());   //21
        System.out.println(hora1.getSecond());   //42
        System.out.println(hora1.getNano());     //0


    }
}
