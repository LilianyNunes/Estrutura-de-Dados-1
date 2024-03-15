import javax.swing.JOptionPane;

public class Exe480 {
    public static void main(String[] args) {

        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        
        Capicua reverso = new Capicua();
        int numeroInvertido = reverso.inverterNumero(num);
        
        JOptionPane.showMessageDialog(null, num + " - " + numeroInvertido);
        
        if (numeroInvertido == num) {
            JOptionPane.showMessageDialog(null, "É um número capicua.");
        } else {
            JOptionPane.showMessageDialog(null, "Não é um número capicua.");
        }
    }
}


