import java.io.*;
import java.util.*;
class Main { 
	Node head;  

	class Node { 
		int data; 
		Node next; 
	/*	Node(int d) 
		{ 
			data = d; 
			next = null; 
		} */
	} 

	void pairWiseSwap() 
	{ 
		Node temp = head; 
		while (temp != null && temp.next != null) { 

			int k = temp.data; 
			temp.data = temp.next.data; 
			temp.next.data = k; 
			temp = temp.next.next; 
		} 
	} 

	public void push(int data) 
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

	void printList() 
	{ 
		Node temp = head; 
		while (temp != null) { 
			System.out.println(temp.data); 
			temp = temp.next; 
		} 
		//System.out.println(); 
	} 

	public static void main(String args[]) 
	{ 
		Main llist = new Main(); 
int a=0;
      Scanner scan = new Scanner(System.in);
      do{
      a=scan.nextInt();
        if(a>=0){
		llist.push(a);
        }
      }while(a>=0);

		llist.pairWiseSwap(); 

		llist.printList(); 
	} 
} 
/* This code is contributed by Rajat Mishra */
