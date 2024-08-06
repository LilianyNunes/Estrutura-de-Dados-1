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

    void imprimir() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.info + " ");
            atual = atual.prox;
        }
        System.out.println();
    }

    Lista inverter() {
        Lista invertida = new Lista();
        No atual = this.cabeca;
        while (atual != null) {
            No novoNo = new No(atual.info);
            novoNo.prox = invertida.cabeca;
            invertida.cabeca = novoNo;
            invertida.tamanho++;
            atual = atual.prox;
        }
        return invertida;
    }

    Lista retornarImpares(Lista outra) {
        Lista impares = new Lista();
        No atual = this.cabeca;
        while (atual != null) {
            if (atual.info % 2 != 0) {
                impares.inserir(atual.info);
            }
            atual = atual.prox;
        }
        atual = outra.cabeca;
        while (atual != null) {
            if (atual.info % 2 != 0) {
                impares.inserir(atual.info);
            }
            atual = atual.prox;
        }
        return impares;
    }

    Lista concatena(Lista outra) {
        Lista concatenada = new Lista();
        No atual = this.cabeca;
        while (atual != null) {
            concatenada.inserir(atual.info);
            atual = atual.prox;
        }
        atual = outra.cabeca;
        while (atual != null) {
            concatenada.inserir(atual.info);
            atual = atual.prox;
        }
        return concatenada;
    }

    Lista interseccao(Lista outra) {
        Lista interseccao = new Lista();
        No atualL1 = this.cabeca;
        while (atualL1 != null) {
            No atualL2 = outra.cabeca;
            while (atualL2 != null) {
                if (atualL1.info == atualL2.info) {
                    interseccao.inserir(atualL1.info);
                    break;
                }
                atualL2 = atualL2.prox;
            }
            atualL1 = atualL1.prox;
        }
        return interseccao;
    }

    Lista intercalar1(Lista outra) {
        Lista intercalada = new Lista();
        No atualL1 = this.cabeca;
        No atualL2 = outra.cabeca;
        while (atualL1 != null || atualL2 != null) {
            if (atualL1 != null) {
                intercalada.inserir(atualL1.info);
                atualL1 = atualL1.prox;
            }
            if (atualL2 != null) {
                intercalada.inserir(atualL2.info);
                atualL2 = atualL2.prox;
            }
        }
        return intercalada;
    }

    Lista intercalar2(Lista outra) {
        Lista intercalada = new Lista();
        No atualL1 = this.cabeca;
        No atualL2 = outra.cabeca;
        while (atualL1 != null) {
            intercalada.inserir(atualL1.info);
            atualL1 = atualL1.prox;
        }
        while (atualL2 != null) {
            intercalada.inserir(atualL2.info);
            atualL2 = atualL2.prox;
        }

        Lista ordenada = new Lista();
        No atual = intercalada.cabeca;
        while (atual != null) {
            ordenada.inserir(atual.info);
            atual = atual.prox;
        }
        return ordenada;
    }
}
