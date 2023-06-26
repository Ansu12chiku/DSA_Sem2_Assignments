import java.util.*;
class Node
{
	int info;
	Node next;
	Node(int info)
	{
		this.info=info;
		this.next=null;
	}
}
public class QueueDemo2withoutGenerics 
{
	public static Node insert(Node rear, Node front)
	{
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the value to insert in Queue : ");
        int element= obj.nextInt();
		Node newnode = new Node(element);
		if(rear==null || front==null)
        {
			front =newnode;
            rear= newnode;
        }
		else
		{
			rear.next=newnode;
			rear=newnode;
		}
		return front;        
	}
	public static Node delete(Node rear, Node front)
	{
		if(front==null)
			System.out.println("Empty Queue,Nothing to Delete...");
		else
		{
            System.out.println(front.info+" is deleted...");
			front=front.next;
		}
		return front;
	}
	public static void display(Node rear, Node front)
	{
		Node n = front;
		if(n==null)
			System.out.println("Queue is Empty...");
		else
		{
			System.out.println("Elements of Queue are : ");
			while(n!=null)
			{
				System.out.print(n.info+" <- ");
				n=n.next;
			}
            System.out.println();
		}
	}
	public static Node getRear(Node front)
	{
		if(front==null)
		{
			return null;
		}
		else
		{
			Node n = front;
			while(n.next!=null)
			{
				n=n.next;
            }
			return n;
		}
	}
    public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
		Node front=null, rear=null;
		
		while(true)
		{
			System.out.println("****MENU****");
			System.out.println("0 : Exit");
			System.out.println("1 : Insert");
			System.out.println("2 : Delete");
			System.out.println("3 : Display");
			System.out.println("Enter your Choice: ");
			int choice=obj.nextInt();
			switch(choice)
			{
				case 0:
					System.exit(0);
                    System.out.println("Thank you...");
					break;
				case 1:
					front=insert(rear, front);
					rear=getRear(front);
					break;
				case 2:
					front=delete(rear, front);
					break;
				case 3:
					display(rear, front);
					break;
				default:
					System.out.println("Wrong Choice");
			}
		}
	}
}