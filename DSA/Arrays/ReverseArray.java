package DSA.Arrays;

import java.sql.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,50,1};
        // int [] arr1 = new int[arr.length]
        int low = 0; int high = arr.length - 1;
        // int temp;
       while(low < high){
        int temp = arr[low];
         arr[low] = arr[high];
         arr[high]= temp ; 
         low++;
         high--;
       }
       System.out.println(Arrays.toString(arr));
    }
    
}
