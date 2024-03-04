package atividade1.exercicio356;
import javax.swing.JOptionPane;

public class Exe356 {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[15];

        for (int i = 0; i < alunos.length; i++) {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno " + (i + 1) + ":");
            double pr1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da PR1:"));
            double pr2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a nota da PR2:"));
            alunos[i] = new Aluno(nome, pr1, pr2);
        }

        for (int i = 0; i < alunos.length; i++) {
            Aluno aluno = alunos[i];
            JOptionPane.showMessageDialog(null,
                    "Aluno: " + aluno.nome + "\n" +
                    "Nota 1: " + aluno.pr1 + "\n" +
                    "Nota 2: " + aluno.pr2 + "\n" +
                    "Média: " + aluno.media + "\n" +
                    "Situação: " + aluno.situacao);
        }
    }
}
