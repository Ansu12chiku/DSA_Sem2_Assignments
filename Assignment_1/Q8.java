/*
Write a java program to print M-by-N array in the tabular format.
Also, display the sum of elements of the array.
*/
package Assignment_1;
import java.util.*;
public class Q8 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter number of Row and Columns of 2D-Array:");
		int m=obj.nextInt();
		int n=obj.nextInt();
		int arr[][]=new int[m][n];
		int sum=0;
		System.out.print("Enter elements of 2D-Array:");
		for (int i=0;i<m;i++)
			for(int j=0;j<n;j++)
			arr[i][j]=obj.nextInt();
		System.out.println("The elements of 2D array are: ");
		for (int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++) 
			{
				System.out.print(arr[i][j]+" ");
				sum+=arr[i][j];
			}
			System.out.println();
		}
		System.out.print("The sum of elements of the 2D-Array is "+sum);
		obj.close();			
	}

}