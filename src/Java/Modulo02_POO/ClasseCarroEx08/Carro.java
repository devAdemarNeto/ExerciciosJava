package Java.Modulo02_POO.ClasseCarroEx08;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }


    public void acelerar(double valor){
        velocidadeAtual = velocidadeAtual + valor;
        System.out.println("Acelerando: "+ valor+ " Km/h");
        System.out.println("Velocidade atual: " + velocidadeAtual + " Km/h");
    }

    public void frear(double valor){
        if (velocidadeAtual - valor < 0) {
            velocidadeAtual = 0;  // Mínimo é 0
        } else {
            velocidadeAtual = velocidadeAtual - valor;
        }
        System.out.println("Freando: "+ valor+ " Km/h");
        System.out.println("Velocidade atual: " + velocidadeAtual + " Km/h");
    }

    public void buzinar(){
        System.out.println("Bi bi!!");
    }

    public void informacoesCarro(){
        System.out.println("Carro: " + " " + marca + " " + modelo + " " + ano);
        System.out.println("Velocidade: " + velocidadeAtual + " Km/h");
    }
}
