package practice_Inheritance;

public class MainAnimals {
	public static void main(String[] args) {

		// perro
		int age = 2;
		String name = "copito";
		String type = "perro pastor aleman";

		Dog perro = new Dog(name, age, type);
		perro.introduce();
		perro.hacerSonido();

		// gato
		int ageOfCat = 4;
		String nameOfCat = "negrito";
		String typeOfCat = "gato naranja";

		Cat Cat = new Cat(nameOfCat, ageOfCat, typeOfCat);
		Cat.introduce();
		Cat.hacerSonido();

	}
}
