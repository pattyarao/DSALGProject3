package project3;

public class BST {

	private Node rootNode;

	public BST() {
		// TODO: your code here
		this.rootNode = null;
	}

	public void insert(int data) {
		//TODO: your code here
		this.rootNode = insertRecursion(this.rootNode,data);
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
		return searchRecursion(this.rootNode, x);

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
		return parentSearch(this.rootNode,data);
	}

	public Node parentSearch(Node node, int data){
		if (node.getData() == data || (node.getLeftNode() == null
				&& node.getRightNode() == null)){
			return null;
		}

		if (node.getLeftNode() != null && node.getLeftNode().getData() == data){
			return node;
		}
		else if (node.getRightNode() != null && node.getRightNode().getData() == data){
			return node;
		}
		else if (data < node.getData()) {
			return parentSearch(node.getLeftNode(), data);
		} else {
			return parentSearch(node.getRightNode(), data);
		}

	}


	public Node successor(int data) {
		// TODO: your code here

		Node temp = search(data);

		if (temp.getRightNode() != null){
			return minFinder(temp.getRightNode());
		}

		Node parentNode = parent(data);

		while (parentNode != null &&
				temp.getData() == parentNode.getRightNode().getData()
				&& parentNode.getRightNode() != null){
			temp = parentNode;
			parentNode = parent(parentNode.getData());
		}

		return parentNode;
	}

	public Node minFinder(Node node){
		Node temp = node;
		while (temp.getLeftNode() != null){
			temp = temp.getLeftNode();
		}

		return temp;
	}

	public Node predecessor(int data) {
		// TODO: your code here

		Node temp = search(data);

		if (temp.getLeftNode() != null){
			return maxFinder(temp.getLeftNode());
		}

		Node parentNode = parent(data);

		while (parentNode != null
				&& temp.getData() == parentNode.getLeftNode().getData()
				&& parentNode.getLeftNode() != null){
			temp = parentNode;
			parentNode = parent(parentNode.getData());
		}

		return parentNode;
	}

	public Node maxFinder(Node node){
		Node temp = node;
		while (temp.getRightNode() != null){
			temp = temp.getRightNode();
		}

		return temp;
	}
}
