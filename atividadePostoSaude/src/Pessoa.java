public class Pessoa {
    String id;
    String sexo;
    int idade;
    boolean gestante;
    boolean lactante;
    boolean necessidadeEspecial;
    int tipo;

    public Pessoa(String id, String sexo, int idade, boolean gestante, boolean lactante, boolean necessidadeEspecial) {
        this.id = id;
        this.sexo = sexo;
        this.idade = idade;
        this.gestante = gestante;
        this.lactante = lactante;
        this.necessidadeEspecial = necessidadeEspecial;
        tipo = 0;
        if (idade > 60) {
            tipo = 1;
        }
        if (necessidadeEspecial) {
            tipo = 2;
        }
        if (gestante || lactante) {
            tipo = 3;
        }
    }

    @Override
    public String toString() {
        return String.format("Pessoa ID: %s, Sexo: %s, Idade: %d, Gestante: %s, Lactante: %s, Necessidade Especial: %s, Tipo: %d",
                id, sexo, idade, gestante ? "Sim" : "Não", lactante ? "Sim" : "Não", necessidadeEspecial ? "Sim" : "Não", tipo);
    }
}
