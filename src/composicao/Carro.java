package composicao;

public class Carro {
	private String marca;
    private Motor motor;

    public Carro(String marca, String tipoMotor) {
        this.marca = marca;
        this.motor = new Motor(tipoMotor); // Composição ocorre aqui
    }

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
    
    

}
