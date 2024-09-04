package Tree;

public class Node<Data> {

	Data data;
	Node<Data> parent;
	Node<Data> left;
	Node<Data> right;
	
	// Constructor
	Node(Data data) { 
		this.data = data;
		parent = null;
		left = null;
		right = null;
	}
	
	// Setters
	public void setData(Data data) {
		this.data = data;
	}
	
	public void setParent(Node<Data> parent) {
		this.parent = parent;
	}
	
	public void setLeft(Node<Data> left) {
		this.left = left;
	}
	
	public void setRight(Node<Data> right) {
		this.right = right;
	}
	
	public void setLeftRight(Node<Data> left, Node<Data> right) {
		this.left = left;
		this.right = right;
	}
	
	// Getters
	public Data getData() {
		return data;
	}
	
	public Node<Data> getParent() {
		return parent;
	}
	
	public Node<Data> getLeft() {
		return left;
	}
	
	public Node<Data> getRight() {
		return right;
	}
	
	// Methods
	@Override
	public String toString() {
		return (data != null ? data.toString() : "null");
	}
	
	public boolean isRoot() {
		return parent == null;
	}
	
	public boolean isLeaf() {
		return right == null && left == null;
	}
	
	public int getDegree() {
		if (right != null && left != null) return 2;
		else if (right != null || left != null) return 1;
		else return 0;
	}
	
	public int getLevel() {
		if (isRoot()) return 0;
		else return parent.getLevel() + 1;
	}
	
	public int getHeight() {
		
		int h;
		if (isLeaf()) return h = 0;
		else if (left == null && right != null) h = 1 + right.getHeight();
		else if (right == null && left != null) h = 1 + left.getHeight();
		else h = (left.getHeight() > right.getHeight()) ? 1 + left.getHeight() : 1 + right.getHeight();
		return h;
		
		
	}
	
	
}
