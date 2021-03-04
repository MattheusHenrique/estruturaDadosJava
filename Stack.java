package estruturadados;

//LIFO: last in first out
public class Stack<T> extends estruturaEstatica<T> {

    public Stack() {
        super();

    }

    public Stack(int capacidade) {
        super(capacidade);
    }

    public boolean stackIsEmpty() {
        return super.isEmpty();
    }

    public void printStack() {
        super.print();
    }

    public void push(T elemento) {
        super.add(elemento);
    }

    public T pop(){
        if(stackIsEmpty()){
            return null;
        }
        return this.elementos[--tamanho];
    }

    public T lastElement() {
        if (stackIsEmpty()) {
            return null;
        }
        return this.elementos[this.tamanho - 1];
    }

}
