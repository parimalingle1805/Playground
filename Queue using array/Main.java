import java.util.Scanner;

class Queue { 
	private static int front, rear, capacity; 
	private static int queue[]; 

	Queue(int c) 
	{ 
		front = rear = 0; 
		capacity = c; 
		queue = new int[capacity]; 
	} 
	static void queueEnqueue(int data) 
	{ 
		if (capacity == rear) { 
			return; 
		} 
		else { 
			queue[rear] = data; 
			rear++; 
		} 
		return; 
	} 
	static void queueDequeue() 
	{ 
		if (front == rear) {  
			return; 
		} 
		else { 
			for (int i = 0; i < rear - 1; i++) { 
				queue[i] = queue[i + 1]; 
			} 
 
			if (rear < capacity) 
				queue[rear] = 0; 
			rear--; 
		} 
		return; 
	} 

	static void queueDisplay() 
	{ 
		int i; 
		if (front == rear) { 
			return; 
		} 

		for (i = front; i < rear; i++) { 
			System.out.printf("%d ", queue[i]); 
		} 
		return; 
	}  
	static void queueFront() 
	{ 
		if (front == rear) { 
			return; 
		} 
		return; 
	} 
} 

public class Main { 
	public static void main(String[] args) 
	{  
		Scanner scan=new Scanner(System.in);
		int a=0,n=0;
		n=scan.nextInt();
      if(n<=0){System.out.println("Queue is empty");System.exit(0);}
		Queue q = new Queue(n);
		for(int i=0;i<n;i++){
          System.out.println("Insert the element in queue :");
			a=scan.nextInt();
		q.queueEnqueue(a); 
		}
      System.out.println("Queue elements are :");
		q.queueDisplay(); 
 
	} 
} 
