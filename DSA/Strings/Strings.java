// package Strings;

public class Strings {
    public int PrintSum(int n){
        int sum =0;
        sum=sum+n;
        return n+1;
    }
    public static void main(String[] args) {
        // String name1 = "ronald";
        // String name2 ="";
        StringBuilder sb1 = new StringBuilder("Tony");
        StringBuilder sb2 = new StringBuilder("");
        // String sb2 = "";
        for(int i=sb1.length()-1 ; i>=0;i--){
            sb2.append(sb1.charAt(i));
        }
        System.out.println(sb2);
        // String name2 = "Ronald";
        // System.out.println(name1.compareTo(name2));


    }
}
