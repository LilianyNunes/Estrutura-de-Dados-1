package atividade_fila_vetores;

public class Fila {
    int tamanho = 0;
    int[] elementos;
    int inicio;
    int fim;
    int quantidade;

    public void criarFila(int tamanhoMaximo) {
        this.tamanho = tamanhoMaximo;
        this.elementos = new int[tamanhoMaximo];
        this.inicio = 0;
        this.fim = -1;
        this.quantidade = 0;
    }
    public void destruirFila() {
        elementos = null;
    }    

    public boolean filaCheia() {
        return quantidade == tamanho;
    }

    public boolean filaVazia() {
        return quantidade == 0;
    }

    public void inserirElemento(int elemento) {
        if (filaCheia()) {
            System.out.println("Erro: A fila está cheia.");
            return;
        }
        fim = (fim + 1) % tamanho;
        elementos[fim] = elemento;
        quantidade++;
    }

    public Integer removerElemento() {
        if (filaVazia()) {
            System.out.println("Erro: A fila está vazia.");
            return null;
        }
        int elementoRemovido = elementos[inicio];
        inicio = (inicio + 1) % tamanho;
        quantidade--;
        return elementoRemovido;
    }

    public int localizarElemento(int elemento) {
        int posicao = -1;
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == elemento) {
                posicao = i;
                break;
            }
        }
        return posicao;
    }
}
