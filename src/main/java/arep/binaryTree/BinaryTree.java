package main.java.arep.binaryTree;
import main.java.arep.binaryTree.Node;

public class BinaryTree{
    public static Node root;

    public BinaryTree(){
        root = null;
    }
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.startTree(6);
        binaryTree.startTree(8);
        binaryTree.startTree(5);
        binaryTree.startTree(20);
        System.out.println(printTree(root));
        System.out.println(startSearch(6));
        System.out.println(startSearch(1));
    }

    public Node addNode(Node current, int value,Node fatherNode){
        if(current == null){
            return new Node(value,fatherNode);
        }
        if(value < current.data){
            current.left = addNode(current.left, value, current); 
        }else if(value > current.data){
            current.right = addNode(current.right, value, current);
        }
        return current;
    }

    public void startTree(int value){
        root = addNode(root, value,null);
    }

    public static String printTree(Node node) {
        if (node == null) {
            return "";
        }
        
        StringBuilder tree = new StringBuilder();
        if (node.left != null) {
            tree.append(printTree(node.left)).append("-");
        }
        tree.append(node.data);
        if (node.right != null) {
            tree.append("-").append(printTree(node.right));
        }

        return tree.toString();
    }

    public static boolean searchNode(int value, Node current){
        if(current == null){
            return false;
        }else if(current.data == value){
            return true;
        }
        return searchNode(value, current.left) || searchNode(value, current.right);
    }

    public static String startSearch(int value){
        boolean isfind = searchNode(value, root);
        if(isfind){
            return "El valor " + Integer.toString(value) + " fue encontrado en el Arbol";
        }else{
            return "El valor " + Integer.toString(value) + " no fue encontrado en el Arbol";
        }
    }

    

}