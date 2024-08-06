
class ListaEncadeada {
    No cabeca;

    ListaEncadeada() {
        this.cabeca = null;
    }

    void adicionar(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }

    int contarDigito(int K) {
        return contarDigitoRecursivo(cabeca, K);
    }

    private int contarDigitoRecursivo(No no, int K) {
        if (no == null) {
            return 0;
        }
        int contagem = (no.dado == K) ? 1 : 0;
        return contagem + contarDigitoRecursivo(no.proximo, K);
    }
}
