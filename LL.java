
import java.util.*;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;

    }

    public void insertEnd(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        ;
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }
    public void Insert(int val, int index){
        Node temp = head;
        Node temp1;
        for(int i = 1; i < index ; i++){
            temp = temp.next ;
        }
    temp1 = temp.next;
    temp.next = temp1;
  



    }
    public boolean hasCycle(Node node){
             
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next != null){
           
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
            
        }
        return false;
    }
    public Node detectCycleNode(Node node){
        Node slow = head;
        Node fast = head;
        // int count = 0;
       while(fast!=null && fast.next != null){
           
          
           fast = fast.next.next;
           slow = slow.next;
           if(slow == fast){
              slow = head;
              while(slow!=fast){
                  slow= slow.next;
                  fast= fast.next;
              }
              return slow;
           }
         
           
       }
       return null;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;

    }

    public void getSize() {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        // return count;
        System.out.println("getsiz"+count);
    }

    public void display() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
            count ++;
        }
        System.out.println("END"+count);
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        // public Node(int value, Node next) {
        // this.value = value;
        // this.next = next;
        // }
    }

    public static void main(String args[]) {
        LL l = new LL();
        l.insertFirst(3);
        l.insertFirst(4);
        l.insertFirst(5);
        l.insertEnd(6);
        l.insertEnd(7);
        l.insertEnd(9);
        l.display();
        // System.out.println("Sixe");
        // l.getSize();
        System.out.println("delete ifrst :");
        l.deleteFirst();
        l.display();
        System.out.println("Del last");
        l.deleteLast();
        l.display();

    }

}
