import java.util.Arrays;
import java.util.Scanner;

public class Main {
	 static int largest(int arr[]) 
     { 
         int i; 
           
         // Initialize maximum element 
         int max = arr[0]; 
        
         // Traverse array elements from second and 
         // compare every element with current max   
         for (i = 1; i < arr.length; i++) 
             if (arr[i] > max) 
                 max = arr[i]; 
        
         return max; 
     } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int a=0,i=0,count=0,k=0;
		int n1=0,n2=0;
		 int arr[]=new int[15];
		   do{
			   a=scan.nextInt();
			   if(a>=0){
				   arr[i]=a;
				   i=i+1;
				   count=count+1;
			   }
		   }while(a>=0);
		   System.out.println("Enter the kth value:");
		   k=scan.nextInt();
		  
		Arrays.sort(arr);
	//	 for(int j=0;j<i;j++){
			//   System.out.println(Arrays.toString(arr));
		//   }
		System.out.println("Smallest kth value "+arr[(15-i)+k-1]);
	}

}
