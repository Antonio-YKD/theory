package Practice;

import java.util.ArrayDeque;

public class MusicalEvent extends Event {

	Artist artist;
	Artist guestArtists[];
	String musicalGenre;
	ArrayDeque <Song> songs;
	

	public MusicalEvent(int id, String title, String location,String date, int capacity, float ticket, Artist artist, String musicalGenre) {
		super(id,title,location,date,capacity,ticket);
		this.artist = artist;
		this.musicalGenre = musicalGenre;
		songs = new ArrayDeque ();
		System.out.println("El Evento musical ha sido creado");

	}
	
	public Artist getArtist() {
		return this.artist;
	}
	public String getMusicalGenre() {
		return this.musicalGenre;
	}
	 
	public void setArtist (Artist artist) {
		this.artist = artist;
	}
	
	public void setMusicalGenre(String musicalGenre) {
		this.musicalGenre = musicalGenre;
	}
	 
	public void getMusic() {
		Song[] auxSongs = songs.toArray(new Song[0]);
		for(int i = 0; i<auxSongs.length;i++) {
		System.out.println(auxSongs[i].titleOfSong);
		}
	}
	public void addSong (String title) {
		songs.add(new Song (title));
	}
	
}
