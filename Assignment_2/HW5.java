package Assignment_2;
class RestaurantMeal 
{
    String name;
    double price;
    RestaurantMeal(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }
    void display()
    {
        System.out.printf("A \""+name+"\" costing Rs."+ price);
    }
}
interface HotelService
{
    String serviceName();
    double serviceFee();
    String RoomNo();
}
class RoomServiceMeal extends RestaurantMeal implements HotelService 
{
    String room;
    double fee;
    public RoomServiceMeal(String name, double price, String room) 
    {
        super(name, price);
        this.room = room;
        this.fee = 24.00;
    }

    public String serviceName() 
    {
        return "room service";
    }

    public double serviceFee() 
    {
        return fee;
    }
    public String RoomNo() 
    {
        return room;
    }
    double getPrice()
    {
        return 600;
    }
    public void display()
    {
        super.display();
        System.out.print(" is a \""+ serviceName()+"\"" +" provided to room "+RoomNo()+" for a Rs "+serviceFee());
        
    } 
}
public class HW5
 {
    public static void main(String[] args) 
    {
        RoomServiceMeal meal = new RoomServiceMeal("steak dinner", 600.00, "1202");
        meal.display();
    }
}
