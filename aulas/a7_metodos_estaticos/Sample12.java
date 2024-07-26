// Métodos Estáticos

package aulas.a7_metodos_estaticos;

public class Sample12 {
    public static void main(String[] args) {
        double valorSoma = Calculadora.somar(16, 17); // Não precisa ser instanciada.
        double valorSub = Calculadora.subtrair(10, 6);

        System.out.println("valorSoma: " + valorSoma);
        System.out.println("valorSub: " + valorSub);
    }
}
