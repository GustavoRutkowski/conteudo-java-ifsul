// ArrayList

package aulas.a9_arrays;

import java.util.ArrayList;

public class Sample15 {
    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        listaNomes.add("Gustavo");
        listaNomes.add("Bruna");
        listaNomes.add("Davi");
        listaNomes.add("Bernardo");
        
        System.out.println("Array listaNomes: " + listaNomes);
        System.out.println("Primeiro elemento: " + listaNomes.get(0));

        System.out.println("Removendo valores:");
        listaNomes.remove("Bernardo");
        listaNomes.remove(2);
        System.out.println("Novo ArrayList: " + listaNomes);

        System.out.println("Iterando o Array de Nomes:");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // size() -> descobre o tamanho do array
        // isEmpty() -> descobre se o array está vazio
        // indexOf() -> descobre o índice de um elemento

        // ArrayLists podem aumentar seu tamanho conforme o necessário.
    }
}
