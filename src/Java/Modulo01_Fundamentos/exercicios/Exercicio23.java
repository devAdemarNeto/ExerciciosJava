package Java.Modulo01_Fundamentos.exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercício 23 - Gerador de Senhas
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo Gerar senhas aleatórias com critérios específicos.
 **/

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // === STRINGS COM OS CARACTERES DISPONÍVEIS ===
        String maiusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String especiais = "!@#$%&*()-_=+";

        // === PASSO 1: Pedir o tamanho da senha ===
        System.out.print("Tamanho da senha: ");
        int tamanho = sc.nextInt();
        sc.nextLine(); // limpa o buffer do teclado

        // === PASSO 2: Perguntar quais tipos de caracteres incluir ===
        System.out.print("Incluir maiúsculas? (S/N): ");
        String respMaiusculas = sc.nextLine();

        System.out.print("Incluir minúsculas? (S/N): ");
        String respMinusculas = sc.nextLine();

        System.out.print("Incluir números? (S/N): ");
        String respNumeros = sc.nextLine();

        System.out.print("Incluir especiais? (S/N): ");
        String respEspeciais = sc.nextLine();

        // === PASSO 3: Montar a string com os caracteres permitidos ===
        // Começamos com uma string vazia e adicionamos conforme as respostas
        String caracteresPermitidos = "";

        // Se o usuário respondeu "S" ou "s", adiciona os caracteres
        if (respMaiusculas.equalsIgnoreCase("S")) {
            caracteresPermitidos += maiusculas;
        }
        if (respMinusculas.equalsIgnoreCase("S")) {
            caracteresPermitidos += minusculas;
        }
        if (respNumeros.equalsIgnoreCase("S")) {
            caracteresPermitidos += numeros;
        }
        if (respEspeciais.equalsIgnoreCase("S")) {
            caracteresPermitidos += especiais;
        }

        // === VALIDAÇÃO: Verificar se pelo menos um tipo foi selecionado ===
        if (caracteresPermitidos.isEmpty()) {
            System.out.println("Erro: Selecione pelo menos um tipo de caractere!");
            sc.close();
            return;
        }

        // === PASSO 4: Gerar a senha aleatoriamente ===
        // StringBuilder é mais eficiente para concatenar muitos caracteres
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanho; i++) {
            // Gera um índice aleatório dentro da string de caracteres permitidos
            int indiceAleatorio = random.nextInt(caracteresPermitidos.length());

            // Pega o caractere naquele índice e adiciona à senha
            char caractere = caracteresPermitidos.charAt(indiceAleatorio);
            senha.append(caractere);
        }

        // === PASSO 5: Exibir a senha gerada ===
        System.out.println("\n=== SENHA GERADA ===");
        System.out.println("Senha: " + senha.toString());
        System.out.println("Tamanho: " + tamanho + " caracteres");

        sc.close();
    }
}
