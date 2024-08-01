public class Pessoa {
    int id;
    String nome;
    String telefone;
    String endereco;
    String cpf;
    Pessoa proxima;

    public Pessoa(int id, String nome, String telefone, String endereco, String cpf) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
        this.proxima = null;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", endereco='" + endereco + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
