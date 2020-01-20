import java.util.LinkedList; 
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack; 

public class Main{ 
	
	Node head; 
	class Node 
	{ 
		int data; 
		Node next; 
		 
		
	} 

	

	
	public void append(int data) 
	{ 
			Node new_node = new Node(); 
			new_node.data=data;
			new_node.next=null;
			if (head == null) 
		{ 
			head = new_node; 
			 
		} else{
			Node n = head;
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next= new_node;
		}
			
	}
	

	
	
	public void printList() 
	{ 
		Node node = head; 
		while (node.next != null) 
		{ 
			System.out.print(node.data + " "); 
			node = node.next; 
		} System.out.print(node.data);
	}
	
	
	
	
	
	
	
	static Queue<Integer> queue; 

	static void Print() 
	{ 
		while (!queue.isEmpty()) { 
			System.out.print( queue.peek() + " "); 
			queue.remove(); 
		} 
	} 
	

	static void reversequeue() 
	{ 
		Stack<Integer> stack = new Stack<>(); 
		while (!queue.isEmpty()) { 
			stack.add(queue.peek()); 
			queue.remove(); 
		} 
		while (!stack.isEmpty()) { 
			queue.add(stack.peek()); 
			stack.pop(); 
		} 
	} 
	public static void main(String args[]) 
	{ 
		queue = new LinkedList<Integer>(); 
		Main llist = new Main();
		int a=0,b=0;
		Scanner scan = new Scanner(System.in);
		b=scan.nextInt();
		if(b<0){System.out.println("Queue is empty"); System.exit(0);} else{a=b;}
		while(a>=0){
		//a = scan.nextInt();
		if(a>=0){
		queue.add(a);
		llist.append(a);
		}a = scan.nextInt();
		}
		 System.out.println("Before reversing:");
		 llist.printList();
	      System.out.println();
	      reversequeue(); 
	      System.out.println("After reversing:");
	      Print();
		 
	} 
} 