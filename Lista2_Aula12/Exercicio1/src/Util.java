
class Util {
    static ListaEncadeada numeroParaListaEncadeada(int numero) {
        ListaEncadeada lista = new ListaEncadeada();
        String numeroStr = String.valueOf(numero);
        for (char digito : numeroStr.toCharArray()) {
            lista.adicionar(Character.getNumericValue(digito));
        }
        return lista;
    }
}
