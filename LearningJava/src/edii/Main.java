package edii;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static String Menu() {
		return "\n1. Load Data\n2. See Data\n3. Exit";
	}

	public static void main(String[] args) {
		
		Movie[] movie;
		movie = new Movie[100];
		Scanner scanner = new Scanner(System.in);
		int option = 0;

		while (option != 3) {
			
			System.out.println(Menu());
			System.out.print("\n>> Enter an option: ");
			option = scanner.nextInt();
			
			
			switch(option) {
			
				case 1:
					
					try {
						System.out.println(">> Loading Data...\n");
						
						File file = new File("G:\\Meu Drive\\PARA\\Areas\\cs\\programming-technologies\\learning-java\\LearningJava\\src\\edii\\imdb.txt");
						Scanner fileReader = new Scanner(file);
						String data;
						while (fileReader.hasNextLine()) {
							for (int i = 0; i < 3; i++) {
								data = fileReader.nextLine();
								movie[i] = new Movie(data);
							}
							
						}
						fileReader.close();
						
					} catch (FileNotFoundException e) {
						System.out.println(">> Error Reading File...\n");
						e.printStackTrace();
					}
					
					break;
				
				
				case 2:
					
					int movie_list_size = movie.length;
					for (int i = 0; i < movie_list_size; i++)
						System.out.println(">> " + movie[i].getTitle() + "(" + movie[i].getYear() + ") " + movie[i].getRate());
					
					break;
				
				
				case 3:
					System.out.println(">> Exiting...");
					break;
				
				
				default:					
					System.out.println(">> Invalid Option!!!");
					break;
					
			}
			
		}
			
	}

}
