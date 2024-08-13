public class Teste {
    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

        // 1) Adicionando Homer e Marge na lista e depois imprima o resultado.
        lista.inserir(1); // Homer
        lista.inserir(2); // Marge
        System.out.print("Lista após adicionar Homer e Marge: ");
        lista.exibir();

        // 2) Esvaziando a lista e imprimindo.
        lista.esvaziar();
        System.out.print("Lista após esvaziar: ");
        lista.exibir();

        // 3) Adicione Homer na lista. Depois adicione Bart na posição 0 e Moll na posição 1 e imprima a lista
        lista.inserir(1); // Homer
        lista.inserirNaPosicao(0, 0); // Bart na posição 0
        lista.inserirNaPosicao(3, 1); // Moll na posição 1
        System.out.print("Lista após adicionar Homer, Bart, e Moll: ");
        lista.exibir();

        // 4) Esvaziando a lista.
        lista.esvaziar();
        System.out.print("Lista após esvaziar novamente: ");
        lista.exibir();
    }
}
