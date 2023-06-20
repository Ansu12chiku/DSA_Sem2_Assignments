/*
Write a method to add two matrices. The header of the method is as follows:
public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or 
compatible types of elements.
*/
package Assignment_1;
import java.util.*;
public class HW4
{
    
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
        System.out.println("Enter length of row and coloumn : ");
        int m=obj.nextInt();
		int n=obj.nextInt();
		double x[][]=new double[m][n];
        double y[][]=new double[m][n];
        double z[][]=new double[m][n];
		System.out.println("Enter element of first element : ");
		for (int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			    x[i][j]=obj.nextDouble();
        System.out.println("Enter element of second element : ");
        for (int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			    y[i][j]=obj.nextDouble();
        System.out.println("The addition of two array is : ");   
        z=addMatrix(x,y);    
        for (int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
              System.out.print(z[i][j]+" ");
            System.out.println();
        }
        obj.close();
    }    
    public static double[][] addMatrix(double[][] a, double[][] b)
    {
        int row=a.length;
        int colomn=a[0].length;
        double sum[][]=new double[row][colomn];
        for (int i=0;i<row;i++)
             for(int j=0;j<colomn;j++)
               sum[i][j]=a[i][j]+b[i][j];

        return sum;
    }
}