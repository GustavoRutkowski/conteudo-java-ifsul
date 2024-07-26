package aulas.a8_sobrecarga_de_metodos;

public class Poligono {
    public static double calcArea(float lado) {
        return (double) lado * lado;
    }

    public static double calcArea(float base, float altura) {
        return (double) (base * altura) / 2;
    }

    // Obs.: A sobrecarga também pode ser feita nos métodos construtores.
}
