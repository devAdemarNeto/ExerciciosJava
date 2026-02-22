package Java.Modulo03_Colecoes.Ex11CaixaGenerica;

public class Caixa<T> {
    private T conteudo;

    public void guardar(T item) {
        this.conteudo = item;
    }

    public T abri(){
        return conteudo;
    }





}
