package Assignment_2;
class Distance {
    int meters;
    int centimeters;
    Distance(int meters, int centimeters) 
    {
        if (centimeters >= 100) 
        {
            meters += centimeters / 100;
            centimeters = centimeters % 100;
        }
        this.meters = meters;
        this.centimeters = centimeters;
    }    
    public void display()
    {
        System.out.println(meters + " m " + centimeters + " cm ");
    }    
    Distance sum(Distance d1, Distance d2) 
    {
        int me = d1.meters + d2.meters;
        int cm = d1.centimeters + d2.centimeters;        
        return new Distance(me, cm);
    }
}
public class HW3{
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 70);
        Distance d2 = new Distance(3, 30);
        System.out.println("Two distances are : ");
        Distance d3 = d1.sum(d1, d2);
        d1.display();
        d2.display();
        System.out.print("The sum is : ");
        d3.display();
    }
    
}