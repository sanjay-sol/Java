mport java.io.*;
import java.util.*;
class try_catch
{    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        try
        {
            int y=sc.nextInt();
            System.out.println(x/y);
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception caught");
        }

    }
}
 
