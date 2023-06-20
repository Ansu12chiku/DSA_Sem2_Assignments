package Assignment_3;
import java.util.*;
public class Q4 
{
        
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Integer array elements:");
        Integer[] intarr = new Integer[5];
        for (int i = 0; i < 5; i++) 
            intarr[i] = obj.nextInt();
        System.out.print("Integer Array contains:\n");
        printArray(intarr);
        System.out.println("Enter Double array elements:");
        Double[] douarr = new Double[5];
        for (int i = 0; i < 5; i++) 
             douarr[i] = obj.nextDouble();
        System.out.print("Double Array contains:\n");
        printArray(douarr);        
        obj.close();
    }
    public static <E> void printArray(E[] inputArray) 
    {
        for (int i=0;i<inputArray.length;i++) 
             System.out.print(inputArray[i] + " ");
        System.out.println();
    }
}