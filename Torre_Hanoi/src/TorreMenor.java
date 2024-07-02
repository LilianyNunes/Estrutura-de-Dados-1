public class TorreMenor {

    private static long movimentos;

    public static void moverDiscosIterativo(int numDiscos, char origem, char destino, char trabalho) {
        long totalMovimentos = (1L << numDiscos) - 1; 
        movimentos = totalMovimentos;
    }

    public static void main(String[] args) {
        int numDiscos = 41; 

        long inicio = System.nanoTime();

        moverDiscosIterativo(numDiscos, 'A', 'C', 'B');

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
