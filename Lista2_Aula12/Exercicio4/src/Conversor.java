public class Conversor {
    public static String decimalParaBinario(int numero) {
        if (numero == 0) {
            return "0";
        }
        if (numero == 1) {
            return "1";
        }
        return decimalParaBinario(numero / 2) + (numero % 2);
    }
}
