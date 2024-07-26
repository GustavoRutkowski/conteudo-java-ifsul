// Seleções

package aulas.a3_selecao;

import java.util.Scanner;

public class Sample6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra em PT-BR: ");
        String palavraPtBr = sc.nextLine();

        sc.close();

        switch (palavraPtBr) {
            case "vermelho":
                System.out.println("red");

                break;

            case "verde":
                System.out.println("green");

                break;

            case "azul":
                System.out.println("blue");

                break;
        
            default:
                System.out.println("Palavra não reconhecida...");

                break;
        }
    }
}
