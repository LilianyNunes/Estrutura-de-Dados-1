import java.util.Stack;

public class PilhaInvertida {

    public static void inverterPalavras(String texto) {
        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) != ' ') {

                pilha.push(texto.charAt(i));
            } else {

                while (!pilha.isEmpty()) {
                    System.out.print(pilha.pop());
                }
                System.out.print(" ");
            }
        }
        while (!pilha.isEmpty()) {
            System.out.print(pilha.pop());
        }
    }
}
