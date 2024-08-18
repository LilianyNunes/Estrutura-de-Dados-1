class Node {
    int valor;
    Node anterior;
    Node proximo;

    Node(int valor) {
        this.valor = valor;
        this.anterior = this.proximo = null;
    }
}
