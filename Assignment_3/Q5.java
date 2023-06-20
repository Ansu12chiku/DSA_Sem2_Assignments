package Assignment_3;
import java.util.*;
public class Q5 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        Integer arr[]=new Integer[5];
        System.out.println("Enter array elements ");
        for(int i=0;i<arr.length;i++)
             arr[i]=obj.nextInt();
        System.out.println("Enter the element to search ");
        int k=obj.nextInt();
        int c=count(arr, k);
        System.out.println("Number of times "+k+" present in the array is "+c);
        obj.close();
    }
    public static <T> int count(T[] array,T item)
    {
        int count =0;
        for(int i=0;i<array.length;i++)
            if (array[i].equals(item)) // equals() method istead of array[i]==k bcz 
                                       // incase it will String type then it will show error
                count++;
        return count;
    }
}
