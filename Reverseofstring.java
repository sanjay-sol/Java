import java.lang.FunctionalInterface;

@FunctionalInterface

interface MyInterface
{
  String rev(String n);
}
class Main
{
public static void main(String args[])
{
  MyInterface ref=(str)->{
    String result=" ";
    for(int i=str.length()-1;i>=0;i--)
      result+=str.charAt(i);
      return result;
  };
    System.out.println("lambda expression ="+ref.rev("lambda"));
  }
