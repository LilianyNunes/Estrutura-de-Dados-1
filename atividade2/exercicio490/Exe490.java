package atividade2.exercicio490;
import javax.swing.JOptionPane;

public class Exe490 {
    public static void main(String[] args) {
        String[] palavras = new String[10];

        for (int i = 0; i < 10; i++) {
            palavras[i] = JOptionPane.showInputDialog(null, "Digite a palavra em letras minúsculas " + (i + 1) + ":");
        }

        Remocao manipulador = new Remocao();
        manipulador.removerCaractere(palavras, 'c');

        String saida = "";
        for (int i = 0; i < 10; i++) {
        saida += (i + 1) + " - " + palavras[i] + "\n";
}
        JOptionPane.showMessageDialog(null, saida.toString());
    }
}


