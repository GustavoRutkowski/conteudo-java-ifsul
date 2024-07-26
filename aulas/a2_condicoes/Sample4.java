// Condições

package aulas.a2_condicoes;

import java.util.Scanner;

public class Sample4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        sc.close();

        if (numero == 0) {
            System.out.println("Número nulo!");
        } else if (numero < 0) {
            System.out.println("Número negativo!");
        } else {
            System.out.println("Número positivo!");
        }
    }
}
