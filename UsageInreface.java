interface shape
{
  static final int x=100;
  void area();
  void draw();
}
public class Interfaces implements shape
{
  public void area()
  {
    System.out.println("arae of shape is ="+(x*x));
  }
  public void draw()
  {
    System.out.println("drawing shape");
  }
  public static void main(String args[])
  {
    Interfaces id=new Interfaces();
    id.area();
    id.draw();
  }
}
