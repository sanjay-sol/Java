1(a).DIFFERENT TYPES OF OPERATIOS,COMPARISON OF VALUES.

public class operations{
  public static void main(String arg[]){
    int a=10,b=15;
    System.out.println("a= "+a+" b= "+b);
    System.out.println("Comparision\na==b "+(a==b)+"\na!=b "+(a!=b)+"\na>b "+(a>b)+"\na<b "+(a<b));
    System.out.println("Arithmetic\na+b "+(a+b)+"\na-b "+(a-b)+"\na*b "+(a*b)+"\na%b "+(a%b));
    System.out.println("Bitwise\na&b "+(a&b)+"\na|b "+(a|b)+"\na^b "+(a^b));
  }
}
1(b).STUDENT GRADE USING SWITCH STATEMENT.
import java.util.*;
public class studentgrade_switch {
  public static void main(String arg[]){
    System.out.println("Enter the marks of student");
    Scanner sc = new Scanner(System.in);
    int marks=sc.nextInt();
    String c;
    switch(marks/10){
      case 10:
      case 9:
        c="S";
        break;
      case 8:
        c="A+";
        break;
      case 7:
        c="A";
        break;
      case 6:
        c="B+";
        break;
      case 5:
        c="B";
        break;
      case 4:
        c="C";
        break;
      default:
        c="F";
    }
    System.out.println("The grade is "+c); 
  }
}
1(b).STUDENT GRADE USING IF-ELSE.
import java.util.*;
public class studentgrade_if {
  public static void main(String arg[]){
    System.out.println("Enter the marks of student");
    Scanner sc = new Scanner(System.in);
    int m=sc.nextInt();
    String c;
    if(m>=90)
      c="S";
    else if(m>=80&&m<90)
      c="A+";
    else if(m>=70&&m<80)
      c="A";
    else if(m>=60&&m<70)
      c="B+";
    else if(m>=50&&m<60)
      c="B";
    else if(m>=35&&m<50)
      c="C";
    else 
      c="F";
    System.out.println("The grade is "+c);
  }
}
1(c).COMMAND LINE ARGUMENTS.
public class commandlineargs
{
  public static void main(String[] arg){
    System.out.println("arg[0]= "+arg[0]+"\narg[1]= "+arg[1]);
    System.out.println("arg[2+3]= "+(Integer.parseInt(arg[2])+Integer.parseInt(arg[3])));
  }
}

2(a).CONSTRUCTOR ,METHOD OVERLOADING.
import java.lang.reflect.Method;

