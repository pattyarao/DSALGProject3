package project3;

public class BST {

	private Node rootNode;

	public BST() {
		//TODO: your code here
		this.rootNode = null;
	}
	
	public void insert(int data) {
		//TODO: your code here
	}

	public Node insertRecursion(Node root, int data){

		if (root == null){
			root = new Node(data, null, null);
			return root;
		}
		else if (data < root.getData()){
			root = insertRecursion(root.getLeftNode(), data);
		}
		else {
			root = insertRecursion(root.getRightNode(), data);
		}
		return root;
	}
	
	public void inOrder() {
		//TODO: your code here
	}
	
	public void preOrder() {
		//TODO: your code here
	}
	
	public void postOrder() {
		//TODO: your code here
	}
	
	public Node maximum() {
		//TODO: your code here
	}
	
	public Node minimum() {
		//TODO: your code here
	}
	
	public Node parent(int data) {
		//TODO: your code here
	}
	
	public Node successor(int data) {
		//TODO: your code here
	}
	
	public Node predecessor(int data) {
		//TODO: your code here
	}
}
