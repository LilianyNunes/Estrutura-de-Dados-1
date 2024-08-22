import java.util.Random;
import java.util.Stack;

public class PilhaDinamica {

    public static void main(String[] args) {
        // Criando três pilhas dinâmicas
        Stack<Integer> pilha1 = new Stack<>();
        Stack<Integer> pilha2 = new Stack<>();
        Stack<Integer> pilha3 = new Stack<>();
        
        Random random = new Random();

        // Fase 1: Sorteando 100 números para as pilhas
        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(9) + 1; // Números de 1 a 9
            
            if (numero >= 1 && numero <= 3) {
                pilha1.push(numero);
            } else if (numero >= 4 && numero <= 6) {
                pilha2.push(numero);
            } else {
                pilha3.push(numero);
            }
        }

        // Fase 2: Sorteando 100 números para empilhar de uma pilha em outra
        for (int i = 0; i < 100; i++) {
            int pilhaEscolhida = random.nextInt(3) + 1; // Sorteia um número entre 1 e 3
            Stack<Integer> origem1, origem2, destino;

            switch (pilhaEscolhida) {
                case 1:
                    origem1 = pilha2;
                    origem2 = pilha3;
                    destino = pilha1;
                    break;
                case 2:
                    origem1 = pilha1;
                    origem2 = pilha3;
                    destino = pilha2;
                    break;
                case 3:
                    origem1 = pilha1;
                    origem2 = pilha2;
                    destino = pilha3;
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + pilhaEscolhida);
            }

            // Verifica se as pilhas de origem não estão vazias antes de desempilhar
            if (!origem1.isEmpty() && !origem2.isEmpty()) {
                int num1 = origem1.pop();
                int num2 = origem2.pop();
                
                destino.push(num1);
                destino.push(num2);
                
                System.out.println("Empilhando os números " + num1 + " e " + num2 + " na pilha " + pilhaEscolhida);
            } else {
                System.out.println("O programa foi encerrado porque uma das pilhas está vazia.");
                break;
            }
        }

        System.out.println("\nPilha 1: " + pilha1);
        System.out.println("Pilha 2: " + pilha2);
        System.out.println("Pilha 3: " + pilha3);
    }
}
