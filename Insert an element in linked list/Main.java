
import java.util.Scanner;

 public class Main 
{ 
	Node head; 
	class Node 
	{ 
		int data; 
		Node next; 
		Node(int d) {data = d; next = null; } 
	} 

	

	
	public void append(int new_data) 
	{ 
	
		Node new_node = new Node(new_data); 


		if (head == null) 
		{ 
			head = new Node(new_data); 
			 
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
		Node tnode = head; 
		while (tnode.next != null) 
		{ 
			System.out.println(tnode.data); 
			tnode = tnode.next; 
		} System.out.println(tnode.data);
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

		 
		llist.printList(); 
	} 
} 
 

    
    
    