package Assignment_3;
import java.util.*;
public class HW4 
{
    public static void main(String[] args) 
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n=obj.nextInt();
        int[] A = new int[n];
        System.out.println("Enter the values in the array : ");
        for(int i=0;i<n;i++)
            A[i]=obj.nextInt();
        System.out.print("Enter k : "); 
        int k = obj.nextInt();
        rearrangeArray(A, k);
        System.out.println("After rearrangement the array :");
        for(int i=0;i<n;i++)
         System.out.print(A[i]+" ");        
    }
    public static void rearrangeArray(int[] A, int k) 
    {
        halfQuicksort(A, k, 0, A.length - 1);
    }
    public static void halfQuicksort(int[] A, int k, int start, int end) 
    {
        if (start >= end)
            return; 
        int cutIndex = getPivot(A, k, start, end);
        halfQuicksort(A, k, start, cutIndex - 1);
        halfQuicksort(A, k, cutIndex + 1, end);
    }
    public static int getPivot(int[] A, int k, int start, int end) {
        int pivot = A[end];
        int i = start - 1;
        for (int j = start; j <= end - 1; j++) 
            if (A[j] <= k) 
            {
                i++;
                swap(A, i, j);
            }
        swap(A, i + 1, end);
        return i + 1;
    }
    public static void swap(int[] A, int i, int j) 
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}