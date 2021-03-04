package estruturadados;

public class NoArvore<TIPO> {
    private TIPO valor;
    private NoArvore<TIPO> esquerda;
    private NoArvore<TIPO> direita;

    public NoArvore(TIPO novoValor) {
        this.valor = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public TIPO getValor() {
        return this.valor;
    }

    public void setValor(TIPO valor) {
        this.valor = valor;
    }

    public NoArvore<TIPO> getEsquerda() {
        return this.esquerda;
    }

    public void setEsquerda(NoArvore<TIPO> novoValor) {
        this.esquerda = novoValor;
    }

    public NoArvore<TIPO> getDireita() {
        return this.direita;
    }

    public void setDireita(NoArvore<TIPO> novoValor) {
        this.direita = novoValor;
    }

}
