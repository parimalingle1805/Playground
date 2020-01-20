import java.util.Scanner;

class Main{  
	 public static void binarySearch(int arr[], int first, int last, int key){  
	   int mid = (first + last)/2;  
	   while( first <= last ){  
	      if ( arr[mid] < key ){  
	        first = mid + 1;     
	      }else if ( arr[mid] == key ){  
	        System.out.println(key +" found at location " + (mid+1)+".");  
	        break;  
	      }else{  
	         last = mid - 1;  
	      }  
	      mid = (first + last)/2;  
	   }  
	   if ( first > last ){  
	      System.out.println("Not found");  
	   }  
	 }  
	 public static void main(String args[]){  
	       // int arr[] = {10,20,30,40,50};  
	        //int key = 30;  
	        //int last=arr.length-1;
		 int n=0,j=0;
			Scanner scan = new Scanner(System.in);
			n=scan.nextInt();
			int arr[] = new int[n];//{1, 1, 2, 2, 2, 3, 3};
			
			for(j=0;j<n;j++){
				arr[j]= scan.nextInt();
			}
			int key =scan.nextInt();
			int last = n-1;
	        binarySearch(arr,0,last,key);     
	 }  
	}  