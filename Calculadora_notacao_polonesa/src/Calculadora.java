import java.util.Stack;
import java.util.Arrays;
import java.util.Collections;

public class Calculadora {
    public void avaliar(String expressao, String tipo) {
        String posfixo, infixo, prefixo;
        int resultado;

        if (tipo.equals("infixa")) {
            infixo = expressao;
            posfixo = infixoParaPosfixo(expressao);
            prefixo = posfixoParaPrefixo(posfixo);
            resultado = calcular(posfixo);
        } else if (tipo.equals("prefixa")) {
            prefixo = expressao;
            posfixo = prefixoParaPosfixo(expressao);
            infixo = posfixoParaInfixo(posfixo);
            resultado = calcular(posfixo);
        } else { // posfixa
            posfixo = expressao;
            infixo = posfixoParaInfixo(expressao);
            prefixo = posfixoParaPrefixo(posfixo);
            resultado = calcular(posfixo);
        }

        System.out.println("Expressão infixa: " + infixo);
        System.out.println("Expressão pós-fixa: " + posfixo);
        System.out.println("Expressão pré-fixa: " + prefixo);
        System.out.println("Resultado: " + resultado);
    }

    private int calcular(String posfixo) {
        Stack<Integer> pilha = new Stack<>();
        String[] partes = posfixo.split(" ");
        for (String parte : partes) {
            if (isOperador(parte)) {
                int a = pilha.pop();
                int b = pilha.pop();
                switch (parte) {
                    case "+":
                        pilha.push(a + b);
                        break;
                    case "-":
                        pilha.push(b - a);
                        break;
                    case "*":
                        pilha.push(a * b);
                        break;
                    case "/":
                        pilha.push(b / a);
                        break;
                }
            } else {
                pilha.push(Integer.parseInt(parte));
            }
        }
        return pilha.pop();
    }

    private boolean isOperador(String str) {
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    private String infixoParaPosfixo(String expressao) {
        Stack<String> pilha = new Stack<>();
        StringBuilder saida = new StringBuilder();
        String[] partes = expressao.split(" ");

        for (String parte : partes) {
            if (isOperador(parte)) {
                while (!pilha.isEmpty() && isOperador(pilha.peek())) {
                    saida.append(pilha.pop()).append(" ");
                }
                pilha.push(parte);
            } else if (parte.equals("(")) {
                pilha.push(parte);
            } else if (parte.equals(")")) {
                while (!pilha.peek().equals("(")) {
                    saida.append(pilha.pop()).append(" ");
                }
                pilha.pop();
            } else {
                saida.append(parte).append(" ");
            }
        }

        while (!pilha.isEmpty()) {
            saida.append(pilha.pop()).append(" ");
        }

        return saida.toString().trim();
    }

    private String posfixoParaInfixo(String expressao) {
        Stack<String> pilha = new Stack<>();
        String[] partes = expressao.split(" ");

        for (String parte : partes) {
            if (isOperador(parte)) {
                String a = pilha.pop();
                String b = pilha.pop();
                pilha.push("(" + b + " " + parte + " " + a + ")");
            } else {
                pilha.push(parte);
            }
        }

        return pilha.pop();
    }

    private String prefixoParaPosfixo(String expressao) {
        Stack<String> pilha = new Stack<>();
        String[] partes = expressao.split(" ");
        Collections.reverse(Arrays.asList(partes));

        for (String parte : partes) {
            if (isOperador(parte)) {
                String a = pilha.pop();
                String b = pilha.pop();
                pilha.push(a + " " + b + " " + parte);
            } else {
                pilha.push(parte);
            }
        }

        return pilha.pop();
    }

    private String posfixoParaPrefixo(String expressao) {
        Stack<String> pilha = new Stack<>();
        String[] partes = expressao.split(" ");

        for (String parte : partes) {
            if (isOperador(parte)) {
                String a = pilha.pop();
                String b = pilha.pop();
                pilha.push(parte + " " + b + " " + a);
            } else {
                pilha.push(parte);
            }
        }

        return pilha.pop();
    }
}


