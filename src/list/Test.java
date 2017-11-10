package list;

public class Test {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        MyList list = new MyList();
        for(int x: arr){
            Node n = new Node(x);
            list.add(n);
        }
        list.printListVals();
        System.out.println(list.getSize());
        list.remove(3);
        list.printListVals();
    }
}