package practice_Inheritance;

public class perro extends Animal {


	public perro(String name, int age, String type) {
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