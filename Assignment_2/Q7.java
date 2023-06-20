package Assignment_2;
/*Define a base class Person with instance variable name, age. The instance variables are initialized 
through constructors. The prototype of constructor is as below.Person (string, int)
Define a derived class Employee with instance variables Eid, salary. The instance variables are initialized through constructors. 
The prototype of constructor is as below.
Employee (string, int, int, double). Another instance method of Employee class is empDisplay() to display the information of 
employee details. */
class Person
{
    String name;
    int age;
    public Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }
}
class Employee extends Person 
{
    int Eid;
    double salary;
    public Employee(String name, int age, int Eid, double salary)
    {
        super(name, age);
        this.Eid = Eid;
        this.salary = salary; 
    }

    public void empDisplay() 
    {
        System.out.println(  name+"\t\t"+ age+"\t"+Eid+"\t"+salary);
    }
}
public class Q7
 {
    public static void main(String[] args) 
    {
        Employee emp1 = new Employee("Ansuman", 24, 72563, 83623.34);
        Employee emp2 = new Employee("Chiku", 25, 85478, 63485.25);
        System.out.println("Emp_Name\t" +"Age:\t" +"Emp_ID \t"+"Salary\t");
        emp1.empDisplay();
        emp2.empDisplay();
    }
}