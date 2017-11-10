package bst;

public class Tree {
    Node root;

    public Tree() {
        this.root = null;
    }

    public void add(Node n){
        if(root == null){
            root = n;
        }
        else{
            Node current = root;
            while(current != null){
                while(n.getVal() < current.getVal()){
                    if(current.getLeft() == null){
                        current.setLeft(n);
                        return;
                    }
                    current = current.getLeft();
                }
                while(n.getVal() > current.getVal()){
                    if(current.getRight() == null){
                        current.setRight(n);
                        return;
                    }
                    current = current.getRight();
                }
            }
        }
    }

    public Node getRoot() {
        return root;
    }
}
