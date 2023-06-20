package Assignment_2;
abstract class Shape 
{
    abstract double getArea();
}
class Square extends Shape 
{
    double side;    
    Square(double s) 
    {
        side = s;
    }    
    double getArea() 
    {
        return side * side;
    }
}
class Triangle extends Shape 
{
    double base;
    double height;    
    Triangle(double b, double h) 
    {
        base = b;
        height = h;
    }    
    double getArea()
    {
        return 0.5 * base * height;
    }
}
class Circle extends Shape 
{
    double radius;    
    Circle(double r) 
    {
        radius = r;
    }    
    double getArea() 
    {
        return Math.PI * radius * radius;
    }
}
public class Q6 
{
    public static void main(String[] args) 
    {               
        Shape shapes1 = new Square(5);
        Shape shapes2 = new Triangle(4, 3);
        Shape shapes3 = new Circle(2.5);        
        System.out.println("Area of shape1 is : " + shapes1.getArea());
        System.out.println("Area of shape2 is : " + shapes2.getArea());
        System.out.println("Area of shape3 is : " + shapes3.getArea());
    }
}
