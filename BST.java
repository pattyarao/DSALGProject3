package project3;

public class BST {

	private Node rootNode;

	public BST() {
		// TODO: your code here
		this.rootNode = null;
	}

	public void insert(int data) {
		// TODO: your code here
	}

	public Node insertRecursion(Node root, int data) {

		if (root == null) {
			root = new Node(data, null, null);
			return root;
		} else if (data < root.getData()) {
			root = insertRecursion(root.getLeftNode(), data);
		} else {
			root = insertRecursion(root.getRightNode(), data);
		}
		return root;
	}

	public Node search(int x) {
		// TODO: your code here
		return searchRecursion(root, x);

	}

	public Node searchRecursion(Node node, int data) {
		if (node == null) {
			return null;
		}

		if (node.getData() == data) {
			return node;
		} else if (data < node.getData()) {
			return searchRecursion(node.getLeftNode(), data);
		} else {
			return searchRecursion(node.getRightNode(), data);
		}
	}

	public void inOrder() {
		// TODO: your code here
	}

	public void preOrder() {
		// TODO: your code here
	}

	public void postOrder() {
		// TODO: your code here
	}

	public Node maximum() {
		// TODO: your code here
	}

	public Node minimum() {
		// TODO: your code here
	}

	public Node parent(int data) {
		// TODO: your code here
	}

	public Node successor(int data) {
		// TODO: your code here
	}

	public Node predecessor(int data) {
		// TODO: your code here
	}
}
