package atividade1.exercicio360;
import javax.swing.JOptionPane;

public class Exe360 {
        public static void main(String[] args) {
            Pessoa pessoa;
    
            do {
                int dataNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de nascimento (DDMM) ou 9999 para sair:"));
                if (dataNascimento != 9999) {
                    pessoa = new Pessoa(dataNascimento);
                    String signo = pessoa.calcularSigno();
                    JOptionPane.showMessageDialog(null, "O seu signo é: " + signo);
                } else {
                    pessoa = null;
                }
            } while (pessoa != null);
        }
}
