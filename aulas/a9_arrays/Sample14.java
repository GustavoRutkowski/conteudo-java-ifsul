// Arrays

package aulas.a9_arrays;

public class Sample14 {
    public static void main(String[] args) {
        String[] listaNomes = {"Gustavo", "Bruna", "Davi", "Bernardo", "João"};
        
        System.out.println("Array listaNomes: " + listaNomes);
        System.out.println("Tamanho do Array: " + listaNomes.length);
        System.out.println("Primeiro elemento: " + listaNomes[0]);

        System.out.println("Iterando o Array de Nomes:");

        // Iterando arrays

        for (String nome : listaNomes) {
            System.out.println(nome);
        }

        // Arrays possuem tamanho Fixo no Java.
    }
}
