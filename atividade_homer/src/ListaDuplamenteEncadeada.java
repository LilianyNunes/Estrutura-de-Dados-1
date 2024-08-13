class ListaDuplamenteEncadeada {
    private No inicio;
    private No fim;

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
    }

    // Método para inserir no final da lista
    public void inserir(int valor) {
        No novoNo = new No(valor);
        if (inicio == null) { // Lista vazia
            inicio = novoNo;
            fim = novoNo;
        } else { // Adiciona no final
            fim.proximo = novoNo;
            novoNo.anterior = fim;
            fim = novoNo;
        }
    }

    // Método para inserir em uma posição específica
    public void inserirNaPosicao(int valor, int posicao) {
        No novoNo = new No(valor);
        if (posicao == 0) { // Inserir no início
            if (inicio == null) {
                inicio = novoNo;
                fim = novoNo;
            } else {
                novoNo.proximo = inicio;
                inicio.anterior = novoNo;
                inicio = novoNo;
            }
        } else {
            No atual = inicio;
            int contador = 0;
            while (atual != null && contador < posicao - 1) {
                atual = atual.proximo;
                contador++;
            }
            if (atual == null || atual.proximo == null) {
                inserir(valor); // Insere no final se a posição for fora do intervalo
            } else {
                novoNo.proximo = atual.proximo;
                atual.proximo.anterior = novoNo;
                atual.proximo = novoNo;
                novoNo.anterior = atual;
            }
        }
    }

    // Método para exibir os valores da lista
    public void exibir() {
        No atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    // Método para remover um nó da lista
    public void remover(int valor) {
        No atual = inicio;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual.anterior != null) { // Remoção de um nó intermediário ou final
                    atual.anterior.proximo = atual.proximo;
                } else { // Remoção do primeiro nó
                    inicio = atual.proximo;
                }
                if (atual.proximo != null) { // Remoção de um nó intermediário
                    atual.proximo.anterior = atual.anterior;
                } else { // Remoção do último nó
                    fim = atual.anterior;
                }
                atual = null; // Liberar a memória do nó removido
                return;
            }
            atual = atual.proximo;
        }
    }

    // Método para esvaziar a lista
    public void esvaziar() {
        inicio = null;
        fim = null;
    }
}