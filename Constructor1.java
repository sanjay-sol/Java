import java.lang.reflect.Method;


class Constructor{
 Constructor(){
 System.out.println("Constructor without parameters");
 }
 Constructor(int a){
 System.out.println("Constructor with 1 parameter\na= "+a);
 }
 Constructor(int a,float b,String c){
 System.out.println("Constructor with multiple parameters\na= "+a+"\nb= "+b+"\nc= "+c);
 }
}
class Methods{
 void Meth(){
System.out.println("Method without parameters");
}
 void Meth(int a){
 System.out.println("Method with 1 parameter\na= "+a);
 }
 void Meth(int a,float b,String c){
 System.out.println("Method with multiple parameters\na= "+a+"\nb= "+b+"\nc= "+c);
 }
}

public class constructor1{
 public static void main(String arg[]){
 Constructor c1=new Constructor();
 Constructor c2=new Constructor(10);
 Constructor c3=new Constructor(12, 30.98f, "Ram");
Methods m0=new Methods();
 m0.Meth();
 m0.Meth(15);
 m0.Meth(20, 98.5f, "Shyam");
 }

}
