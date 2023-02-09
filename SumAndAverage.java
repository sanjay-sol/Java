import java.util.*;
public class array_operations {
  public static void main(String args[]){
    System.out.println("Enter the size of array");
    Scanner sc=new Scanner(System.in);
    int i,sum=0;
    int n=sc.nextInt();
    int []arr=new int[n];
    System.out.println("Enter the elements of array");
    for(i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("The elements of array are");
    for(i=0;i<n;i++){
      System.out.print(arr[i]+" ");
      sum+=arr[i];
    }
    System.out.println("\nThe sum and average of elements of array are\n"+sum+"\n"+sum/n);
  }
}