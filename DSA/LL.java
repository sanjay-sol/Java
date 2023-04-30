public class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }
        public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void insertFirst(int val){
       Node node = new Node(val);
       node.next = head;
       head = node;
       if(tail==null){
        tail= head;
       }
       size++;

    }
    public void insertEnd(int val){
        if (tail == null){
            insertFirst(val);
            return;
        };
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if ( head== null){
            tail = null;
    }
       size--;
       return val;
    }
    public int deleteLast(){
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
        

    }
        public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
        private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {
        //     this.value = value;
        //     this.next = next;
        // }
    }
    public static void main(String args[]){
        LL l = new LL();
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.insertEnd(6);
        l.insertEnd(7);
        l.insertEnd(9);
        l.display();
        System.out.println("delete ifrst :");
        l.deleteFirst();
        l.display();
        System.out.println("Del last");
        l.deleteLast();
        l.display();


    }

}


