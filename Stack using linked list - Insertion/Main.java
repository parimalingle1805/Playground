
import java.util.Scanner;

//Delete Element
//nth node from last
//stack using LL

public class Main
{ 
	Node head; 
	class Node 
	{ 
		int data; 
		Node next; 
		  Node(int d) 
	        { 
	            data = d; 
	            next = null; 
	        } 
		
	} 

	

	
/*	public void append(int data) 
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
			
	} */
	 public void push(int new_data) 
	    { 
	        Node new_node = new Node(new_data); 
	        new_node.next = head; 
	        head = new_node; 
	    }

/*public void delete(int index){
	head=head.next;
}*/
/*	public void nthnode(int n){
	Node temp =head;
	int len=0;
	
		while(temp.next!=null){
		temp = temp.next;
		len++;
		}
		if(n>len){
			System.out.println("There is no nth node in the list");
		}else{
			temp =head;
			for(int i=0;i< len-n+1;i++){
				temp=temp.next;	
			}System.out.println(temp.data);
		}
	}  */
	
	
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
		
		do{
		a = scan.nextInt();
		if(a>=0){
		llist.push(a);
		}
		}while(a>=0);
		//llist.delete(0);
		/*System.out.println("Enter the nth node:");
		b=scan.nextInt();
		llist.nthnode(b);  */
		 
		llist.printList(); 
	} 
} 
 
