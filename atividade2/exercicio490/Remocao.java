package atividade2.exercicio490;

public class Remocao {
    void removerCaractere(String[] palavras, char caractere) {
        for (int i = 0; i < palavras.length; i++) {
            palavras[i] = palavras[i].replace(caractere, '*');
        }
    }
}
