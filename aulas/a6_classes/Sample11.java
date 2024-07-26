// Classes

package aulas.a6_classes;

public class Sample11 {
    public static void main(String[] args) {
        Pessoa publicInstance = new Pessoa("Gustavo R. L.", 16, 1.90f);

        System.out.println("publicInstance: " + publicInstance);
        System.out.println("publicInstance.fullName: " + publicInstance.fullName);
        System.out.println("publicInstance.age: " + publicInstance.age);
        System.out.println("publicInstance.height: " + publicInstance.height);
    }
}
