import java.util.Scanner;
class SecondHighest
{
 public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int i,j,temp,n;
    n= sc.nextInt();
    int[] a=new int[n];
    System.out.println("enter array elements:\n");
    for(i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i++)
    {
      for(j=0;j<n-i-1;j++)
      {
        if(a[j]>a[j+1])
        {
          temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
        }
      }
    }        
    System.out.println("elements after sorting are:\n");
    for(i=0;i<n;i++)
    System.out.println(a[i]);
    System.out.println("2nd highest element in array is"+a[n-2] );
  }
}
