import javax.swing.JOptionPane;

class Exe470 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número:");
        int num = Integer.parseInt(input);
        
        VerificaPrimo verificador = new VerificaPrimo(num);
        verificador.Verificacao();
    }
}
