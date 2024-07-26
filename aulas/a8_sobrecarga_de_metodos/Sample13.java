// Sobrecarga de Métodos

package aulas.a8_sobrecarga_de_metodos;

public class Sample13 {
    public static void main(String[] args) {
        double areaTriangulo = Poligono.calcArea(10f, 5f); // 2 parâmetros -Cria um triangulo
        double areaQuadrado = Poligono.calcArea(5f); // 1 parâmetro - Cria um quadrado

        System.out.println("areaTriangulo: " + areaTriangulo);
        System.out.println("areaQuadrado: " + areaQuadrado);
    }
}
