public class Main {
    public static void main(String[] args) {

        long start = System.nanoTime();

        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(4));
        tree.insert(new Node(2));
        tree.insert(new Node(8));
        tree.insert(new Node(6));
        tree.insert(new Node(0));
        tree.insert(new Node(3));
        tree.insert(new Node(7));

        tree.remove(1);
        tree.display();

        // check if given data is present or not
        System.out.println(tree.search(1));


        long duration = (System.nanoTime() - start)/1000;
        System.out.println(duration + "ms");


    }
}