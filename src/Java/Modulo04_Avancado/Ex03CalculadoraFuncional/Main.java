package Java.Modulo04_Avancado.Ex03CalculadoraFuncional;

public class Main {

    public static void executar(double a, double b, Operacao op){
        System.out.println(op.calcular(a, b));

    }

    public static void main(String[] args) {
        Operacao soma = (a,b) -> a + b;
        Operacao subtracao = (a,b) -> a - b;
        Operacao divisao = (a,b) -> a / b;
        Operacao multiplicacao = (a,b) -> a * b;




        executar(10, 5, soma);
        executar(10, 5, subtracao);
        executar(10, 5, multiplicacao);
        executar(10, 5, divisao);



    }

}
