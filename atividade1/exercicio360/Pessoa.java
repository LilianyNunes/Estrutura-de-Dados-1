package atividade1.exercicio360;

public class Pessoa {
    public int dia;
    public int mes;

    public Pessoa(int dataNascimento) {
        this.dia = dataNascimento / 100;
        this.mes = dataNascimento % 100 - 1;
    }

    public String calcularSigno() {
        String[] signos = {
            "Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos",
            "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário"
        };
        int[] ultDia = { 20, 19, 20, 20, 20, 20, 21, 22, 22, 22, 21, 21 };

        if (dia > ultDia[mes]) {
            mes = (mes + 1) % 12;
        }
        return signos[mes];
    }
}
