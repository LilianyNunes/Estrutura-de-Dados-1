import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal: ");
        int numero = scanner.nextInt();

        String binario = Conversor.decimalParaBinario(numero);

        System.out.println("O número " + numero + " em binário é: " + binario);

        scanner.close();
    }
}
