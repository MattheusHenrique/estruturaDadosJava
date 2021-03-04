package estruturadados;

public class Arvore<TIPO extends Comparable> {
    private NoArvore<TIPO> raiz;

    public Arvore() {
        this.raiz = null;
    }

    public NoArvore<TIPO> getRaiz() {
        return this.raiz;
    }

    public boolean isEmpty() {
        if (this.raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionar(TIPO valor) {
        NoArvore<TIPO> novoNo = new NoArvore<TIPO>(valor);
        if (this.raiz == null) {
            this.raiz = novoNo;
        } else {
            NoArvore<TIPO> atual = this.raiz;
            while (true) {
                if (novoNo.getValor().compareTo(atual.getValor()) == -1) {
                    if (atual.getEsquerda() != null) {
                        atual = atual.getEsquerda();
                    } else {
                        atual.setEsquerda(novoNo);
                        break;
                    }
                } else {// se for maior ou igual
                    if (atual.getDireita() != null) {
                        atual = atual.getDireita();
                    } else {
                        atual.setDireita(novoNo);
                        break;
                    }
                }
            }
        }
    }

    public void emOrdem(NoArvore<TIPO> atual) {
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.println(atual.getValor());
            emOrdem(atual.getDireita());
        }
    }

    public void preOrdem(NoArvore<TIPO> atual) {
        if (atual != null) {
            System.out.println(atual.getValor());
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void posOrdem(NoArvore<TIPO> atual) {
        if (atual != null) {
            posOrdem(atual.getEsquerda());
            posOrdem(atual.getDireita());
            System.out.println(atual.getValor());
        }
    }

    public void maiorValor() {
        NoArvore<TIPO> atual = this.raiz;
        while (true) {
            if (atual.getDireita() != null) {
                atual = atual.getDireita();
            } else {
                System.out.println("O maior valor da arvore e: " + atual.getValor());
                break;
            }
        }
    }

    public void menorValor() {
        NoArvore<TIPO> atual = this.raiz;
        while (true) {
            if (atual.getEsquerda() != null) {
                atual = atual.getEsquerda();
            } else {
                System.out.println("O menor valor da arvore e: " + atual.getValor());
                break;
            }
        }
    }

    public NoArvore<TIPO> achaNo(TIPO valor) {
        NoArvore<TIPO> atual = this.raiz;
        while (!atual.getValor().equals(valor)) {
            if (atual.getValor().compareTo(valor) != -1) {
                if (atual.getEsquerda() != null) {
                    atual = atual.getEsquerda();
                }
            } else {// se for maior ou igual
                if (atual.getDireita() != null) {
                    atual = atual.getDireita();
                }
            }
        }
        return atual;
    }

    public boolean temFilhoEsquerda(NoArvore<TIPO> no) {
        if (no.getEsquerda() == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean temFilhoDireita(NoArvore<TIPO> no) {
        if (no.getDireita() == null) {
            return false;
        } else {
            return true;
        }
    }

    public boolean folha(NoArvore<TIPO> no) {
        if (temFilhoDireita(no) && temFilhoEsquerda(no)) {
            return false;
        } else {
            return true;
        }
    }

    /*
     * public boolean removeNo(TIPO removido) { // realiza a busca NoArvore<TIPO>
     * atual = this.raiz; NoArvore<TIPO> paiAtual = null; while (atual != null) { if
     * (atual.getValor().equals(removido)) { break; } else if
     * (removido.compareTo(atual.getValor()) == -1) { paiAtual = atual; atual =
     * atual.getEsquerda(); } paiAtual = atual; atual = atual.getDireita(); }
     * 
     * }
     */

}
