import java.util.*;
class Node 
{
    int info;
    Node next;

    Node(int data) 
    {
        info = data;
        next = null;
    }
}
public class StackDemo2withoutGenerics 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        Node top=null;
        while(true)
        {
            System.out.println("****MENU****");
            System.out.println("0:Exit");
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("Enter your choice: ");
            int choice=obj.nextInt();
            switch(choice)
            {
                case 0:
                    System.out.println("Thank you...");
                    System.exit(0);
                    break;
                case 1:
                    top=push(top);
                    break;
                case 2:
                    top=pop(top);
                    break;
                case 3:
                    display(top);
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        }
    }
    public static Node push(Node top)
    {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the element to Push :");
        Node newNode = new Node(obj.nextInt());
        newNode.next=top;
        top=newNode;
        return top;
    }
    public static Node pop(Node top)
    {
        if(top==null)
            System.out.println("Error : Stack UnderFlow");
        else
        {
            System.out.println("Element " + top.info + " popped from the stack.");
            top = top.next;
        }
        return top;
    }
    public static void display(Node top)
    {
        if(top==null)
            System.out.println("Stack Empty");
        else
        {
            System.out.println("Elements of Stack");
            Node newNode=top;
            while(newNode!=null)
            {
                System.out.println(newNode.info);
                newNode=newNode.next;
            }
        }
    }
}
