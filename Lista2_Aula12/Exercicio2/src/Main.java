import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = scanner.nextInt();

        System.out.print("Digite o valor de y: ");
        int y = scanner.nextInt();

        int resultado = MDC.calcular(x, y);

        System.out.println("O MDC de " + x + " e " + y + " é: " + resultado);

        scanner.close();
    }
}
