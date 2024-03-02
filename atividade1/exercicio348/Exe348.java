import javax.swing.JOptionPane;

class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = (nota1 + nota2) / 2;
    }
}

public class Exe348 {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[5];

        for (int i = 0; i < 5; i++) {
            String nome = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º aluno:");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota para " + nome + ":"));
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota para " + nome + ":"));

            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        String lista = "LISTA\n\n";
        for (int i = 0; i < 5; i++) {
            Aluno aluno = alunos[i];
            lista += "Aluno " + (i + 1) + ": " + aluno.nome + "\n";
            lista += "Nota 1: " + aluno.nota1 + "\n";
            lista += "Nota 2: " + aluno.nota2 + "\n";
            lista += "Média: " + aluno.media + "\n\n";
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}