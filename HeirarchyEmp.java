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
