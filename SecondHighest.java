import java.util.Scanner;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,temp;
        int[] a=new int[5];
        System.out.println("enter array elements:\n");
        for(i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4-i;j++)
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
        for(i=0;i<5;i++)
        System.out.println(a[i]);
        System.out.println("2nd highest element in array is"+a[3] );
    }
}
