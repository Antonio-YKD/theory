package practice_inheritance_3;

public class Auto extends Vehiculo {
	
	
	
	public Auto () {
		this.velocidadMaxima = 80;
	}

	@Override
	public void mostrarVelocidadMaxima() {
		System.out.println("La velocidad maxima del auto es: "+velocidadMaxima);
	}
}
