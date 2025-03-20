package practice_Inheritance;

public class Perro extends Animal {


	public Perro(String name, int age, String type) {
		super(name, age, type);
		this.name = name;
		this.age = age;
		this.type = type;
	}

	@Override
	public void hacerSonido() {
		System.out.println("Guau guau...");
	}

}