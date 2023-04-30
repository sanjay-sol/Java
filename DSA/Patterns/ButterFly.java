

public class ButterFly {
    public static void main(String[] args) {
        //firstt half
       for(int i=1 ; i<=4 ; i++){
        for(int j=1 ; j<=i ; j++){
            System.out.print("*");    
        }
        int spaces = 2*(4-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
    }
    //second half
    for(int i=4 ; i>=1 ; i--){
        for(int j=1 ; j<=i ; j++){
            System.out.print("*");    
        }
        int spaces = 2*(4-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }

        System.out.println();
    }

    }
    
}
