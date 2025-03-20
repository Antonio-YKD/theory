package person_simulator;

import java.time.LocalDate;

public class Person {

	int id;
	String name;
	String surname;
	LocalDate date;
	String gender;
	int energy = 100;
	String status = "reposando";
	String friends[];
	String pets[];
	String hobbys[];

	public Person(String name, String lastName, LocalDate date, String gender) {
		this.id = id;
		this.name = name;
		this.surname = lastName;
		this.date = date;
		this.gender = gender;
		this.energy = energy;
		this.status = status;
		this.friends = friends;
		this.pets = pets;
		this.hobbys = hobbys;
		System.out.printf("has creado a %s \n", name);
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public String getGender() {
		return this.gender;
	}

	public int getEnergy() {
		return this.energy;
	}

	public String getStatus() {
		return this.status;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void introduce() {
		System.out.printf("Hola, mi nombre es %s %s \n", name, surname);
	}

	public void checkStatus() {
		System.out.printf("%s %s está %s \n", name, surname, status);
	}

	public void exercise() {
		if (status.equals("ejercitandose")) {
			System.out.println("Ya estas ejercitandote");
			return;
		}
		if (status.equals("durmiendo")) {
			System.out.println("debes de despertar primero");
			return;
		}
		if (energy < 25) {
			System.out.println("No tienes la suficiente energia");
			return;
		}
		System.out.printf("%s se ejercita \n", name);
		int energyRemaining = energy -= 25;
		System.out.printf("energia restante %d \n", energyRemaining);
		this.status = "ejercitandose";
	}

	public void sleep() {
		if (status.equals("durmiendo")) {
			System.out.println("Ya estas dormido");
			return;
		}
		if (!status.equals("reposando")) {
			System.out.println("No se ha podido completar la accion, no estas reposando");
			return;
		}
		System.out.printf("%s se fue a dormir \n", name);
		energy = 100;
		this.status = "durmiendo";
		System.out.printf("la energia se ha restaurado (Energia disponible %d) \n", energy);

	}

	public void wakeUp() {
		if (!status.equals("durmiendo")) {
			System.out.println("No es posible completar la acción, no estas dormido");
			return;
		}
		System.out.printf("%n ha despertado \n", name);
		this.status = "reposando";
	}

	public void rest() {
		if (!status.equals("ejercitarse") && !status.equals("trabajar ") && !status.equals("ocio")) {
			System.out.println("La accion no ha podido completarse, no mereces un descanso ");
			return;
		}
		System.out.printf("%s ha decidido tomar un descanso \n", name);
		this.status = "reposando";
	}

	public void toWork() {
		if (status.equals("trabajando")) {
			System.out.println("Ya estas trabajando");
			return;
		}
		if (status.equals("durmiendo")) {
			System.out.println("debes de despertar primero");
			return;
		}
		if (energy < 50) {
			System.out.println("no tienes la energia suficiente");
			return;
		}
		System.out.printf("%s se ha puesto a trabajar \n", name);
		this.energy -= 50;
		this.status = "trabajando";
	}

	public void leisure() {
		if (status.equals("ocio")) {
			System.out.println("ya estas en estado de ocio");
			return;
		}
		if (status.equals("durmiendo")) {
			System.out.println("debes de despertar primero");
			return;
		}
		if (energy < 25) {
			System.out.println("No has podido realizar la actividad por falta de energia");
			return;
		}
		System.out.printf("%s ha tomado un espacio de ocio \n", name);
		this.energy -= 25;
		this.status = "ocio";
	}

}
