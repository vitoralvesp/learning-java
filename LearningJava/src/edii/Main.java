package edii;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		
		System.out.println(movie.getTitle());
		System.out.println(movie.getYear());
		System.out.println(movie.getRate());
		
		System.out.println(Arrays.toString(movie.getAll()));
		
	}

}
