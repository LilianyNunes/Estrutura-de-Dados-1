
public class Main {
    static int contarDigitoNoNumero(int N, int K) {
        ListaEncadeada lista = Util.numeroParaListaEncadeada(N);
        return lista.contarDigito(K);
    }

    public static void main(String[] args) {
        int N = 762021192;
        int K = 2;
        System.out.println("O dígito " + K + " ocorre " + contarDigitoNoNumero(N, K) + " vezes em " + N + ".");
    }
}
