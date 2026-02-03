package Java.Modulo02_POO.RetanguloEx04;

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
