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
public class AbstractClasses
{
  public static void main(String args[])
  {
    student std=new student (19,0,"revi");
    faculty fac=new faculty(34,100000,"bangaram");
    std.display();
    fac.display();
  }
}
