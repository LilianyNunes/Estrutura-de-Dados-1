class ListaCircularDuplamenteEncadeada{
    private Node sentinela;

    public ListaCircularDuplamenteEncadeada() {
        sentinela = new Node(0);
        sentinela.anterior = sentinela;
        sentinela.proximo = sentinela;
    }

    public void inserirOrdenado(int valor) {
        Node novo = new Node(valor);
        Node atual = sentinela.proximo;

        while (atual != sentinela && atual.valor < valor) {
            atual = atual.proximo;
        }

        novo.proximo = atual;
        novo.anterior = atual.anterior;
        atual.anterior.proximo = novo;
        atual.anterior = novo;
    }

    public void imprimirCrescente() {
        Node atual = sentinela.proximo;
        while (atual != sentinela) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirDecrescente() {
        Node atual = sentinela.anterior;
        while (atual != sentinela) {
            System.out.print(atual.valor + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }

    public void removerPrimos() {
        Node atual = sentinela.proximo;
        while (atual != sentinela) {
            if (ehPrimo(atual.valor)) {
                atual.anterior.proximo = atual.proximo;
                atual.proximo.anterior = atual.anterior;
            }
            atual = atual.proximo;
        }
    }

    private boolean ehPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
