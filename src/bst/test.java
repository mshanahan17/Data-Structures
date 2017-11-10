package bst;

import java.util.LinkedList;
import java.util.Queue;

public class test {

    public static void main(String[] args) {
        int[] arr = {5,2,77,22,44,100,15};
        Tree myBST = new Tree();
        for(int x: arr){
            Node n = new Node(x);
            myBST.add(n);
        }
        test x = new test();
        x.inorder(myBST.getRoot());
        System.out.println();
        x.bfs(myBST.getRoot());
    }

    public void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.getLeft());

        System.out.print(node.getVal() + " ");

        inorder(node.getRight());
    }

    public void bfs(Node node){
        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        while(!q.isEmpty()){
            Node current = q.poll();
            if(current.getLeft()!= null){
                q.add(current.getLeft());
            }
            if(current.getRight() != null){
                q.add(current.getRight());
            }
            System.out.print(current.getVal() + " ");
        }
    }
}

