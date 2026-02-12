package Java.EstudosJava.LocalDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalDateApp {
    public static void main(String[] args) {
        //Determina data atual conforme o sistema, em formato americano
        LocalDate dataAtual = LocalDate.now();
        System.out.println(dataAtual);


        //determina data especifica, formato americano
        LocalDate netoNiver = LocalDate.of(2026,5,26);
        System.out.println(netoNiver);
        LocalDate netoNiver2 = LocalDate.of(2026, Month.MAY,26); // Com mês como constante
        System.out.println(netoNiver2);

        //Converter uma string para uma data
        // quando é convertido para obj data ele consegue utilizar os metodos
        String dataStr = "2026-02-05";
        LocalDate data = LocalDate.parse(dataStr);
        System.out.println(data);
        System.out.println(dataStr);


        //Formatar data, formatando para o padrão americano
        String stringDataBr = "17/01/2023";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConcreta = LocalDate.parse(stringDataBr,formatter);
        System.out.println(dataConcreta);


        //Manipulação de data
        LocalDate aniverNeto = LocalDate.of(2026,05,26);
        //Qual a idade após 15 anos
        LocalDate apos15anos = aniverNeto.plusYears(15);
        System.out.println(apos15anos);


        //Ex: compra
        LocalDate dataCompra = LocalDate.now();
        LocalDate dataVanc = dataCompra.plusYears(30);
        System.out.println("Data compra: "+ dataCompra);
        System.out.println("Data de vencimento: " + dataVanc);

        //Data e hora
        LocalDate agora = LocalDate.now();
        LocalTime tAgora = LocalTime.now();
        LocalDateTime dataHora = agora.atTime(tAgora);
        System.out.println(dataHora);

        //Coparação
        LocalDate data1 = LocalDate.of(2023,3,4);
        LocalDate data2 = LocalDate.of(2024,4,3);

        //data2 está após a data 1? true
        System.out.println(data2.isAfter(data1));

        //data2 está antes que data 1? flase
        System.out.println(data2.isBefore(data1));

        //data2 é igual a data 1? false
        System.out.println(data2.isEqual(data1));



        //Formatação se não passar o parametro, o default é o padrão americano
        LocalDate data3 = LocalDate.of(2023,1,13);

        DateTimeFormatter formatte = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // parametro que deseja formatar

        System.out.println(data3); //2023-01-13

        //formatando a data criada acima
        System.out.println(formatte.format(data)); //13/01/2023



        //Estilo de formatação
        LocalDate data4 = LocalDate.of(2023,1,13);

        String dataFormatada = data4.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));  //13 de janeiro de 2023
        dataFormatada = data4.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));  // 13 de jan. de 2023
        dataFormatada = data4.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));  // 13/01/2023
        dataFormatada = data4.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));  // sexta-feira, 13 de janeiro de 2023



        // Formatação por localidade Locale


        LocalDate data5 = LocalDate.of(2021,8,23);

        Locale[] locales = {Locale.CANADA, Locale.US, new Locale("fi","FI"),Locale.UK};

        for(Locale locale:locales){
            String dataFormatada1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
            System.out.println(dataFormatada1);
        }

        // 2021-08-23
        // 8/23/21
        // 23.8.2021
        // 23/08/2021



        //Dados especificos
        LocalDate data6 = LocalDate.of(2021,8,23);

        System.out.println(data6.getDayOfMonth());   // retorna o dia do mês -> 23
        System.out.println(data6.getYear());         // retorna o ano -> 2023
        System.out.println(data6.getMonth());        // retorna o elemento de enum java.time.Month -> AUGUST
        System.out.println(data6.getMonthValue());   // retorna o número do mês entre 1-12 -> 8






    }
}
