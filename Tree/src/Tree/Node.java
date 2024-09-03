package Tree;

public class Node<Data> {

	Data data;
	Node<Data> parent;
	Node<Data> left;
	Node<Data> right;
	
	// Constructor
	Node() { 
		data = null;
		parent = null;
		left = null;
		right = null;
	}
	
	public Node(Data data, Node<Data> parent, Node<Data> left, Node<Data> right) { 
		this.data = data;
		this.parent = parent;
		this.left = left;
		this.right = right;
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
	public <Data extends Node<Data>> Data getData(Data data) {
		return data;
	}
	
	public <Data extends Node<Data>> Data getParent(Data parent) {
		return parent;
	}
	
	public <Data extends Node<Data>> Data getLeft(Data left) {
		return left;
	}
	
	public <Data extends Node<Data>> Data getRight(Data right) {
		return right;
	}
	
	// Methods
	@Override
	public String toString() {
		return (data != null ? data.toString() : "null");
	}
	
	public int isRoot() {
		return (parent == null ? 1 : 0);
	}
	
	public int isLeaf() {
		return (right == null && left == null ? 1 : 0);
	}
	
	public int getDegree() {
		if (right != null && left != null) return 2;
		else if (right != null || left != null) return 1;
		else return 0;
	}
	
	
	
}
