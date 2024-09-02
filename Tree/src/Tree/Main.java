package Tree;

public class Main {

	public static void main(String[] args) {
		
		Node<Integer> n1 = new Node<>();
		Node<Integer> n1_1 = new Node<>(); 
		
		System.out.println(n1);
		
		n1.setData(5);
		
		System.out.println(n1);
		
		n1.setRight(n1_1);
		printNode(n1);

	}
	
	private static <Data> void printNode(Node<Data> node) {
		
		System.out.println("Parent:\n|\n— Data: " + node.data + "\n|\n— Left: " + node.left + "\n|\n—Right: " + node.right);
		
		
	}

}
