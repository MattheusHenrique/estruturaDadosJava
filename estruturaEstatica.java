package estruturadados;

public class estruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho = 0;

    public boolean isEmpty(){
       return this.tamanho == 0;
    }

    public void print() {
        for (int i = 0; i < this.tamanho; i++) {
            System.out.println(this.elementos[i]);
        }
    }
    
    public estruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public estruturaEstatica(){
        this(10);
    }

    protected void increase() {
        if (this.tamanho == this.elementos.length) {
            T[] novoArray = (T[])new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                novoArray[i] = this.elementos[i];
            }
            this.elementos = novoArray;
        }
    }

    public int size() {
        return this.tamanho;
    }
    
    protected boolean add(T elemento) {
        increase();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean addInPosition(int posicao, T elemento) {
        increase();
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        return true;
    }

    
}
