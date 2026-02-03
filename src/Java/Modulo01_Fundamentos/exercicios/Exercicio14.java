package Java.Modulo01_Fundamentos.exercicios;

import java.util.Scanner;

/**
 * Exercício 14 - Validação de Senha
 *
 * @author Ademar Neto
 * @date 29/01/2026
 * @objetivo  Validar senha com número limitado de tentativas.
 **/


public class Exercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senhaCorreta = "Zico10";
        String senhaDigitada;
        int tentativa = 3;
        boolean acessoLiberado = false;

        do{
            System.out.println("Digite a senha: ");
            senhaDigitada = sc.nextLine();

            if (senhaDigitada.equals(senhaCorreta)){
                System.out.println("Acesso liberado! Bem vindo");
                acessoLiberado = true;
            }else {
                tentativa--;
                System.out.println("Senha incorreta! Tentativas restantes: " + tentativa );

            }
        }while (tentativa > 0 && !acessoLiberado);


        if (!acessoLiberado){
            System.out.println("Conta bloqueada");
        }

        sc.close();
    }



}
