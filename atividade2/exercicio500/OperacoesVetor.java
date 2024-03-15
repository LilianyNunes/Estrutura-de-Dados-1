package atividade2.exercicio500;

import javax.swing.JOptionPane;

class OperacoesVetor {
    int[] num = new int[5];
    int[] numl = new int[5];

    void entrada(String c) {
        JOptionPane.showMessageDialog(null, "Entrada do VETOR " + c);
        for (int L = 0; L < 5; L++) {
            String input = JOptionPane.showInputDialog("Digite numero " + (L + 1));
            if (c.equals("A")) {
                num[L] = Integer.parseInt(input);
            } else {
                numl[L] = Integer.parseInt(input);
            }
        }
    }

    void imprime(String c) {
        StringBuilder output = new StringBuilder("VETOR " + c + "\n");
        int[] vetor = (c.equals("A")) ? num : numl;
        for (int L = 0; L < 5; L++) {
            output.append(L + 1).append(": ").append(vetor[L]).append("\n");
        }
        JOptionPane.showMessageDialog(null, output);
    }

    void soma() {
        if (vetoresPreenchidos()) {
            StringBuilder output = new StringBuilder("SOMA\n");
            for (int L = 0; L < 5; L++) {
                int s = num[L] + numl[L];
                output.append(s).append("\n");
            }
            JOptionPane.showMessageDialog(null, output);
        } else {
            JOptionPane.showMessageDialog(null, "Escolha primeiro opcoes 1 e 2");
        }
    }

    void subtrai() {
        if (vetoresPreenchidos()) {
            StringBuilder output = new StringBuilder("DIFERENCA\n");
            for (int L = 0; L < 5; L++) {
                int d = num[L] - numl[L];
                output.append(d).append("\n");
            }
            JOptionPane.showMessageDialog(null, output);
        } else {
            JOptionPane.showMessageDialog(null, "Escolha primeiro opcoes 1 e 2");
        }
    }

    boolean vetoresPreenchidos() {
        for (int i : num) {
            if (i != 0) return true;
        }
        for (int i : numl) {
            if (i != 0) return true;
        }
        return false;
    }
}
