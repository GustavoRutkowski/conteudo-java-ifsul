package aulas.a10_herança;

public class Moto extends Veiculo {
    public Moto(String cor, int litrosTanque, String motor, int numAssentos) {
        super(cor, 2, litrosTanque, motor, numAssentos);
    }

    public void darGrau() {
        System.out.println("VRRUUUUUUM!! Pega o grau do Pai");
    }
}
