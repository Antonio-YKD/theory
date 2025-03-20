package practice_inheritance_4;

public class Gerente extends Empleado {

	double bono;
	double salarioFinal;

	public Gerente(String name, double bono) {
		this.nombre = name;
		salarioFinal = salarioBase + bono;
		System.out.println("Salario final del Gerente: "+salarioFinal);
	}
}
