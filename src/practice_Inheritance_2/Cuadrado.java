package practice_Inheritance_2;

public class Cuadrado extends Figura {

	int side = 0;
	
	@Override
	public void calcularArea(int side) {
		 this.side = side;
		 double areaOfSquare = side * side;
		System.out.println("El area es: "+areaOfSquare);
	 } 
	
}
