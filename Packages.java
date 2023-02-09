import java.util.*;
import p1.*;
public class mypackage 
{
    public static void main(String []args)
    {
        Package1 p=new Package1();
        int c;
        float d,e;
        System.out.println("Enter the values of a and b");
        Scanner sc=new Scanner(System.in);
        d=sc.nextFloat();
        e=sc.nextFloat();
        System.out.println("Enter choice\n1.sum\n2.product");
        c=sc.nextInt();
        if(c==1)
           p.sum(d, e);
        else if(c==2)
            p.product(d, e);
        else 
            System.out.println("Invalid choice");
    }
}
Package p1:

package p1;
public class Package1{
    public void sum(float a,float b){
        System.out.println("the of sum is "+(a+b));
    }
    public void product(float a,float b){
        System.out.println("the of product is "+(a*b));
    }
}
0utput:
enter the values of a and b
58.5
2.3
Enter choice
1.sum
2.product
2
the of product is 134.55
