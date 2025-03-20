package practice_inheritance_5;

public class Laptop extends DispositivoElectronico{

	String marcaDeLaptop = "MalBook";
	String modeloDeLaptop = "Malbook Pro";
	
	@Override
	public void encender() {
		this.marca = marcaDeLaptop;
		this.modelo = modeloDeLaptop;
		
		System.out.println("La marca de la laptop es: "+marca+"\n");
		System.out.println("El modelo de laptop es: "+modelo+"\n");
	}
}
