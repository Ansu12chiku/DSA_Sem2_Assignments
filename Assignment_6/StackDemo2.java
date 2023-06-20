import java.util.Scanner;
public class StackDemo2 
{
    static Scanner obj = new Scanner(System.in);
    static class Node<T> 
    {
        T info;
        Node<T> next;
        Node(T element) 
        {
            info = element;
            next = null;
        }
    }
    public static <T> Node<T> push(Node<T> top) 
    {        
        System.out.println("Enter the type of element to push:");
        System.out.println("1. Integer");
        System.out.println("2. Character");
        System.out.println("3. String");
        int type = obj.nextInt();
        System.out.println("Enter the value:");
        switch(type)
        {
        case 1:
            int intValue = obj.nextInt();
            Node intNode = new Node<>(intValue);
            intNode.next = top;
            top = intNode;
            break;
        case 2:
            char charValue = obj.next().charAt(0);
            Node charNode  = new Node<>(charValue);
            charNode.next = top;
            top = charNode;
            break;
        case 3:
            String stringValue = obj.next();
            Node stringNode = new Node<>(stringValue);
            stringNode.next = top;
            top = stringNode;
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
            break;
        }
        return top;
    }
    public static <T> Node<T> pop(Node<T> top) 
    {
        if (top == null) 
            System.out.println("Stack is empty...can't pop any element now");
        else 
        {
            System.out.println("Element " + top.info + " is popped from the stack...");
            top = top.next;
        }
        return top;
    }
    public static <T> void display(Node<T> top) 
    {
        if (top == null)
            System.out.println("Stack is empty , Nothing to display.");
        else 
        {
            Node<T> current = top;
            System.out.print("Stack elements are :\n");
            int i=1;
            while (current != null) 
            {
                System.out.println(i+" ->"+current.info);
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        Node<Object> top = null;
        while (true) 
        {
            System.out.println("****MENU****");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice:");
            int choice = obj.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    top=push(top);
                    break;
                case 2:
                    top = pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
}