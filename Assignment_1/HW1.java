/* 
Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like 
“a + b = c,” “a = b − c,” or “a*b = c.”
*/ 
package Assignment_1;
import java.util.*;
public class HW1
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
		System.out.print("enter 1st integer : ");
		int a = obj.nextInt();
		System.out.print("enter 2nd integer : ");
		int b = obj.nextInt();
		System.out.print("enter 3rd integer : ");
		int c = obj.nextInt();
		if( a+b==c && b-c ==a && a*b==c )
		System.out.println("the numbers can be used in a correct arithmetic formula");
		else
		System.out.println("the numbers cannot be used in correct arithmetic formula ");
        obj.close();
	}
}