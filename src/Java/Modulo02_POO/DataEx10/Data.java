package Java.Modulo02_POO.DataEx10;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // === GETTERS ===
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // === SETTERS COM VALIDAÇÃO ===

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Erro: Ano inválido!");
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Erro: Mês inválido! (deve ser 1-12)");
        }
    }

    public void setDia(int dia) {
        // Primeiro verifica se o mês já foi definido
        if (this.mes == 0) {
            System.out.println("Erro: Defina o mês primeiro!");
            return;
        }

        // Verifica quantos dias o mês tem
        int diasNoMes = obterDiasDoMes(this.mes);

        if (dia >= 1 && dia <= diasNoMes) {
            this.dia = dia;
        } else {
            System.out.println("Erro: Dia inválido! (máximo " + diasNoMes + " para este mês)");
        }
    }

    // Método auxiliar para saber quantos dias tem cada mês
    private int obterDiasDoMes(int mes) {
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; // Simplificado (sem ano bissexto)
            default:
                return 0;
        }
    }

    // Método para exibir a data formatada
    public void exibirFormatada() {
        // Formata com zeros à esquerda: DD/MM/AAAA
        System.out.printf("%02d/%02d/%04d%n", dia, mes, ano);
    }
}
