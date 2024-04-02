package atividade_fila_etores;
public class Teste {
    public static void main(String[] args) {
        Fila fila = new Fila();
        fila.criarFila(10);
        fila.inserirElemento(10);
        fila.inserirElemento(20);
        fila.inserirElemento(30);
        System.out.println("Elemento removido: " + fila.removerElemento());
        int posicao = fila.localizarElemento(30); 
        if (posicao != -1) {
            System.out.println("Elemento 30 encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento 30 não encontrado na fila.");
        }
        fila.destruirFila();
    }
}
