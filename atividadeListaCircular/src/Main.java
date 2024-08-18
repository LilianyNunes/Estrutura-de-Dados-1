import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaCircularDuplamenteEncadeada lista = new ListaCircularDuplamenteEncadeada();
        Random random = new Random();
        int[] numeros = new int[1000];

        // Gerar 1000 números aleatórios e inseri-los na lista
        for (int i = 0; i < 1000; i++) {
            numeros[i] = random.nextInt(19999) - 9999;
            lista.inserirOrdenado(numeros[i]);
        }

        // Imprimir os números na ordem de geração
        System.out.println("Números na ordem de geração:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // Imprimir os números na lista em ordem crescente
        System.out.println("Números na lista (ordem crescente):");
        lista.imprimirCrescente();

        // Imprimir os números na lista em ordem decrescente
        System.out.println("Números na lista (ordem decrescente):");
        lista.imprimirDecrescente();

        // Remover números primos e imprimir novamente em ordem crescente
        lista.removerPrimos();
        System.out.println("Números na lista após remoção de primos (ordem crescente):");
        lista.imprimirCrescente();
    }
}
