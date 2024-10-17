package main.java.arep.binaryTree;
public class Node{
    int data;
    Node left;
    Node right;
    Node father;

    public Node(int data, Node father){
        this.data = data;
        this.left = null;
        this.right = null;
        this.father = father;
    }

    public  void delete(int value){
        System.out.println(value);
        if(left.data == value){
            left = null;
        }else if(right.data == value){
            right = null;
        }
    }

    public void deleteWithOneSon(int value, Node son){
        System.out.println(value);
        if(left.data == value){
            left = son;
        }else if(right.data == value){
            right = son;
        }
    }
}
