class Thread1 extends Thread
{
  public void run()
  {
    System.out.println("thread 1");
  }
}
class Thread2 extends Thread
{
  public void run()
  {
    System.out.println("Thread2");
  }
}
public class ThreadPriority
{
  private static final int MAX_PRIORITY=10;
  public static void main(String args[])
  {
    Thread1 t1=new Thread1();
    Thread2 t2=new Thread2();
    t1.setPriority(MAX_PRIORITY);
    t1.start();
    t2.start();
    System.out.println("priority of t1="+t1.getPriority());
    System.out.println("priority of t2="+t2.getPriority());
  }
}
