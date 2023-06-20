/*Question:
Define a class called Student with instance variables Roll, Name, DSA_Mark.Also, the class consists of instance methods getdata(),
showdata() to provide input to the instance variable and to display the value of instance variable.
Write a program to create the details of 5 students. Display the information of the students who has secured the highest DSA_Mark. */
package Assignment_2;
class Student
{
    int Roll;
    String Name;
    int DSA_Mark;    
    void getdata(int r,String s,int mark) 
    {
        this.Roll =r;
        this.Name =s;
        this.DSA_Mark =mark;
    }    
    public void showdata()
    {
        System.out.println( this.Roll+"\t"+ this.Name+"\t"+ this.DSA_Mark);
    }    
}
public class Q3
{
    public static void main(String[] args) 
    {
        Student[] students = new Student[5];
        double maxMark = -1;
        int maxIndex = -1;
        for (int i = 0; i < students.length; i++) 
            students[i] = new Student();
        students[0].getdata(30, "Chiku",56);
        students[1].getdata(31, "Pran",55);
        students[2].getdata(32, "Ap",58);
        students[3].getdata(33, "AS",52);
        students[4].getdata(34, "Khusi",51);
        for (int i = 0; i < students.length; i++) 
              if (students[i].DSA_Mark > maxMark) 
            {
                maxMark = students[i].DSA_Mark;
                maxIndex = i;
            }        
        System.out.println("\nDetails of all students:");
        System.out.println("Roll\tName\tDSA Mark");
        for (int i = 0; i < students.length; i++) {
            students[i].showdata();
        }        
        System.out.printf(students[maxIndex].Name+" having roll no"+students[maxIndex].Roll+" has the highest DSA Mark of "+ maxMark);
    }
}