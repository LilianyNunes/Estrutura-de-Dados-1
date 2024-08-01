public class ListaEncadeadaCircular {
    private Pessoa cabeca = null;
    private Pessoa cauda = null;

    public void adicionarPessoa(Pessoa pessoa) {
        if (cabeca == null) {
            cabeca = pessoa;
            cauda = pessoa;
            pessoa.proxima = cabeca;
        } else {
            cauda.proxima = pessoa;
            cauda = pessoa;
            cauda.proxima = cabeca;
        }
    }

    public void removerPessoa(Pessoa pessoa) {
        if (cabeca == null) return;

        if (cabeca == pessoa) {
            cauda.proxima = cabeca.proxima;
            cabeca = cabeca.proxima;
        } else {
            Pessoa atual = cabeca;
            while (atual.proxima != pessoa) {
                atual = atual.proxima;
            }
            atual.proxima = pessoa.proxima;
            if (cauda == pessoa) {
                cauda = atual;
            }
        }
    }

    public Pessoa getCabeca() {
        return cabeca;
    }

    public boolean apenasUmaPessoa() {
        return cabeca == cauda;
    }
}
