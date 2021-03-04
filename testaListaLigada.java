package estruturadados;

public class testaListaLigada {
    public static void main(String[] args) {
        filaDinamica<Integer> lista = new filaDinamica<Integer>();
        if(lista.isEmpty()){
            System.out.println("Pilha vazia");
        }
        lista.enQueue(1);
        lista.enQueue(2);
        lista.enQueue(4);
        lista.deQueue();
        lista.deQueue();
        lista.deQueue();
        if(lista.isEmpty()){
            System.out.println("Pilha vazia");
        }
          
      
        
    }
    
}
