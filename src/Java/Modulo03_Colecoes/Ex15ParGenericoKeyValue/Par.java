package Java.Modulo03_Colecoes.Ex15ParGenericoKeyValue;

public class Par <K, V>{
    private K chave;
    private V valor;

    public Par(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public K getChave() {
        return chave;
    }

    public V getValor() {
        return valor;
    }

    public void exibir(){
        System.out.println("Chave: " + getChave() + " - Valor: " + getValor());
    }
}
