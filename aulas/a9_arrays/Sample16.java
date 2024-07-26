// Stacks

package aulas.a9_arrays;

import java.util.Stack;

public class Sample16 {
    public static void main(String[] args) {
        Stack<String> pilhaNomes = new Stack<>();

        // Adicionando nomes
        pilhaNomes.push("Alfredo");
        pilhaNomes.push("Rodolfo");
        pilhaNomes.push("Cláudio");
        pilhaNomes.push("José");

        System.out.println("Pilha: " + pilhaNomes);
        System.out.println("Topo da Pilha: " + pilhaNomes.peek());
        
        // Removendo nomes
        pilhaNomes.pop();
        pilhaNomes.pop();

        System.out.println("Pilha: " + pilhaNomes);

        System.out.println("Pilha vazia? " + pilhaNomes.empty());

    }
}
