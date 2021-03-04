package estruturadados;

public class listaCircular<TIPO> extends listaLigada<TIPO>{
    private No<TIPO> primeiro;
    private No<TIPO> ultimo;
    private int tamanho;

    public listaCircular() {
        this.tamanho = 0;
    }

    public void add(TIPO novoValor) {
        No<TIPO> novoNo = new No<TIPO>(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
            novoNo.setProximo(getPrimeiro());
        }
        this.tamanho++;
    }
}
