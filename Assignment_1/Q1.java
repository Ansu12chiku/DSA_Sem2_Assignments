/*
Write a Java program that can take a positive integer greater than 2 as input and write out the number of times 
one must repeatedly divide this number by 2 before getting a value less than 2.
*/
package Assignment_1;
import java.util.*;
public class Q1 
{

	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter positive integer greater than 2 : ");
		int a=obj.nextInt();
		int count=0;
		while(a>2)
		{
			count++;
			a=a/2;
		}
		System.out.println("The number of times one must repeatedly divide this number"
							+"by 2 before getting a value less than 2 is : "+count);
		obj.close();
	}

}