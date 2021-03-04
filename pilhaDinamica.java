package estruturadados;

public class pilhaDinamica<TIPO> extends listaLigada<TIPO>{
    
    public pilhaDinamica() {
        this.tamanho = 0;
    }
    
    
    public void push(TIPO novoValor) {
        super.add(novoValor);
    }

    public void pop()  {
        No<TIPO> anterior = null;
        No<TIPO> atual = this.primeiro;
        for(int i = 0; i < this.getTamanho(); i++){
            if(this.primeiro == this.ultimo){
                this.primeiro = null;
                this.ultimo = null;
            }
            if (atual == this.ultimo){
                this.ultimo = anterior;
                tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
}
