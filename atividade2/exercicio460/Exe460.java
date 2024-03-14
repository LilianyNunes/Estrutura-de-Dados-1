package atividade2.exercicio460;

import javax.swing.JOptionPane;

public class Exe460 {
    public static void main(String[] args) {
        Numero num = new Numero();

        for(int i=0; i<3; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
            JOptionPane.showMessageDialog(null, "Dobro: " + num.dobro(numero));
        }
    }
}
