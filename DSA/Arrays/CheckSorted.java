package DSA.Arrays;

public class CheckSorted {
    public static void main(String[] args) {
        int arr[] = {3 , 4, 5 ,7 , 99 , 99 , 99 , 98};
        int count = 0;
        for(int i = 0 ; i < arr.length-1 ;i++){
                if(arr[i]<=arr[i+1]){
                        count++;
                }
        }
        if(count == arr.length-1){
            System.out.println(count+"sorted");
            System.out.println(arr.length);
        }else{
            System.out.println(count+"Unsorted");

        }
    }
}
