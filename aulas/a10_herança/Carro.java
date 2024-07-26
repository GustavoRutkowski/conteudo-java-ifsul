package aulas.a10_herança;

public class Carro extends Veiculo {
    public int quantPortas;
    public Boolean aerofolio;

    public Carro(int quantPortas, Boolean aerofolio, String cor, int numRodas, int litrosTanque, String motor, int numAssentos) {
        super(cor, numRodas, litrosTanque, motor, numAssentos);

        this.quantPortas = quantPortas;
        this.aerofolio = aerofolio;
    }
}
