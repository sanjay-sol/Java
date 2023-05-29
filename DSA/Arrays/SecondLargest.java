package DSA.Arrays;
import java.util.*;

public class SecondLargest {

   
    public static void main(String[] args) {
        int[] arr = {20 , 10 , 20 , 8, 12};
    Arrays.sort(arr);
        for(int i=arr.length ; i>=0;i--){
            if(arr[i]==arr[i-1]){
                i--;
            }
            else{
                System.out.println(arr[i-1]);

            }
        }
    }
   
}
