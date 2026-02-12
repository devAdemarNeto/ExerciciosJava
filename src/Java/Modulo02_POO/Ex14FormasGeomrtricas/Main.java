package Java.Modulo02_POO.Ex14FormasGeomrtricas;

public class Main {
    public  static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Círculo (raio 5): Área = " + circulo.calcularArea());
        Quadrado quadrado = new Quadrado(4);
        System.out.println("Quadrado (lado 4): Área = " + quadrado.calcularArea());
        Triangulo triangulo = new Triangulo(6, 3);
        System.out.println("Triângulo (6x3): Área = " + triangulo.calcularArea());
    }
}
