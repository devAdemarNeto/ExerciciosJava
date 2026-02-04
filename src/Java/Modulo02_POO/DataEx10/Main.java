package Java.Modulo02_POO.DataEx10;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        
        // Definir a data (ordem importa: ano, mês, depois dia)
        data.setAno(2024);
        data.setMes(8);
        data.setDia(15);
        
        System.out.println("Data criada:");
        data.exibirFormatada();
        
        System.out.println("\n--- Testando validações ---");
        
        // Tentando mês inválido
        System.out.println("\nTentando mês 13:");
        data.setMes(13);
        
        // Tentando dia inválido
        System.out.println("\nTentando dia 32:");
        data.setDia(32);
        
        // Testando fevereiro
        Data data2 = new Data();
        data2.setAno(2024);
        data2.setMes(2);  // Fevereiro
        System.out.println("\nTentando dia 30 em fevereiro:");
        data2.setDia(30);  // Deve falhar
        
        data2.setDia(28);  // Deve funcionar
        System.out.println("Data 2:");
        data2.exibirFormatada();
    }
}
