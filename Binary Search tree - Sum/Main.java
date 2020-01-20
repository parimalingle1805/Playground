import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=0,i=0,count=0;
		 int arr[]=new int[10];
		   do{
			   a=scan.nextInt();
			   if(a>=0){
				   arr[i]=a;
				   i=i+1;
				   count=count+a;
			   }
		   }while(a>=0);
		   
		  System.out.println("Sum of all nodes are "+count);
	}

}
