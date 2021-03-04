package estruturadados;

public class testeArvore {
    
    public static void main(String[] args) {
        Arvore<Integer> arvore = new Arvore<Integer>();
        if(arvore.isEmpty()){
            System.out.println("Arvore vazia");
        }
        
        arvore.adicionar(10);
        arvore.adicionar(5);
        arvore.adicionar(-1);
        arvore.adicionar(53);
        arvore.adicionar(4);
        arvore.adicionar(6);

    }
}
