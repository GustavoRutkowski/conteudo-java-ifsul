// Comando de Saída

package aulas.a0_entrada_e_saida;

import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        // String -->
            // 1. sc.nextLine(); --> O texto da linha inteira
            // 2. sc.next(); --> A primeira palavra antes de um espaço em branco
        // int --> sc.nextInt();
        // long --> sc.nextLong();
        // float --> sc.nextFloat();
        // double --> sc.nextDouble();

        String frase = sc.nextLine();

        sc.close(); // fecha o scanner

        System.out.println("Frase digitada: " + frase);
    }
}
