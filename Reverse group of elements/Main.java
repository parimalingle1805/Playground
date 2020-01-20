import java.io.*;
import java.util.*;
class Main
{ 
	Node head; // head of list 

	/* Linked list Node*/
	class Node 
	{ 
		int data; 
		Node next; 
	//	Node(int d) {data = d; next = null; } 
	} 

	Node reverse(Node head, int k) 
	{ 
	Node current = head; 
	Node next = null; 
	Node prev = null; 
		
	int count = 0; 

	/* Reverse first k nodes of linked list */
	while (count < k && current != null) 
	{ 
		next = current.next; 
		current.next = prev; 
		prev = current; 
		current = next; 
		count++; 
	} 
	if (next != null) 
		head.next = reverse(next, k); 

	return prev; 
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
		while (temp != null) 
		{ 
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
		
		int k=scan.nextInt();
		
		llist.head = llist.reverse(llist.head, k); 
 
		llist.printList(); 
	} 
} 
