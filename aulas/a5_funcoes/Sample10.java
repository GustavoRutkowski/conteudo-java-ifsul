// Funções / Métodos

package aulas.a5_funcoes;

public class Sample10 {
    // Função de soma

    public static int sum(int num1, int num2) {
        int result = num1 + num2;

        return result;
    }

    // Função de mostrar na tela formatado

    public static void show(String texto) {
        System.out.println("------------------------------");
        System.out.println(texto);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) { // "void" significa que não há retorno.
        int result = sum(10, 5);

        show("Resultado da soma: " + result);
    }
}
