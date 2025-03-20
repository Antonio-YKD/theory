package practice_Inheritance;

public class Cat extends Animal {


	public Cat(String name, int age, String type) {
		super(name, age, type);
		this.name = name;
		this.age = age;
		this.type = type;
	}

	@Override
	public void hacerSonido() {
		System.out.println("Miau miau...");
	}
}
