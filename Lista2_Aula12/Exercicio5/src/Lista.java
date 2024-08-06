class Lista {
    No cabeca;
    int tamanho;

    Lista() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    boolean estaVazia() {
        return cabeca == null;
    }

    void inserir(int info) {
        No novoNo = new No(info);
        if (cabeca == null || cabeca.info >= info) {
            novoNo.prox = cabeca;
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.prox != null && atual.prox.info < info) {
                atual = atual.prox;
            }
            novoNo.prox = atual.prox;
            atual.prox = novoNo;
        }
        tamanho++;
    }

    void remover(int info) {
        if (cabeca == null) return;
        if (cabeca.info == info) {
            cabeca = cabeca.prox;
            tamanho--;
            return;
        }
        No atual = cabeca;
        while (atual.prox != null && atual.prox.info != info) {
            atual = atual.prox;
        }
        if (atual.prox != null) {
            atual.prox = atual.prox.prox;
            tamanho--;
        }
    }

    int tamanho() {
        return tamanho;
    }

    boolean iguais(Lista outra) {
        if (this.tamanho != outra.tamanho) return false;
        No atual1 = this.cabeca;
        No atual2 = outra.cabeca;
        while (atual1 != null) {
            if (atual1.info != atual2.info) return false;
            atual1 = atual1.prox;
            atual2 = atual2.prox;
        }
        return true;
    }

    double media() {
        if (cabeca == null) return 0;
        int soma = 0;
        int contagem = 0;
        No atual = cabeca;
        while (atual != null) {
            soma += atual.info;
            contagem++;
            atual = atual.prox;
        }
        return (double) soma / contagem;
    }

    boolean busca(int info) {
        No atual = cabeca;
        while (atual != null) {
            if (atual.info == info) return true;
            atual = atual.prox;
        }
        return false;
    }

    void elimina(int info) {
        while (cabeca != null && cabeca.info == info) {
            cabeca = cabeca.prox;
            tamanho--;
        }
        No atual = cabeca;
        while (atual != null && atual.prox != null) {
            if (atual.prox.info == info) {
                atual.prox = atual.prox.prox;
                tamanho--;
            } else {
                atual = atual.prox;
            }
        }
    }

    void eliminaPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) return;
        if (posicao == 0) {
            cabeca = cabeca.prox;
            tamanho--;
            return;
        }
        No atual = cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.prox;
        }
        atual.prox = atual.prox.prox;
        tamanho--;
    }

    void insereDireita(int posicao, int info) {
        if (posicao < 0 || posicao >= tamanho) return;
        No novoNo = new No(info);
        No atual = cabeca;
        for (int i = 0; i < posicao; i++) {
            atual = atual.prox;
        }
        novoNo.prox = atual.prox;
        atual.prox = novoNo;
        tamanho++;
    }

    void insereEsquerda(int posicao, int info) {
        if (posicao < 0 || posicao >= tamanho) return;
        if (posicao == 0) {
            No novoNo = new No(info);
            novoNo.prox = cabeca;
            cabeca = novoNo;
            tamanho++;
            return;
        }
        No novoNo = new No(info);
        No atual = cabeca;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.prox;
        }
        novoNo.prox = atual.prox;
        atual.prox = novoNo;
        tamanho++;
    }
}
