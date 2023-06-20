/*
Write a java program to find the maximum and minimum and how many times they both occur in an array of n elements. 
Find out the positions where the maximum first occurs and the minimum last occurs.
*/
package Assignment_1;
import java.util.*;
public class Q7 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);		
		System.out.print("Enter number of elements of Array: ");
		int n=obj.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter elements of the array: ");
		for (int i=0;i<n;i++)
			arr[i]=obj.nextInt();
		int[] mm=MaxMin(arr);
		int[] maxop=Maxocc(arr,mm[0]);
		int[] minop=Minocc(arr,mm[1]);
		System.out.println("Maximum element of Array is "+mm[0]+" and occurs "+maxop[0] + (maxop[0]>1?" times": " time"));
		System.out.println("Minimum element of Array is "+mm[1]+" and occurs "+minop[0]+ (minop[0]>1?" times": " time"));
		System.out.println("First occurrence of maximum element is at position "+maxop[1]);
		System.out.println("Last occurrence of minimum element is at position "+minop[1]);
		obj.close();			
	}
	public static int[] MaxMin(int []a)
	{
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
		 if(a[i]>max)
			max=a[i];
		 if(a[i]<min)
			min=a[i];
		}
	    int[] m={max,min};
		return m;
	}
	public static int[] Maxocc(int []a,int max)
	{
		int mc=0,index=0;
		for(int i=a.length-1;i>=0;i--)
			if(max==a[i])
			{
				mc++;
				index=i;
			}
		int[] aa={mc,index+1};
		return aa;
	}
	public static int[] Minocc(int []a,int min)
	{
		int mc=0,index=0;
		for(int i=0;i<a.length;i++)
			if(min==a[i])
			{
				mc++;
				index=i;
			}
		int[] aa={mc,index+1};
		return aa;
	}

}