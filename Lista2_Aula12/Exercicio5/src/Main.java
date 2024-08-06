public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        

        lista.inserir(10);
        lista.inserir(5);
        lista.inserir(20);
        lista.inserir(15);
        lista.inserir(8);

        System.out.println("Lista após inserção: ");
        exibirLista(lista);

        System.out.println("A lista está vazia? " + lista.estaVazia());

        System.out.println("Tamanho da lista: " + lista.tamanho());

        lista.remover(15);
        System.out.println("Lista após remover 15: ");
        exibirLista(lista);

        System.out.println("Média dos elementos da lista: " + lista.media());

        System.out.println("O elemento 10 está na lista? " + lista.busca(10));

        lista.elimina(8);
        System.out.println("Lista após eliminar todas as ocorrências de 8: ");
        exibirLista(lista);

        lista.eliminaPosicao(1);
        System.out.println("Lista após eliminar o elemento na posição 1: ");
        exibirLista(lista);

        lista.insereDireita(1, 25);
        System.out.println("Lista após inserir 25 à direita da posição 1: ");
        exibirLista(lista);

        lista.insereEsquerda(1, 12);
        System.out.println("Lista após inserir 12 à esquerda da posição 1: ");
        exibirLista(lista);

        Lista outraLista = new Lista();
        outraLista.inserir(5);
        outraLista.inserir(10);
        outraLista.inserir(12);
        outraLista.inserir(20);
        outraLista.inserir(25);
        System.out.println("As listas são iguais? " + lista.iguais(outraLista));
    }

    public static void exibirLista(Lista lista) {
        No atual = lista.cabeca;
        while (atual != null) {
            System.out.print(atual.info + " ");
            atual = atual.prox;
        }
        System.out.println();
    }
}
