package atividade1.exercicio356;

public class Aluno {
    public String nome;
    public double pr1;
    public double pr2;
    public int media;
    public String situacao;

    public Aluno(String nome, double pr1, double pr2) {
        this.nome = nome;
        this.pr1 = pr1;
        this.pr2 = pr2;
        this.media = (int) Math.round((pr1 + pr2) / 2);
        this.situacao = (media >= 5) ? "AP" : "RP";
    }
}


