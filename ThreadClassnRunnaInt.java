lass TUT extends Thread {
  public void run() {
    System.out.println("I am from the class extends thread class");
  }
}

class TURI implements Runnable {
  public void run() {
    System.out.println("I am from the class implements runnable interface");
  }
}

public class thread {
  public static void main(String args[]) {
    TUT t1 = new TUT();
    TURI t = new TURI();
    Thread t2 = new Thread(t);
    t1.start();
    t2.start();
  }
}
