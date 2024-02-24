package FirstList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int integer_one = 0;
		int integer_two = 0;
		String output = " ";
		
		System.out.print(">> enter two values x and y: ");
		integer_one = scanner.nextInt();
		integer_two = scanner.nextInt();
		
		ExOne ex_one = new ExOne(integer_one, integer_two);
		output = ex_one.Getter();
		System.out.println(output);
		
		scanner.close();
	}

}
