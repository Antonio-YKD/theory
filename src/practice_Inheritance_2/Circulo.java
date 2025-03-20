package practice_Inheritance_2;

public class Circulo extends Figura{

	double area;
	double pi = 3.1416;
	double radio;
	
	@Override
	public void calcularArea(double radio) {
		area = pi * (radio * radio);
		System.out.println("El area es: "+area);
	}
}
