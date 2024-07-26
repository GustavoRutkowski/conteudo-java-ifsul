// Condições com String

package aulas.a2_condicoes;

import java.util.Scanner;

public class Sample5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a senha correta: ");
        String senhaTentada = sc.nextLine();

        sc.close();
        
        if (senhaTentada.equals("1234")) { // a.equals(b) compara duas strings
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}
