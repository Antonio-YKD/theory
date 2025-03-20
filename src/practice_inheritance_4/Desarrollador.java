package practice_inheritance_4;

public class Desarrollador extends Empleado {

	double bono;
	double salarioFinal;

	public Desarrollador(String name, double bono) {
		this.nombre = name;
		salarioFinal = salarioBase + bono;
		System.out.println("Salario final del Desarrollador: "+salarioFinal);

	}
}
