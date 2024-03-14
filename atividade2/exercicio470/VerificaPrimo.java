import javax.swing.JOptionPane;

class VerificaPrimo {
    int numero;

    VerificaPrimo(int numero) {
        this.numero = numero;
    }

    void Verificacao() {
        if (numero <= 1) {
            System.out.println("O número deve ser maior que 1.");
            return;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                JOptionPane.showMessageDialog(null, numero + " não é primo.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, numero + " é primo.");
    }
}
