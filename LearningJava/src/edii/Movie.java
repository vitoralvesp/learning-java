package edii;

public class Movie {
	
	private String title;
	private short year;
	private float rate;
	
	// Constructors
	public Movie() {
		title = "N/A";
		year = 0;
		rate = 0.0f;
	}
	
	public Movie(String title) {
		this.title = title;
	}
	
	public Movie(short year) {
		this.year = year;
	}
	
	public Movie(float rate) {
		this.rate = rate;
	}
	
	public Movie(String title, short year, float rate) {
		this.title = title;
		this.year = year;
		this.rate = rate;
	}
	
	
	// Getters
	public String getTitle() {
		return title;
	}
	
	public short getYear() {
		return year;
	}
	
	public float getRate() {
		return rate;
	}
	
	/*
	public Object[] getAll() {
		return new Object[] { title, year, rate };
	}
	*/
	
	
	// Setters
	public void setTitle(String new_title) {
		this.title = new_title;
	}
	
	public void setYear(short new_year) {
		this.year = new_year;
	}
	
	public void setRate(float new_rate) {
		this.rate = new_rate;
	}
	
	
	@Override
	public String toString() {
		return "Title: " + getTitle() + " (" + getYear() + ") " + getRate();
	}
	
	
	
	

}
