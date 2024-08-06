public class MDC {
    public static int calcular(int x, int y) {
        // Caso base: se os dois números são iguais, o MDC é um deles
        if (x == y) {
            return x;
        }
        // Se x > y, chamamos recursivamente com x - y
        if (x > y) {
            return calcular(x - y, y);
        }
        // Se y > x, chamamos recursivamente com y - x
        return calcular(y - x, x);
    }
}
