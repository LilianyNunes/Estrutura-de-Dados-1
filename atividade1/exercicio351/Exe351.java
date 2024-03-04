package atividade1.exercicio351;
import javax.swing.JOptionPane;

public class Exe351 {
    public static void main(String[] args) {
        String[] nomes = new String [5];

        for (int i = 0; i<5; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome da pessoa");
        }
        int numPosicao;
        do {
            numPosicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número correspondente a pessoa:")) - 1;
            if (numPosicao < 0 || numPosicao >= nomes.length) {
                JOptionPane.showMessageDialog(null, "O número está fora do intervalo!");
            }else {
                JOptionPane.showMessageDialog(null, nomes[numPosicao]);
            }
        } while (numPosicao < 0 || numPosicao >= nomes.length);
    }
}
