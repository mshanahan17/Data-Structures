package list;

public class MyList {
    private Node head;
    private int size;


    public MyList() {
        this.head = null;
        this.size = 0;
    }

    public void add(Node x){
        if(this.head == null){
            this.head = x;
            this.size++;
        }
        else {
            Node current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(x);
            size++;
        }
    }

    public void remove(int index){
        if(this.size < index){
            throw new ArithmeticException();
        }
        else{
            int count = 0;
            Node current = head;
            while(index - 1 != count){
                current = current.getNext();
                count++;
            }
            current.setNext(current.getNext().getNext());
        }
    }

    public void printListVals(){
        if(this.head != null){
            Node current = head;
            while(current != null){
                System.out.println(current.getValue());
                current = current.getNext();
            }
        }
    }

    public int getSize() {
        return size;
    }
}
