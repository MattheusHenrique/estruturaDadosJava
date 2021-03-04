package estruturadados;

public class filaDinamica<TIPO> extends listaLigada<TIPO> {
    
    public filaDinamica() {
        this.tamanho = 0;
    }

    public void enQueue(TIPO novoValor) {
        super.add(novoValor);
    }

    public void deQueue(){
        No<TIPO> atual = null;
        if(this.primeiro == this.ultimo){
            this.primeiro = null;
            this.ultimo = null;
        }else{
            atual = this.primeiro.getProximo();
            this.primeiro = atual;
        }
    }


}
