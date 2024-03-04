package atividade1.exercicio358;
import javax.swing.JOptionPane;

public class Exe358 {
    public static void main(String[] args) {
        Mercadoria[] mercadorias = new Mercadoria[100];

        for (int i = 0; i < mercadorias.length; i++) {
            double precoCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço de compra da mercadoria " + (i + 1) + ":"));
            double precoVenda = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço de venda da mercadoria " + (i + 1) + ":"));
            mercadorias[i] = new Mercadoria(precoCompra, precoVenda);
        }

        int totalLucroMenor10 = 0;
        int totalLucroMenor20 = 0;
        int totalLucroMaior20 = 0;

        for (Mercadoria mercadoria : mercadorias) {
            double lucro = mercadoria.calcularLucro();
            if (lucro < 10) {
                totalLucroMenor10++;
            } else if (lucro <= 20) {
                totalLucroMenor20++;
            } else {
                totalLucroMaior20++;
            }
        }

        JOptionPane.showMessageDialog(null, 
            "Total de mercadorias com lucro < 10%: " + totalLucroMenor10 + "\n" +
            "Total de mercadorias com 10% <= lucro <= 20%: " + totalLucroMenor20 + "\n" +
            "Total de mercadorias com lucro > 20%: " + totalLucroMaior20);
    }
}
