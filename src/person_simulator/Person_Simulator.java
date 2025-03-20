package person_simulator;

import java.time.LocalDate;


public class Person_Simulator {
	public static void main (String[] args) {
		
		String name = "yoking";
		String surname = "dust";
		LocalDate date = LocalDate.of(2000, 2, 3);
		String gender = "god";
		
		
		
		Person practice = new Person(name,surname,date,gender);
		practice.introduce();
		practice.checkStatus();
		practice.exercise();
		practice.checkStatus();
	}
}
