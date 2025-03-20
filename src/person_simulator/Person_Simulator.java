package person_simulator;

import java.time.LocalDate;


public class Person_Simulator {
	public static void main (String[] args) {
		
		String name = "yoking";
		String surname = "dust";
		LocalDate date = LocalDate.of(2000, 2, 3);
		String gender = "god";
		
		
		
		person practice = new person(name,surname,date,gender);
		practice.introduce();
		practice.checkStatus();
		practice.ejercitarse();
		practice.dormir();
		practice.ejercitarse();
		practice.despertar();
		practice.despertar();
		practice.trabajar();
		practice.trabajar();

	}
}
