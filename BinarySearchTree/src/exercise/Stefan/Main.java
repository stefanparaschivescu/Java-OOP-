package exercise.Stefan;

public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree(null);
        tree.traverse(tree.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";
//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";


        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }


        tree.traverse(tree.getRoot());
        tree.remove(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.remove(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.remove(new Node("0"));
        tree.remove(new Node("4"));
        tree.remove(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.remove(new Node("9"));
        tree.traverse(tree.getRoot());
        tree.remove(new Node("8"));
        tree.traverse(tree.getRoot());
        tree.remove(new Node("6"));
        tree.traverse(tree.getRoot());
        tree.remove(tree.getRoot());
        tree.traverse(tree.getRoot());
        tree.remove(tree.getRoot());
        tree.traverse(tree.getRoot());

    }
}
