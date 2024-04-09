public class Main {

    public static void main(String[] args) {
        String exemplo1 = "UM CIENTISTA DA COMPUTAÇAO OU UM TECNÓLOGO EM SISTEMAS PARA INTERNET DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String exemplo2 = "ESARF :ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC E AIGOLONCET ME SAMETSIS ARAP TENRETNI OD FI ONAIOG SUPMAC SOHNIRROM OAS SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";

        System.out.println("Exemplo 1:");
        PilhaInvertida.inverterPalavras(exemplo1);
        System.out.println();
        System.out.println("Exemplo 2:");
        PilhaInvertida.inverterPalavras(exemplo2);
    }
}
