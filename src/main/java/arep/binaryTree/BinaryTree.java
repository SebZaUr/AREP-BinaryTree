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
        binaryTree.startTree(12);
        System.out.println(printTree(root));
        System.out.println(startSearch(6));
        System.out.println(startSearch(1));
        System.out.println(startDelete(5));
        System.out.println(findMin(root));
        System.out.println(findMax(root));
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

    public static boolean deleteNode(int value,Node current){
        if(current == null){
            return false;
        }
        if (value < current.data) {
            return deleteNode(value,current.left); // Ir al subárbol izquierdo
        } else if (value > current.data) {
            return deleteNode(value, current.right); // Ir al subárbol derecho
        }else if (current.data == value){
            System.out.println(Integer.toString(value) +"==" +Integer.toString(current.data));
            if(current.left == null && current.right == null){
                current.father.delete(value);
            }else if(current.left == null){
                current.father.deleteWithOneSon(value, current.right);
            }else if(current.right == null){
                current.father.deleteWithOneSon(value, current.left);
            }
            return true;
        }
        return false; 
    }

    public static String startDelete(int value){
        boolean isDelete = deleteNode(value, root);
        if(isDelete){
            return "El nodo con el valor " + Integer.toString(value) + " fue eliminado del Arbol";
        }else{
            return "El nodo con el valor " + Integer.toString(value) + " no fue fue eliminado del Arbol";
        }
    }

    public static String findMin(Node current){
        while (current.left != null) {
            current = current.left;
        }
        return "El valor minnimo del nodo es: " + Integer.toString(current.data);
    }

    public static String findMax(Node current){
        while (current.right != null) {
            current = current.right;
        }
        return "El valor maximo del nodo es: " + Integer.toString(current.data);
    }
}