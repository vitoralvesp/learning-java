package edii;

public class Movie {
	
	private String title;
	private short year;
	private float rate;
	
	// Constructors
	public Movie() {
		title = "Default Movie";
		year = 2000;
		rate = 8.5f;
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
	
	public Object[] getAll() {
		return new Object[] { title, year, rate };
	}
	
	
	// Setters
	

}
