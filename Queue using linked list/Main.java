import java.util.Scanner;
import java.io.*;

public class Main 
{ 
	Node head; 
	class Node 
	{ 
		int data; 
		Node next; 
		//Node(int d) {data = d; next = null; } 
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
			System.out.print(node.data); 
			System.out.print(" ");
			node = node.next; 
		} System.out.println(node.data);
	} 

	
	public static void main(String[] args) 
	{ 
		int a = 0,b=0;
		Main llist = new Main();
		Scanner scan = new Scanner(System.in);
      	b=scan.nextInt();
		if(b<0){System.exit(0);}else{a=b;}
		while(a>=0){
		
		if(a>=0){
		llist.append(a); 
		}a = scan.nextInt();
		}

		 
		llist.printList(); 
	} 
} 
 
