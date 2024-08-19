import java.util.Scanner;
import java.util.Stack;

public class VerificaExpressao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Character> pilha = new Stack<>();

        System.out.println("DIGITE A EXPRESSÃO: ");
        String expressao = input.nextLine();

        boolean balanceada = true;
        
        for (int i = 0; i < expressao.length(); i++) {
            char ch = expressao.charAt(i);

            // Se for uma abertura de parênteses, colchetes ou chaves, empilha
            if (ch == '(' || ch == '[' || ch == '{') {
                pilha.push(ch);
            } 
            // Se for um fechamento, verifica se há um correspondente no topo da pilha
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (pilha.isEmpty()) {
                    balanceada = false;
                    break;
                }
                
                char topo = pilha.pop();
                if ((ch == ')' && topo != '(') || 
                    (ch == ']' && topo != '[') || 
                    (ch == '}' && topo != '{')) {
                    balanceada = false;
                    break;
                }
            }
        }
        
        // Verifica se a pilha está vazia no final (todas as aberturas foram fechadas)
        if (!pilha.isEmpty()) {
            balanceada = false;
        }

        if (balanceada) {
            System.out.println("EXPRESSÃO CORRETA");
        } else {
            System.out.println("EXPRESSÃO INCORRETA");
        }

        input.close();
    }
}