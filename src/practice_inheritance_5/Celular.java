package practice_inheritance_5;

public class Celular extends DispositivoElectronico {

	String marcaDeCelular = "Chaifon";
	String modeloDeCelular = "ChaifonProMax";
	
	@Override
	public void encender() {
		this.marca = marcaDeCelular;
		this.modelo = modeloDeCelular;
		System.out.println("La marca del celular es: "+marca +"\n");
		System.out.println("El modelo del celular es: "+modelo +"\n");
		
	}
	
}
