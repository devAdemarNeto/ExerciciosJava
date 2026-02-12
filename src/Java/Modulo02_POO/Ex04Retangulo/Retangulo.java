package Java.Modulo02_POO.Ex04Retangulo;

public class Retangulo {
    double largura;
    double altura;


    public double calcularArea(){
        return this.largura * this.altura;
    }

    public double calcularPerimetro(){
        return 2 * (this.largura + this.altura);
    }
}
