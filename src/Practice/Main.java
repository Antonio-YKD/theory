package Practice;

public class Main {
	public static void main(String[] args) {

		
		MusicalEvent event = new MusicalEvent(1,"a","b","c",2,3,new Artist("si","nunca"),"salsa");
		event.addSong("abra cadabra");
		event.getMusic();
		
		
		
	}
}
