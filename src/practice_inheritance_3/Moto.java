package practice_inheritance_3;

public class Moto extends Vehiculo {

	
	
	public Moto() {
		this.velocidadMaxima = 50;
	}
	
	@Override
	public void mostrarVelocidadMaxima() {
		System.out.println("La velocidad maxima de la moto es: "+velocidadMaxima);
	}
	
	
}
