package atividade1.exercicio358;

public class Mercadoria {
    public double precoCompra;
    public double precoVenda;

    public Mercadoria(double precoCompra, double precoVenda) {
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public double calcularLucro() {
        return ((precoVenda - precoCompra) / precoCompra) * 100;
    }
}
