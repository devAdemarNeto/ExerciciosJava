package Java.EstudosJava.LocalDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeApp {

    public static void main(String[] args) {

        //Combinação de data e hora


        //Instaciação
        //2023-06-25T16:25 -> data e hora sem segundo
        LocalDateTime dataHora = LocalDateTime.of(2023,6,25, 16,25);

        //2023-06-25T16:25:33 -> data e hora com segundo
        dataHora = LocalDateTime.of(2023,6,25, 16,25,33);

        //Manipulação
        LocalDateTime dataHora1 = LocalDateTime.of(2023,6,25, 16,25);

        LocalDateTime proximoMes = dataHora1.plusMonths(1);

        LocalDateTime dataHoraComMenos15Minutos = dataHora1.minusMinutes(15);

        LocalDateTime dataHoraDefinindoSegundoZero = dataHora1.withSecond(33);

        //Comparação:
        LocalDateTime dataHora2 = LocalDateTime.of(2023,6,25, 16,25);
        LocalDateTime dataHora3 = LocalDateTime.of(2023,6,25, 16,25,17);

        // comparando dois objetos data/hora em sua totalidade
        boolean dataHoraIgual = dataHora2.equals(dataHora3); //false

        //comparando dígito específico de uma data e hora
        boolean dataHoraDigitoIgual = dataHora2.getDayOfMonth()==dataHora3.getDayOfMonth(); //true

        //Formatação
        LocalDateTime dataHora4 = LocalDateTime.of(2023,7,22,17,33);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        String dataHoraFormatada = dataHora4.format(formatter);
        System.out.println(dataHoraFormatada); // 22/07/23 17:33:00




    }



}