public class constructorOverloading {
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

2(b).TYPE CASTING.

public class typecasting
{
  public static void main(String agrs[]){
    int a=40,b=30;
    System.out.println("a= "+a+"\nb= "+b);
    System.out.println("a/b before type casting "+a/b);
    System.out.println("a/b after type casting "+(float)a/b);
  }
}
3(a).SUM AND AVERAGE OF ELEMENTS OF AN ARRAY.
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
3(b).SECOND HIGHEST ARRAY ELEMENT IN AN ARRAY.
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
4(a).STANDARD USAGE OF PACKAGES.
import java.util.*;
import p1.*;
public class mypackage 
{
  public static void main(String []args)
  {
    Package1 p=new Package1();
    int c;
    float d,e;
    System.out.println("Enter the values of a and b");
    Scanner sc=new Scanner(System.in);
    d=sc.nextFloat();
    e=sc.nextFloat();
    System.out.println("Enter choice\n1.sum\n2.product");
    c=sc.nextInt();
    if(c==1)
     p.sum(d, e);
    else if(c==2)
      p.product(d, e);
    else 
      System.out.println("Invalid choice");
  }
}
Package p1:

package p1;
public class Package1{
  public void sum(float a,float b){
    System.out.println("the of sum is "+(a+b));
  }
  public void product(float a,float b){
    System.out.println("the of product is "+(a*b));
  }
}
0utput:
enter the values of a and b
58.5
2.3
Enter choice
1.sum
2.product
2
the of product is 134.55

4(b).GARBAGE COLLECTION.
class garbagecollection 
{
  public void finalize()
  {
    System.out.println("It is invoked");
  }
  public static void main(String[] args) 
  {
    garbagecollection g1=new garbagecollection();
    g1=null;
    System.gc();
    System.runFinalization();
  }
                                
}

5(a).HIERARCHY OF EMPLOYESS.
import java.util.*;
class Salary
{
  float salary; 
}
class Permanent extends Salary
{
  float bonus;
  Permanent(float s)
  {
    bonus= ((float)(50)/100)*s;
  }
  void display()
  {
    System.out.println("The bonus for Permanent employees is 50% of salary "+bonus);
  }
}
class Temporary extends Salary
{
  float bonus;
  Temporary(float s)
  {
    bonus= ((float)(20)/100)*s;
  }
  void display()
  {
    System.out.println("The bonus for Temporary employees is 20% of salary "+bonus);
  }
}
class Contracted extends Salary
{
  float bonus;
  Contracted(float s)
  {
    bonus= ((float)(35)/100)*s;
  }
  void display()
  {
    System.out.println("The bonus for Contracted employees is 35% of salary "+bonus);
  }
}
class Hierarchy
{
  public static void main(String a[])
  {
    Salary sa=new Salary();
    Scanner sc=new Scanner (System.in);
    System.out.print("Enter the salary of employees ");
    sa.salary=sc.nextFloat();
    System.out.println("The salary of employees is "+sa.salary);
    Permanent p=new Permanent(sa.salary);
    p.display();
    Contracted c=new Contracted(sa.salary);
    c.display();
    Temporary t=new Temporary(sa.salary);
    t.display();
    sc.close();
  }
}

5(b).POLYMORPHIC INVOCATION OF METHOD OVERRIDING(computesalary()).
class Employee
{
  void Computesalary()
  {
    System.out.println("Employee salary is 10000");
  }
}
class Manager extends Employee
{
  void Computesalary()
  {
    System.out.println("Manager salary is 200000");
  }
}
class computesalary
{
  public static void main(String[] args) 
  {
    Employee e = new Employee();
    Employee e1 = new Manager();
    e.Computesalary();
    e1.Computesalary();
  }
}

6(a).ABSTARTC CLASSES.
abstract class person
{
  int age;
  String name;
  int salary;
  abstract void display();
}
class student extends person
{
  student(int age,int salary,String name)
  {
    this.age=age;
    this.salary=salary;
    this.name=name;
  }
  void display()
  {
    System.out.println("name="+name+"age="+age+"salary="+salary);
  }
}
class faculty extends person
{
  faculty(int age,int salary,String name)
  {
    this.age=age;
    this.salary=salary;
    this.name=name;
  }
  void display()
  {
    System.out.println("name="+name+"age="+age+"salary="+salary);
  }
}
public class Abstractclass
{
  public static void main(String args[])
  {
    student std=new student (19,0,"revi");
    faculty fac=new faculty(34,100000,"bangaram");
    std.display();
    fac.display();
  }
}

6(b).DEMONSTRATION ON THE USAGE OF INTERFACES.
interface shape
{
  static final int x=100;
  void area();
  void draw();
}
public class Interfaces implements shape
{
  public void area()
  {
    System.out.println("arae of shape is ="+(x*x));
  }
  public void draw()
  {
    System.out.println("drawing shape");
  }
  public static void main(String args[])
  {
    Interfaces id=new Interfaces();
    id.area();
    id.draw();
  }
}

8(a).TRY AND CATCH BLOCK DEMONSTRATION.
import java.io.*;
import java.util.*;
class try_catch
{  public static void main(String args[])
  {
    Scanner sc =new Scanner(System.in);
    int x=sc.nextInt();
    try
    {
      int y=sc.nextInt();
      System.out.println(x/y);
    }
    catch(ArithmeticException e)
    {
      System.out.println("exception caught");
    }

  }
}

8(b).CUSTOM EXCEPTIONS.
import java.io.*;
class InvalidException extends RuntimeException
{
  InvalidException(String s)
  {
    super(s);
  }
}
public class CustomException 
{
public static void main(String args[])
  {  
    int age=15;
    if(age<18)
    throw new InvalidException("not eligible");
    else
    {
      System.out.println("eligible");
    }
  }

}
9(c).NO.OF CHARACTERS,WORDS,LINES IN A TEXT FILE.

import java.io.*;
public class CharWordLine
{
 public static void main(String args[])throws IOException
 {
  BufferedReader br =new BufferedReader(new FileReader("java3.txt"));
  String line;
  int wc=0,lc=0,cc=0;
  while((line=br.readLine())!=null)
  {
    lc++;
    String Words[]=line.split(" ");
    wc+=Words.length;
    for(String word:Words)
    {
      cc+=word.length();
    }
  }
  System.out.println("line count:"+lc);
  System.out.println("word count:"+wc);
  System.out.println("char count:"+cc);
 } 
}

10(a).STRING TOKENIZER,STRINGREADER,STRINGWRITER.
import java.io.*;
import java.util.StringTokenizer;
public class Stringcapabilities
{
  public static void main(String args[])throws IOException
  {
    StringTokenizer st=new StringTokenizer("hellow,world!how are you?!");
    int count=st.countTokens();i
    System.out.println(st.countTokens());
    while(st.hasMoreTokens())
    {
      System.out.println(st.nextToken());
    }
    StringReader sr=new StringReader("hellow world !How are you");
    int i;
    while((i=sr.read())!=-1)
    {
      System.out.println((char)i);
    }
    sr.close();
    StringWriter sw=new StringWriter();
    sw.write("hello world!how are you!");
    System.out.println(sw.toString());
    sw.close();

  } 
}

10(b).ENUMERATIONS AND USAGE OF ASSERTIONS.

enum Day
{
  SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
}

public class enum_Asser
{
  public static void main(String args[])
  {
    Day today=Day.MONDAY;
    Day tomorrow=Day.TUESDAY;
    switch(today)
    {
      case MONDAY:
      System.out.println("today is monday");
      break;
      case TUESDAY:System.out.println("today is tuesday");
      break;
      default:System.out.println("today is neither monday nor tuesday");
    }
    assert today!=tomorrow:"today and tomorrow are in the same day";
    System.out.println("today and tomorrow are different days");

  }  
}

11(a).THREADCLASS AND RUNNABLE INTERFACES.

class TUT extends Thread {
  public void run() {
    System.out.println("I am from the class extends thread class");
  }
}

class TURI implements Runnable {
  public void run() {
    System.out.println("I am from the class implements runnable interface");
  }
}

public class thread {
  public static void main(String args[]) {
    TUT t1 = new TUT();
    TURI t = new TURI();
    Thread t2 = new Thread(t);
    t1.start();
    t2.start();
  }
}
11(b).THREAD PRIORITIES ASSIGNMENT.
class Thread1 extends Thread
{
  public void run()
  {
    System.out.println("thread 1");
  }
}
class Thread2 extends Thread
{
  public void run()
  {
    System.out.println("Thread2");
  }
}
public class ThreadPriority
{
  private static final int MAX_PRIORITY=10;
  public static void main(String args[])
  {
    Thread1 t1=new Thread1();
    Thread2 t2=new Thread2();
    t1.setPriority(MAX_PRIORITY);
    t1.start();
    t2.start();
    System.out.println("priority of t1="+t1.getPriority());
    System.out.println("priority of t2="+t2.getPriority());
  }
}

11(c).THREAD SYNCHRONISATION USING PRODUCER AND CONSUMER PROBLEM.
public class ProducerConsumer {
  public static void main(String[] args) {
   Queue c = new Queue();
   Producer p1 = new Producer(c);
   Consumer c1 = new Consumer(c);
   p1.start();
   c1.start();
  }
}

class Queue {
  private int items;
  private boolean available = false;

