package practice_Inheritance;

public class Animal {

	int age;
	String name;
	String type;

	public Animal(String name, int age, String type) {
		this.age = age;
		this.name = name;
		this.type = type;
	}

	public void hacerSonido() {
		System.out.println("hace sonido");
	}

	public void introduce() {
		System.out.printf("Su nombe es %s, su edad es %d años\n", name, age);
	}

}
