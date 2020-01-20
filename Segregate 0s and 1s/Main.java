

import java.io.*;
import java.util.*;
class Main
{ 
	int partition(int arr[], int low, int high) 
	{ 
		int pivot = arr[high]; 
		int i = (low-1); 
		for (int j=low; j<high; j++) 
		{ 
			if (arr[j] <= pivot) 
			{ 
				i++; 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		}  
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 
	void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			int pi = partition(arr, low, high); 
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	} 
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 
	public static void main(String args[]) 
	{ int n=0;
		// = {10, 7, 8, 9, 1, 5}; 
      Scanner scan = new Scanner(System.in);
     
     n = scan.nextInt();
     int arr[]=new int[n];
	//	n = arr.length; 
      for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
            
        }

		Main ob = new Main(); 
		ob.sort(arr, 0, n-1); 
 
		printArray(arr); 
	} 
} 
