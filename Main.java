package project3;

public class Main {
    public static void main(String[] args) {
        BST a = new BST();

        a.insert(15);
        a.insert(6);
        a.insert(18);
        a.insert(3);
        a.insert(7);
        a.insert(17);
        a.insert(20);
        a.insert(2);
        a.insert(4);
        a.insert(13);
        a.insert(9);


        System.out.println("Inorder");
        a.inOrder();
        System.out.println("Postorder");
        a.postOrder();
        System.out.println("Preorder");
        a.preOrder();
        System.out.println("Maximum: " + a.maximum().getData());
        System.out.println("Minimum: " + a.minimum().getData());
        System.out.println("Parent of 6: " + a.parent(6).getData());
        System.out.println("Parent of 18: " + a.parent(18).getData());
        System.out.println("Successor of 15: " + a.successor(15).getData());
        System.out.println("Successor of 13: " + a.successor(13).getData());
        System.out.println("Predecessor of 15: " + a.predecessor(15).getData());
        System.out.println("Predecessor of 9: " + a.predecessor(9).getData());


    }
}
