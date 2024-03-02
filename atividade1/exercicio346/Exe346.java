import javax.swing.JOptionPane;

public class Exe346 {

    public static void main(String[] args) {
        String frase;
        int menu;

        do {
        menu = Integer.parseInt(JOptionPane.showInputDialog("MENU: \n 1 - Imprime o comprimento da frase \n 2 - Imprime os dois primeiros e os dois últimos caracteres da frase \n 3 - Imprime a frase espelhada \n 4 - Termina o algoritmo \n OPÇÃO: \n"));

        switch (menu) {
            case 1:
                frase = JOptionPane.showInputDialog("Digite uma frase: ");
                int tamanho = frase.length();
                JOptionPane.showMessageDialog(null, "O número de caracteres da frase é: " + tamanho);
                break;
            case 2:
                frase = JOptionPane.showInputDialog("Digite uma frase: ");
                String primeiros = frase.substring(0, 2);
                String ultimos = frase.substring(frase.length() - 2);
                JOptionPane.showMessageDialog(null, "Os dois primeiros caracteres da frase são: " + primeiros + " \nOs dois últimos caracteres da frase são: " + ultimos);
                break;
            case 3: 
                frase = JOptionPane.showInputDialog("Digite uma frase: ");
                String fraseEspelhada = "";
                for (int i = frase.length() - 1; i >= 0; i--) {
                    fraseEspelhada += frase.charAt(i);
                }
                JOptionPane.showMessageDialog(null, fraseEspelhada);
                break;
            case  4:
            JOptionPane.showMessageDialog(null, "Programa finalizado");
            break;

            default:
                JOptionPane.showMessageDialog(null, "Opção não disponível"); 
        }
        }while (menu != 4);
    }
}