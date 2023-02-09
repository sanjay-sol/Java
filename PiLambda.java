import java.lang.FunctionalInterface;
@FunctionalInterface
interface Myinterface
{
  double getpivalue();
}
public class PiLambda
{  public static void main(String args[])
  {
  Myinterface ref;
  ref=()->{return 3.145;};
  System.out.println("value of pi="+ref.getpivalue());
  } 
}
