package aulas.a10_herança;

public class Veiculo {
    public String cor;
    public int numRodas;
    public int litrosTanque;
    public String motor;
    public int numAssentos;

    public Veiculo(String cor, int numRodas, int litrosTanque, String motor, int numAssentos) {
        this.cor = cor;
        this.numRodas = numRodas;
        this.litrosTanque = litrosTanque;
        this.motor = motor;
        this.numAssentos = numAssentos;
    }

    public void andar() {
        System.out.println("Andando...");
    }
}
