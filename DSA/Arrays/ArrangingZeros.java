package DSA.Arrays;

import java.util.Arrays;

public class ArrangingZeros {
    public static void main(String[] args) {
        int[] arr = {10 , 5 , 0 , 0 , 9 , 0 , 8 , 0};
        for( int i = 0 ;i < arr.length-1 ; i++){
            if(arr[i]==0){
                for(int j = i+1 ; j < arr.length-1 ; j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
