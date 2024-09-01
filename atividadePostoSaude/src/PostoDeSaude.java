import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class PostoDeSaude {

    public static ArrayList<Pessoa> gerarPessoas() {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                String id = "Pessoa" + (i * 10 + j + 1);
                String sexo = random.nextBoolean() ? "Masculino" : "Feminino";
                int idade = random.nextInt(100);
                boolean gestante = false;
                boolean lactante = false;
                boolean necessidadeEspecial = false;

                if (j == 0) {
                    necessidadeEspecial = true;
                } else if (j == 1) {
                    gestante = true;
                } else if (j == 2) {
                    lactante = true;
                } else if (j >= 3 && j <= 5) {
                    idade = 60 + random.nextInt(40);  // acima de 60 anos
                }

                Pessoa pessoa = new Pessoa(id, sexo, idade, gestante, lactante, necessidadeEspecial);
                pessoas.add(pessoa);
            }
        }
        return pessoas;
    }

    public static void main(String[] args) {
        Deque<Pessoa> filaAtendimentos = new Deque<>();
        Queue<Pessoa> naoAtendidos = new LinkedList<>();
        Queue<Pessoa> atendidos = new LinkedList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        int atendimentos = 0;
        while (atendimentos < 100) {
            pessoas = gerarPessoas();
            for (int c = 0; c < pessoas.size(); c++) {
                Pessoa p = pessoas.get(c);
                if (p.gestante || p.lactante) {
                    filaAtendimentos.adicionaNoInicio(p);
                } else if (p.necessidadeEspecial) {
                    filaAtendimentos.adicionaNoInicio(p);
                } else if (p.idade > 60) {
                    filaAtendimentos.adicionaNoInicio(p);
                } else {
                    filaAtendimentos.adicionaNoFinal(p);
                }
            }
            atendimentos = filaAtendimentos.size() < 100 ? filaAtendimentos.size() : 100;
        }

        for (int i = 0; i < 100 && !filaAtendimentos.isEmpty(); i++) {
            Pessoa p = filaAtendimentos.removeDoInicio();
            atendidos.add(p);
        }

        while (!filaAtendimentos.isEmpty()) {
            Pessoa p = filaAtendimentos.removeDoInicio();
            naoAtendidos.add(p);
        }

        System.out.println("Pessoas atendidas:");
        for (Pessoa p : atendidos) {
            System.out.println(p);
        }

        System.out.println("\nPessoas não atendidas:");
        for (Pessoa p : naoAtendidos) {
            System.out.println(p);
        }
    }
}
