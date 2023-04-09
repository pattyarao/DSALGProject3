package project3;

public class BST {

	private Node rootNode;

	public BST() {
		// TODO: your code here
		this.rootNode = null;
	}

	public Node getRoot(){
		return this.rootNode;
	}

	public void printRootNode(){
		System.out.println(this.rootNode.getData());
		System.out.println(this.rootNode.getLeftNode().getData());
		System.out.println(this.rootNode.getRightNode().getData());
	}

	public void insert(int data) {
		// TODO: your code here
		this.rootNode = insertRecursion(this.rootNode, data);
	}

	public Node insertRecursion(Node root, int data) {

		if (root == null) {
			root = new Node(data, null, null);
			return root;
		} else if (data < root.getData()) {
			root.setLeftNode(insertRecursion(root.getLeftNode(), data));
		} else {
			root.setRightNode(insertRecursion(root.getRightNode(), data));
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
		inOrderRecursion(this.rootNode);
	}

	// helper function for In Order Recursion
	public void inOrderRecursion(Node node) {
		if (node == null) {
			return;
		}

		inOrderRecursion(node.getLeftNode());
		System.out.print(node.getData() + " ");
		inOrderRecursion(node.getRightNode());
	}

	public void preOrder() {
		// TODO: your code here
		preOrderRecursion(this.rootNode);
	}

	// helper function for Pre Order Recursion
	public void preOrderRecursion(Node node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preOrderRecursion(node.getLeftNode());
			preOrderRecursion(node.getRightNode());
		}
	}

	public void postOrder() {
		postOrderRecursion(this.rootNode);
	}

	public void postOrderRecursion(Node node) {
		if (node != null) {
			postOrderRecursion(node.getLeftNode());
			postOrderRecursion(node.getRightNode());
			System.out.print(node.getData() + " ");
		}
	}

	public Node maximum() {
		Node currentNode = this.rootNode;

		if (this.rootNode == null) {
			return null;
		}

		while (currentNode.getRightNode() != null) {
			currentNode = currentNode.getRightNode(); // go to right of the tree until
														// we get to the largest/max value
		}

		return currentNode;
	}

	public Node minimum() {
		Node currentNode = this.rootNode;

		if (this.rootNode == null) {
			return null;
		}

		while (currentNode.getLeftNode() != null) {
			currentNode = currentNode.getLeftNode(); // go to left of the tree until
														// we get to the smallest/min value
		}

		return currentNode;
	}

	public Node parent(int data) {
		// TODO: your code here
		return parentSearch(this.rootNode, data);
	}

	public Node parentSearch(Node node, int data) {
		if (node.getData() == data || (node.getLeftNode() == null
				&& node.getRightNode() == null)) {
			return null;
		}

		if (node.getLeftNode() != null && node.getLeftNode().getData() == data) {
			return node;
		} else if (node.getRightNode() != null && node.getRightNode().getData() == data) {
			return node;
		} else if (data < node.getData()) {
			return parentSearch(node.getLeftNode(), data);
		} else {
			return parentSearch(node.getRightNode(), data);
		}

	}

	public Node successor(int data) {
		// TODO: your code here

		Node temp = search(data);

		if (temp.getRightNode() != null) {
			return minFinder(temp.getRightNode());
		}

		Node parentNode = parent(data);

		while (parentNode != null
				&& parentNode.getRightNode() != null
				&& temp.getData() == parentNode.getRightNode().getData()) {
			temp = parentNode;
			parentNode = parent(parentNode.getData());
		}

		return parentNode;
	}

	public Node minFinder(Node node) {
		Node temp = node;
		while (temp.getLeftNode() != null) {
			temp = temp.getLeftNode();
		}

		return temp;
	}

	public Node predecessor(int data) {
		// TODO: your code here

		Node temp = search(data);

		if (temp.getLeftNode() != null) {
			return maxFinder(temp.getLeftNode());
		}

		Node parentNode = parent(data);

		while (parentNode != null
				&& parentNode.getLeftNode() != null
				&& temp.getData() == parentNode.getLeftNode().getData()) {
			temp = parentNode;
			parentNode = parent(parentNode.getData());
		}

		return parentNode;
	}

	public Node maxFinder(Node node) {
		Node temp = node;
		while (temp.getRightNode() != null) {
			temp = temp.getRightNode();
		}

		return temp;
	}
}
