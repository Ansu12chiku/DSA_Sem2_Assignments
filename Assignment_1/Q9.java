/*
Write a method that sums all the numbers in the major diagonal in an n * n 
matrix of double values using the following header:
	public static double sumMajorDiagonal(double[][] m)
Write a java program that reads a 4-by-4 matrix and displays the sum 
of all its elements on the major diagonal.
*/
package Assignment_1;
import java.util.*;
public class Q9 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
		double arr[][]=new double[4][4];
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		for (int i=0;i<4;i++)
			for(int j=0;j<4;j++)
			arr[i][j]=obj.nextDouble();

		System.out.print("Sum of the elements in the major diagonal is "+sumMajorDiagonal(arr));
        obj.close();
    }    
    public static double sumMajorDiagonal(double[][] m)
    {
        double sum=0;
        for (int i=0;i<4;i++)
			for(int j=0;j<4;j++)
                if (i==j)
                    sum+=m[i][j];

        return sum ;
    }
}