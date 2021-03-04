package estruturadados;

public class TestaFila {
    public static void main(String[] args) {
        Queue<Integer> fila = new Queue<Integer>();
        fila.enQueue(1);
        fila.enQueue(3);
        fila.enQueue(4);
        fila.deQueue();
        fila.printQueue();
        System.out.println(fila.firstElement());

    }
    
}
