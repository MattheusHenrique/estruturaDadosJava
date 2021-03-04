package estruturadados;

public class No<TIPO> {
    private TIPO valor;
    private No<TIPO> proximo;

    public No(TIPO novoValor){
        this.valor = novoValor;
    }

    public TIPO getValor(){
       return this.valor;
    }

    public No<TIPO> getProximo(){
        return this.proximo;
     }

     public void setValor(TIPO valor){
        this.valor = valor;
     }
 
     public void setProximo(No<TIPO> proximo){
         this.proximo = proximo;
      }

}
