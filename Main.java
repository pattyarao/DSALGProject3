package project3;

public class Main {
    public static void main(String[] args) {
        BST a = new BST();

        /* TEST CASE 1 GENERAL FUNCTIONS || PASSED
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
        */


        /* TEST CASE 2 - POST,IN,PRE ORDER TRAVERSALS || PASSED
        REFERENCE: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
        a.insert(25);
        a.insert(15);
        a.insert(50);
        a.insert(10);
        a.insert(22);
        a.insert(35);
        a.insert(70);
        a.insert(4);
        a.insert(12);
        a.insert(18);
        a.insert(24);
        a.insert(31);
        a.insert(44);
        a.insert(66);
        a.insert(90);

        System.out.print("INorder: ");
        a.inOrder();
        System.out.println();

        System.out.print("PREorder: ");
        a.preOrder();
        System.out.println();

        System.out.print("POSTorder: ");
        a.postOrder();

         */

        /*

        // TEST CASE 3 - Search Function, Max and Min Functions || PASSED
        a.insert(50);
        a.insert(30);
        a.insert(20);
        a.insert(40);
        a.insert(70);
        a.insert(60);
        a.insert(80);

        System.out.println(a.search(50).getData());
        System.out.println(a.search(40).getData());
        System.out.println(a.search(80).getData());
        System.out.println(a.search(55));
        System.out.println(a.maximum().getData());
        System.out.println(a.minimum().getData());
        System.out.println(a.parent(30).getData());
        
         */




    }
}
