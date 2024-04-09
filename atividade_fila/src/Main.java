public class Main {
    public static void main(String[] args) {
        FilaRefeitorio fila = new FilaRefeitorio(5);

        Aluno aluno1 = new Aluno(123456, "João", "Engenharia");
        Professor professor1 = new Professor("123ABC", "Maria", "Doutorado");
        Tecnico tecnico1 = new Tecnico("789XYZ", "Carlos");

        fila.entrarNaFila(aluno1);
        fila.entrarNaFila(professor1);
        fila.entrarNaFila(tecnico1);

        while (!fila.filaVazia()) {
            Aluno alunoAtendido = fila.sairDaFilaAlunos();
            if (alunoAtendido != null) {
                System.out.println("Aluno atendido: " + alunoAtendido.nome);
            }

            Professor professorAtendido = fila.sairDaFilaProfessores();
            if (professorAtendido != null) {
                System.out.println("Professor atendido: " + professorAtendido.nome);
            }

            Tecnico tecnicoAtendido = fila.sairDaFilaTecnicos();
            if (tecnicoAtendido != null) {
                System.out.println("Técnico administrativo atendido: " + tecnicoAtendido.nome);
            }
        }
    }
}
