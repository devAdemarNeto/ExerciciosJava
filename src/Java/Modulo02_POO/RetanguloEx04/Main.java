package Java.Modulo02_POO.RetanguloEx04;



public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.altura = 5.0;
        retangulo1.largura = 3.0;

        System.out.println("Retângulo: " + " " + retangulo1.largura + " x " + retangulo1.altura);
        System.out.println("Área: " + retangulo1.calcularArea());
        System.out.println("Perímetro: " + retangulo1.calcularPerimetro());

    }
}
