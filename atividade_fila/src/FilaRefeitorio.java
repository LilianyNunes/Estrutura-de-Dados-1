public class FilaRefeitorio {
    Aluno[] alunos;
    Professor[] professores;
    Tecnico[] tecnicos;
    int capacidade;
    int tamanhoAlunos;
    int tamanhoProfessores;
    int tamanhoTecnicos;

    public FilaRefeitorio(int capacidade) {
        this.capacidade = capacidade;
        this.alunos = new Aluno[capacidade];
        this.professores = new Professor[capacidade];
        this.tecnicos = new Tecnico[capacidade];
        this.tamanhoAlunos = 0;
        this.tamanhoProfessores = 0;
        this.tamanhoTecnicos = 0;
    }

    public boolean filaVazia() {
        return tamanhoAlunos == 0 && tamanhoProfessores == 0 && tamanhoTecnicos == 0;
    }

    public void entrarNaFila(Aluno aluno) {
        if (tamanhoAlunos < capacidade) {
            alunos[tamanhoAlunos++] = aluno;
        } else {
            System.out.println("Fila de alunos cheia, não é possível adicionar mais pessoas.");
        }
    }

    public void entrarNaFila(Professor professor) {
        if (tamanhoProfessores < capacidade) {
            professores[tamanhoProfessores++] = professor;
        } else {
            System.out.println("Fila de professores cheia, não é possível adicionar mais pessoas.");
        }
    }

    public void entrarNaFila(Tecnico tecnico) {
        if (tamanhoTecnicos < capacidade) {
            tecnicos[tamanhoTecnicos++] = tecnico;
        } else {
            System.out.println("Fila de técnicos administrativos cheia, não é possível adicionar mais pessoas.");
        }
    }

    public Aluno sairDaFilaAlunos() {
        if (tamanhoAlunos == 0) {
            System.out.println("Fila de alunos vazia, não há pessoas para remover.");
            return null;
        }
        Aluno alunoRemovido = alunos[0];
        for (int i = 0; i < tamanhoAlunos - 1; i++) {
            alunos[i] = alunos[i + 1];
        }
        tamanhoAlunos--;
        return alunoRemovido;
    }

    public Professor sairDaFilaProfessores() {
        if (tamanhoProfessores == 0) {
            System.out.println("Fila de professores vazia, não há pessoas para remover.");
            return null;
        }
        Professor professorRemovido = professores[0];
        for (int i = 0; i < tamanhoProfessores - 1; i++) {
            professores[i] = professores[i + 1];
        }
        tamanhoProfessores--;
        return professorRemovido;
    }

    public Tecnico sairDaFilaTecnicos() {
        if (tamanhoTecnicos == 0) {
            System.out.println("Fila de técnicos administrativos vazia, não há pessoas para remover.");
            return null;
        }
        Tecnico tecnicoRemovido = tecnicos[0];
        for (int i = 0; i < tamanhoTecnicos - 1; i++) {
            tecnicos[i] = tecnicos[i + 1];
        }
        tamanhoTecnicos--;
        return tecnicoRemovido;
    }
}
