package Java.Modulo02_POO.Ex12Veiculos;

public class Carro extends Veiculo{
    private int numPortas;

    public Carro(String marca, String modelo, int numPortas) {
        super(marca, modelo);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
}
