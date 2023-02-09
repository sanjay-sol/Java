public class ProducerConsumer {
  public static void main(String[] args) {
   Queue c = new Queue();
   Producer p1 = new Producer(c);
   Consumer c1 = new Consumer(c);
   p1.start();
   c1.start();
  }
}

class Queue {
  private int items;
  private boolean available = false;

  public synchronized int consume() {
   while (available == false) {
     try {
      wait();
     } catch (InterruptedException e) {
     }
   }
   available = false;
   System.out.println("Consumer consumes the Item=" + items);
   notifyAll();
   return items;
  }

  public synchronized void produce(int value) {
   while (available == true) {
     try {
      wait();
     } catch (InterruptedException e) {
     }
   }
   items = value;
   available = true;
   System.out.println("Producer producing the Item= " + value);
   notifyAll();
  }
}
class Consumer extends Thread {
  private Queue q;
  public Consumer(Queue q) {
   this.q = q;
  }
  public void run() {
   int value = 1;
   for (int i = 1; i <= 5; i++) {
     value = q.consume();
   }
  }
}
class Producer extends Thread {
  private Queue q;

  public Producer(Queue q) {
   this.q = q;
  }

  public void run() {
   for (int i = 1; i <= 5; i++) {

     try {
      q.produce(i);
     } catch (Exception e) {
      System.out.println("Exception caught");
     }
   }
  }
}