  public synchronized int consume() {
   while (available == false) {
     try {
      wait();
     } catch (InterruptedException e) {
     }
   }
   available = false;
   System.out.println("Consumer consumes the Item=" + items);
   notifyAll();
   return items;
  }

  public synchronized void produce(int value) {
   while (available == true) {
     try {
      wait();
     } catch (InterruptedException e) {
     }
   }
   items = value;
   available = true;
   System.out.println("Producer producing the Item= " + value);
   notifyAll();
  }
}
class Consumer extends Thread {
  private Queue q;
  public Consumer(Queue q) {
   this.q = q;
  }
  public void run() {
   int value = 1;
   for (int i = 1; i <= 5; i++) {
     value = q.consume();
   }
  }
}
class Producer extends Thread {
  private Queue q;

  public Producer(Queue q) {
   this.q = q;
  }

  public void run() {
   for (int i = 1; i <= 5; i++) {

     try {
      q.produce(i);
     } catch (Exception e) {
      System.out.println("Exception caught");
     }
   }
  }
}

12(a).RETURNS VALUE OF pi USING LAMBDA EXPRESSION.
import java.lang.FunctionalInterface;
@FunctionalInterface
interface Myinterface
{
  double getpivalue();
}
public class a12
{  public static void main(String args[])
  {
  Myinterface ref;
  ref=()->{return 3.145;};
  System.out.println("value of pi="+ref.getpivalue());
  } 
}


12(b).REVERSE OF A STRING USING LAMBDA EXPRESSION.
/@FunctionalInterface
interface MyInterface
{
  String rev(String n);
}
class Main
{
public static void main(String args[])
{
  MyInterface ref=(str)->{
    String result=" ";
    for(int i=str.length()-1;i>=0;i--)
      result+=str.charAt(i);
      return result;
  };
    System.out.println("lambda expression ="+ref.rev("lambda"));
  }
13(b).KEYBOARD AND MOUSE EVENTS USING ADAPTER CLASSES.
KEY LISTENER PROGRAM

import java.awt.*;
import  java.awt.event.*;

public class KeyboardEvent extends KeyAdapter{
    Label l;
    TextArea a;
    Frame f;
    KeyboardEvent(){
        f = new Frame("Key Adapter");
        l = new Label();
        l.setBounds(50,50,200,20);
        a = new TextArea();
        a.setBounds(20,80,300,300);
        a.addKeyListener(this);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        f.add(l);
        f.add(a);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
    public void keyReleased(KeyEvent e){
        String txt1 = a.getText();
        String words[] = txt1.split(" ");
        l.setText("Words: "+words.length+"Characters: "+txt1.length());
    }

    public static void main(String[] args) {
        new KeyboardEvent();
    }
}


MOUSE EVENT PROGRAM;

 
import java.awt.*;
import java.awt.event.*;
public class MouseAdapterEx extends MouseAdapter {
    Frame f;
    MouseAdapterEx(){
        f = new Frame("Mouse Adapter");
        f.addMouseListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.cyan);
        g.fillArc(e.getX(),e.getY(),30,30,45,45);
    }

    public static void main(String[] args) {
        MouseAdapterEx em = new MouseAdapterEx();
    }
}
 

14(a).LAYOUT MANAGER PROGRAM.

import java.awt.*;
import javax.swing.*;
public class P14a {
  JFrame f;
  P14a(){
    f=new JFrame();
    JButton b1=new JButton("NORTH");
    JButton b2=new JButton("SOUTH");
    JButton b3=new JButton("EAST");
    JButton b4=new JButton("WEST");
    JButton b5=new JButton("CENTER");
    f.add(b1,BorderLayout.NORTH);
    f.add(b2,BorderLayout.SOUTH);
    f.add(b3,BorderLayout.EAST);
    f.add(b4,BorderLayout.WEST);
    f.add(b5,BorderLayout.CENTER);
    f.setSize(300,300);
    f.setVisible(true);
  }
  public static void main(String arg[]){
    new P14a();
  }
}
