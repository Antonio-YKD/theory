package Practice;

public class MuseumEvent extends Event {

	String exposition;
	String typeOfExposition;
	WorkOfArt works[];
	
	
	public MuseumEvent(int id, String title, String location,String date, int capacity, float ticket,String exposition, String typeOfExposition) {
		super(id,title,location,date,capacity,ticket);
		
		this.exposition = exposition;
		this.typeOfExposition = typeOfExposition;

	}
	
	public String getExposition() {
		return this.exposition;
	}
	public String getTypeOfExposition() {
		return this.typeOfExposition;
	}
	
	public void setExposition (String exposition) {
		this.exposition = exposition;
	}
	public void setTypeOfExposition(String typeOfExposition) {
		this.typeOfExposition = typeOfExposition;
	}
	
	
}
