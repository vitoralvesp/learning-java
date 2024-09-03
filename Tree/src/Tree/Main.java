package Tree;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Node<Integer> node_n = new Node<>();
		
		Scanner scanner = new Scanner(System.in);
		String input;
		
		
		while (true) {
			
			
			System.out.print("\nMENU:\n[ 1 ] - CREATE A NODE\n\nCHOOSE AN OPTION: ");
			input = scanner.nextLine();
			//scanner.nextLine();
			
			switch (input) {
				
				case "1":
					
					System.out.println("+----------------------------------+");
					System.out.println("You chose option 1: create a node");
					System.out.println("+----------------------------------+");
					
					System.out.println("\nEnter the data type and value for the new node: ");
					input = scanner.nextLine();
					
					if (node_n.isRoot() == 1) {
						
						String node_datatype = input.split(" ")[0];
						int node_data;
						switch(node_datatype) {
						
							case "int":
								node_data = Integer.parseInt(input.split(" ")[1]);
								node_n.setData(node_data);
								break;
								
							case "float":
								node_data = Float.parseFloat(input.split(" ")[1]);
								
							
						}
						
					}
					
					
					System.out.println(node_n.toString());					
					break;
				
				
				case "0":
					System.out.println("\nEXITING...");
				
					
				default:
					
					System.out.println("WRONG OPTION!!! TRY AGAIN...");
					continue;
					
			}
			
		}

	}

}
