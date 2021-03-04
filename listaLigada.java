package estruturadados;

public class listaLigada<TIPO>{
    protected No<TIPO> primeiro;
    protected No<TIPO> ultimo;
    protected int tamanho;

    public listaLigada() {
        this.tamanho = 0;
    }

    public No<TIPO> getPrimeiro() {
        return primeiro;
    }

    public No<TIPO> getUltimo() {
        return ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setPrimeiro(No<TIPO> primeiro) {
        this.primeiro = primeiro;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setUltimo(No<TIPO> ultimo) {
        this.ultimo = ultimo;
    }

    public boolean isEmpty(){
        if(this.primeiro == null){
            return true;
        }
        return false;
    }

    public void add(TIPO novoValor) {
        No<TIPO> novoNo = new No<TIPO>(novoValor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoNo;
            this.ultimo = novoNo;
        } else {
            this.ultimo.setProximo(novoNo);
            this.ultimo = novoNo;
            //novoNo.setProximo(this.primeiro) criar circular
        }
        this.tamanho++;
    }

    public void remove(TIPO valorProcurado) {
        No<TIPO> anterior = null;
        No<TIPO> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valorProcurado)) {
                if (atual == this.primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                    tamanho--;
                    break;
                }
                if (atual == this.ultimo){
                    this.ultimo = anterior;
                    tamanho--;
                    break;
                }
                anterior.setProximo(atual.getProximo());
                tamanho--;
                atual = null;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }

    }

    public No<TIPO> posicao(int posicao) {
        No<TIPO> atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }
}
