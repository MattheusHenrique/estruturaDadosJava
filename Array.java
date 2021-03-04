package estruturadados;

/*O pacote java.util.ArrayList traz as funçoes nativas de arrays
duvidas buscar documentaçao oficial
*/

public class Array {
    private Object[] elementos;
    private int tamanho;

    public Array(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    public void print() {
        for (int i = 0; i < this.elementos.length; i++) {
            System.out.println(this.elementos[i]);
        }
    }

    // pouco otimizado
    public void addBad(Object elemento) {
        for (int i = 0; i < this.elementos.length; i++) {
            if (this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }

    public void addInPosition(int posicao, Object elemento) {
        increase();
        positionValidation(posicao);
        for (int i = this.tamanho; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
    }

    public void remove(int posicao) {
        if (positionValidation(posicao))
            ;
        for (int i = posicao; i <= tamanho; i++) {
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public void removeElement(Object elemento) {
        int posicao;
        for (posicao = 0; posicao <= this.tamanho; posicao++) {
            if (this.elementos[posicao].equals(elemento)) {
                break;
            }
        }
        remove(posicao);
    }

    private boolean positionValidation(int posicao) {
        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posiçao invalida");
        }
        return true;
    }

    // Funcional
    // Procura elemento na posiçao expecificada
    // Se a posicao estiver null ou for maior que o tamanho devolve exception
    public Object findInPosition(int posicao) {
        if (!positionValidation(posicao));
        return this.elementos[posicao];
    }

    // Busca se o elemento existe no vetor e devolve a posicao
    // Se nao existir devolve -1
    // Busca de forma sequencial
    // Problema: devolve o primeiro elemento encontrado
    // e nao verifica se existem mais
    public int findPosition(Object elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            // Nao pode comparar diretamente por ser um objeto
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public boolean add(Object elemento) {
        increase();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    private void increase() {
        if (this.tamanho == this.elementos.length) {
            Array novoArray = new Array(this.elementos.length * 2);
            for (int i = 0; i < this.tamanho; i++) {
                novoArray.elementos[i] = this.elementos[i];
            }
            this.elementos = novoArray.elementos;
        }
    }

    public int size() {
        return this.tamanho;
    }

}