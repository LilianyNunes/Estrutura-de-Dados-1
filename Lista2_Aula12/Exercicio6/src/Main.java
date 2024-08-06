public class Main {
    public static void main(String[] args) {
        Lista l1 = new Lista();
        Lista l2 = new Lista();
        preencherListaAleatoria(l1, 50);
        preencherListaAleatoria(l2, 50);

        ordenarLista(l1);
        ordenarLista(l2);

        Lista invertidaL1 = l1.inverter();
        Lista impares = l1.retornarImpares(l2);
        Lista concatenada = l1.concatena(l2);
        Lista interseccao = l1.interseccao(l2);
        Lista intercalada1 = l1.intercalar1(l2);
        Lista intercalada2 = l1.intercalar2(l2);

        System.out.println("Lista L1 invertida:");
        invertidaL1.imprimir();

        System.out.println("Lista com elementos ímpares de L1 e L2:");
        impares.imprimir();

        System.out.println("Lista concatenada de L1 e L2:");
        concatenada.imprimir();

        System.out.println("Interseção entre L1 e L2:");
        interseccao.imprimir();

        System.out.println("Lista intercalada 1 (preservando a ordem):");
        intercalada1.imprimir();

        System.out.println("Lista intercalada 2 (ordenada):");
        intercalada2.imprimir();
    }

    static void preencherListaAleatoria(Lista lista, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            int valor = (int) (Math.random() * 201) - 100;
            lista.inserir(valor);
        }
    }

    static void ordenarLista(Lista lista) {
    }
}
