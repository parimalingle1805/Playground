

import java.util.Scanner;

//Delete Element

public class Main
{ 
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

public void delete(int index){
	head=head.next;
}
	public void printList() 
	{ 
		Node node = head; 
		while (node.next != null) 
		{ 
			System.out.println(node.data); 
			node = node.next; 
		} System.out.println(node.data);
	} 

	
	public static void main(String[] args) 
	{ 
		int a = 0;
		Main llist = new Main();
		Scanner scan = new Scanner(System.in);
		
		do{
		a = scan.nextInt();
		if(a>=0){
		llist.append(a);
		}
		}while(a>=0);
		llist.delete(0);

		 
		llist.printList(); 
	} 
} 
 
