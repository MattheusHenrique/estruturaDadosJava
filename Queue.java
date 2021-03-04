package estruturadados;

public class Queue<T> extends estruturaEstatica<T>{
    
    public Queue() {
        super();
    }

    public Queue(int capacidade) {
        super(capacidade);
    }

    public void printQueue(){
        super.print();
    }

    public boolean queueIsEmpty(){
        return super.isEmpty();
    }

    public boolean enQueue(T elemento){
        return super.add(elemento);
    }

    public T deQueue(){
        if(queueIsEmpty()){
            return null;
        }
        for(int i = 0; i < tamanho; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        return this.elementos[this.tamanho--];
    }

     public T firstElement(){
         if(queueIsEmpty()){
             return null;
         }
        return this.elementos[0];
     }

   
}
