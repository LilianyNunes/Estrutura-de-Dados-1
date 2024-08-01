import java.util.Random;

public class ProblemaJosephus {
    public static void main(String[] args) {
        int n = 20;
        ListaEncadeadaCircular lista = new ListaEncadeadaCircular();
        Random rand = new Random();

        // Populando a lista com 20 pessoas
        for (int i = 1; i <= n; i++) {
            lista.adicionarPessoa(new Pessoa(i, "Nome" + i, "Telefone" + i, "Endereco" + i, "CPF" + i));
        }

        Pessoa atual = lista.getCabeca();

        // Continuar até que reste apenas uma pessoa
        while (!lista.apenasUmaPessoa()) {
            int m = rand.nextInt(n) + 1; // Escolhendo m aleatoriamente entre 1 e tamanho inicial da lista
            for (int i = 1; i < m; i++) {
                atual = atual.proxima;
            }
            System.out.println("Eliminando: " + atual);
            lista.removerPessoa(atual);
            atual = atual.proxima;
        }

        System.out.println("Pessoa sobrevivente: " + lista.getCabeca());
    }
}
