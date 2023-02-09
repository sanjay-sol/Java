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
