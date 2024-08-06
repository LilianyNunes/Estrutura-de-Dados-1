public class MOD {
    public static int calcular(int x, int y) {
        if (x == y) {
            return 0;
        }
        if (x < y) {
            return x;
        }
        return calcular(x - y, y);
    }
}
