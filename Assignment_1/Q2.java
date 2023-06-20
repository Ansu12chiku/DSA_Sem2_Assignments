/*
The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
human body fat in populations. It is computed by taking the individual's weight (mass) in 
kilograms and dividing it by the square of their height in meters. i.e.
Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)(𝑯𝒆𝒊𝒈𝒉𝒕)^2 (𝒎^2)

Write a java program by using conditional statement to show the category for a given BMI.
	    Category			    BMI
	Less than 18.5			Underweight
	18.5 to 24.9			Normal Weight
	25.0 to 29.9			Overweight
	30.0 or more			Obese
*/
package Assignment_1;
import java.util.*;
public class Q2 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner (System.in);
		System.out.print("Enter the Weight in kg : ");
		double w=obj.nextDouble();
		System.out.print("Enter the Height in meters : ");
		double h=obj.nextDouble();
		double bmi=w/(Math.pow(h,2));
		String a="";
		
		if(bmi<18.5)
			a="Underweight";
		else if(bmi<24.9)
			a="Normal Weight";
		else if(bmi<29.9)
			a="Overweight";
		else
			a="Obese";
	System.out.println("The person is "+a);
	obj.close();			
	}
}