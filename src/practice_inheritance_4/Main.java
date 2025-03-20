package practice_inheritance_4;

public class Main {
	public static void main(String[] args) {

		String name = "Lola";
		double bono = 2000;

		Gerente gerente = new Gerente(name, bono);
		System.out.println();

		String nameD = "Lolo";
		double bonoD = 1500;

		Desarrollador desarrollador = new Desarrollador(nameD, bonoD);
		System.out.println();
	}
}
