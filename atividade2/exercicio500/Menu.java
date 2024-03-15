package atividade2.exercicio500;

import javax.swing.JOptionPane;

public class Menu {
    OperacoesVetor operacoesVetor = new OperacoesVetor();

    public void exibir() {
        int op;
        do {
            op = exibirMenu();
            switch (op) {
                case 1:
                    operacoesVetor.entrada("A");
                    break;
                case 2:
                    operacoesVetor.entrada("B");
                    break;
                case 3:
                    operacoesVetor.imprime("A");
                    operacoesVetor.imprime("B");
                    break;
                case 4:
                    operacoesVetor.soma();
                    break;
                case 5:
                    operacoesVetor.subtrai();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saindo do Algoritmo");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida");
            }
        } while (op != 6);
    }

    int exibirMenu() {
        String message = "Escolha uma opção:\n"
                + "1. Dados do VETOR A\n"
                + "2. Dados do VETOR B\n"
                + "3. Imprime VETORES\n"
                + "4. Soma VETORES\n"
                + "5. Subtrai VETORES\n"
                + "6. Sai do programa";
        return Integer.parseInt(JOptionPane.showInputDialog(null, message));
    }
}
