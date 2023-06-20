package Assignment_3;
import java.util.*;
public class HW2
{

    public static int binarySearch(int arr[], int start, int end, int key)
    {
        if (end >= start && start <= arr.length - 1) 
        { 
            int mid = start + (end - start) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                return binarySearch(arr, start, mid - 1, key);

            return binarySearch(arr, mid + 1, end, key);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n=obj.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter 5 number of elements in ascending order");
        for (int i=0;i<n;i++)
            arr[i]=obj.nextInt();
            System.out.println("Enter the element to search");
        int x = obj.nextInt();
        int result = binarySearch(arr, 0, arr.length-1, x);
            System.out.println(result==-1?("The "+x+" is not present in the array"):("The "+x+" is present at index "+result));
    }
}