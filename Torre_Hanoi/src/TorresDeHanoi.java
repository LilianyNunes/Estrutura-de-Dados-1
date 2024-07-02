public class TorresDeHanoi {

    private static long movimentos;

    public static void moverDiscos(int n, char origem, char destino, char trabalho) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            movimentos++;
            return;
        }

        moverDiscos(n - 1, origem, trabalho, destino);
        System.out.println("Mover disco " + n + " de " + origem + " para " + destino);
        movimentos++;
        moverDiscos(n - 1, trabalho, destino, origem);
    }

    public static void main(String[] args) {
        int numDiscos = 30;

        movimentos = 0;
        long inicio = System.nanoTime();

        moverDiscos(numDiscos, 'A', 'C', 'B');

        long fim = System.nanoTime();
        long duracao = fim - inicio;

        long millis = duracao / 1000000;
        long segundos = (millis / 1000) % 60;
        long minutos = (millis / (1000 * 60)) % 60;
        long horas = (millis / (1000 * 60 * 60)) % 24;
        millis = millis % 1000;

        System.out.printf("Instância com %d discos: %n", numDiscos);
        System.out.printf("Tempo gasto: %02d:%02d:%02d:%03d%n", horas, minutos, segundos, millis);
        System.out.printf("Quantidade de movimentos: %d%n", movimentos);
    }
}
