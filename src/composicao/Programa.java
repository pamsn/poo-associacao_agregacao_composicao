package composicao;

public class Programa {
	
	// Neste exemplo, a classe Carro possui um objeto Motor, e o ciclo de vida do motor depende do carro. 

	public static void main(String[] args) {
		Carro carro = new Carro("Toyota", "Motor V6");

        System.out.println("Carro: " + carro.getMarca());
        System.out.println("Motor: " + carro.getMotor().getTipo());

	}

}
