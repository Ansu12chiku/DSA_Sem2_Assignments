import java.util.*;
public class StackDemo1withoutGenerics 
{
    public static final int MAX = 10;
    public static int push(int S[], int top) 
    {
        Scanner obj = new Scanner(System.in);
        if (isFull(top))
            System.out.println("Stack is already full... Cannot push any element now...");
        else 
        {
            System.out.print("Enter the element to push:");
            int push = obj.nextInt();
            S[++top] = push;
            System.out.println("Element pushed successfully.");
        }
        return top;
    }
    public static int pop(int S[], int top) 
    {
        if (isEmpty(top)) 
            System.out.println("Stack is empty. Cannot pop any  element....");
        else 
        {
            int x = S[top--];
            System.out.println("Popped element is " + x);
        }
        return top;
    }
    public static void display(int S[], int top) 
    {
        if (isEmpty(top)) 
            System.out.println("Stack is empty...can't pop any element...");
         else 
         {
            System.out.println("The elements in the Stack are :");
            for (int i = top; i >= 0; i--) 
                System.out.println(S[i]);
        }
    }
    public static boolean isEmpty(int top) 
    {
        if(top == -1)
            return true;
        return false;
    }
    public static boolean isFull(int top) 
    {
        if(top == MAX -1)
            return true;
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int stack[] = new int[MAX];
        int top = -1;
        while (true) 
        {
            System.out.println("*** MENU ***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.print("Enter your choice:");
            int choice = obj.nextInt();
            switch (choice) 
            {
                case 0:
                System.out.println("Thank you...");
                    System.exit(0);
                case 1:
                    top = push(stack, top);
                    break;
                case 2:
                    top = pop(stack, top);
                    break;
                case 3:
                    display(stack, top);
                    break;
                default:
                    System.out.println("Invalid choice");
        }
    }
}
}
