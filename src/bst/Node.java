package bst;

public class Node {
    Node right;
    Node left;
    int val;

    public Node(int val){
        this.val = val;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public int getVal() {
        return val;
    }
}
