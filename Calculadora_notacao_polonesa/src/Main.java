public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Exemplos de uso com notação pós-fixa
        System.out.println("Exemplo com notação pós-fixa:");
        calc.avaliar("2 3 1 * + 9 -", "posfixa"); 
        calc.avaliar("5 3 4 + *", "posfixa"); 

        // Exemplos de uso com notação infixa
        System.out.println("\nExemplo com notação infixa:");
        calc.avaliar("( 2 + 3 ) * 4", "infixa"); 
        calc.avaliar("5 * ( 3 + 4 )", "infixa"); 

        // Exemplos de uso com notação pré-fixa
        System.out.println("\nExemplo com notação pré-fixa:");
        calc.avaliar("* + 2 3 4", "prefixa"); 
        calc.avaliar("* 5 + 3 4", "prefixa"); 
    }
}
