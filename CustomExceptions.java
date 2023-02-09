import java.io.*;
class InvalidException extends RuntimeException
{
  InvalidException(String s)
  {
    super(s);
  }
}
public class CustomException 
{
public static void main(String args[])
  {  
    int age=15;
    if(age<18)
    throw new InvalidException("not eligible");
    else
    {
      System.out.println("eligible");
    }
  }

}
