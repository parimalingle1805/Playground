import java.util.Arrays;
import java.util.Scanner; 

public class Main { 
	static int findSum(int arr[], int n) { 
		

		Arrays.sort(arr); 
		
		int sum = arr[0]; 
		for (int i = 0; i < n-1; i++) { 
			if (arr[i] != arr[i + 1]) { 
				sum = sum + arr[i+1]; 
			} 
		} 

		return sum; 
	} 
	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[] = new int[n];//{1, 2, 3, 1, 1, 4, 5, 6}; 
		 int a=0;
		for(int i=0;i<n;i++){
			a=scan.nextInt();
			arr[i]=a;
		}
		System.out.println(findSum(arr, n)); 

	} 
} 
