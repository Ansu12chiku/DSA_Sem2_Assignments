/*Question:
A phone number can be thought of as having three parts: 
the area code, the exchange code and the number.*/
package Assignment_2;
class Phone 
{
    int area_code;
    int exchange;
    int number;
    
    void input(int a,int e,int n) 
    {
        area_code =a;
        exchange = e;
        number =n;
    }
    
    void display() 
    {
        System.out.printf("(%03d) %03d-%04d", area_code, exchange,number);
    }
}
public class Q1
{
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.area_code=212;
        phone1.exchange=767;
        phone1.number=8900;

        Phone phone2 = new Phone();
        phone2.input(415,555,1212);
        
        System.out.print("My number is ");
        phone1.display();
        
        System.out.print("\nYour number is ");
        phone2.display();
    }
}

