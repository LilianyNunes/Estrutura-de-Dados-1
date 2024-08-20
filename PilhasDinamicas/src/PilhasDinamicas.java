import java.util.Scanner;
import java.util.Stack;

public class PilhasDinamicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();

        int numero;

        // Leitura dos valores e separação em pilhas
        do {
            System.out.print("Digite um número (-127 a 128, 0 para sair): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                if (numero % 2 == 0) {
                    pilhaPar.push(numero);
                } else {
                    pilhaImpar.push(numero);
                }
            }
        } while (numero != 0);

        // Retirada alternada dos elementos
        System.out.println("\nRetirando elementos alternadamente das pilhas:");
        while (!pilhaPar.isEmpty() && !pilhaImpar.isEmpty()) {
            System.out.println("Retirado da Pilha Ímpar: " + pilhaImpar.pop());
            if (!pilhaPar.isEmpty()) {
                System.out.println("Retirado da Pilha Par: " + pilhaPar.pop());
            }
        }

        // Verificar qual pilha ainda possui elementos
        if (!pilhaPar.isEmpty()) {
            System.out.println("\nA Pilha Par ainda possui " + pilhaPar.size() + " elementos:");
            while (!pilhaPar.isEmpty()) {
                System.out.println(pilhaPar.pop());
            }
        } else if (!pilhaImpar.isEmpty()) {
            System.out.println("\nA Pilha Ímpar ainda possui " + pilhaImpar.size() + " elementos:");
            while (!pilhaImpar.isEmpty()) {
                System.out.println(pilhaImpar.pop());
            }
        } else {
            System.out.println("\nAmbas as pilhas estão vazias.");
        }

        scanner.close();
    }
}