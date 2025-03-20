package Practice;

public class Event {
	int id;
	String title;
	String location;
	String date;
	int capacity;
	float ticket;

	public Event(int id, String title, String location, String date, int capacity, float ticket) {
		this.id = id;
		this.title = title;
		this.location = location;
		this.date = date;
		this.capacity = capacity;
		this.ticket = ticket;
		System.out.println("Se ha creado el evento");
	}

	public int getId() {
		return this.id;
	}

	public String getTitle() {
		return this.title;
	}

	public String getLocation() {
		return this.location;
	}

	public String getDate() {
		return this.date;
	}

	public int getCapacity() {
		return this.capacity;
	}

	public float getTicket() {
		return this.ticket;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;

	}

	public void setLocation(String location) {
		this.location = location;

	}

	public void setDate(String date) {
		this.date = date;

	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;

	}

	public void setTicket(float ticket) {
		this.ticket = ticket;

	}

}
