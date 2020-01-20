import java.util.*; 

class Main
{ 
static class Queue 
{ 
	static Stack<Integer> s1 = new Stack<Integer>(); 
	static Stack<Integer> s2 = new Stack<Integer>(); 

	static void enQueue(int x) 
	{ 
	 
		while (!s1.isEmpty()) 
		{ 
			s2.push(s1.pop()); 
			
		} 

		s1.push(x); 

		while (!s2.isEmpty()) 
		{ 
			s1.push(s2.pop()); 
	
		} 
	} 
	static int deQueue() 
	{ 
		 
		if (s1.isEmpty()) 
		{ 
			System.out.println("Q is Empty"); 
			System.exit(0); 
		} 

	 
		int x = s1.peek(); 
		s1.pop(); 
		return x; 
	} 
}; 

public static void main(String[] args) {
Queue q = new Queue();
 System.out.println("Enter the size of stack:");
Scanner scan = new Scanner(System.in);
int size=0,a=0,i=0;
size = scan.nextInt();
  if(size>0){
System.out.println("Enter the stack values:");
 
for(i=1;i<=size;i++){
	a= scan.nextInt();
	q.enQueue(a); 
	
}
  System.out.println("Queue elements are:");
for(int j=1;j<=size;j++){
System.out.print(q.deQueue()+" ");
}
} 
} 
}
