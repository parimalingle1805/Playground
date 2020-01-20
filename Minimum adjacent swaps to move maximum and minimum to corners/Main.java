import java.io.*; 
import java.util.*;
class Main {  
    public static void minimumSwaps(int a[], int n) 
    { 
        int maxx = -1, minn = a[0], l = 0, r = 0; 
        for (int i = 0; i < n; i++) { 
  
            // Index of leftmost largest element 
            if (a[i] > maxx) { 
                maxx = a[i]; 
                l = i; 
            } 
  
            // Index of rightmost smallest element 
            if (a[i] <= minn) { 
                minn = a[i]; 
                r = i; 
            } 
        } 
        if (r < l) 
            System.out.println(l + (n - r - 2)); 
        else
            System.out.println(l + (n - r - 1)); 
    } 
    public static void main(String args[]) throws IOException 
    { 
       int n=0;
		// = {10, 7, 8, 9, 1, 5}; 
      Scanner scan = new Scanner(System.in);
     
     n = scan.nextInt();
     int a[]=new int[n];
	//	n = arr.length; 
      for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
            
        } 
        minimumSwaps(a, n); 
    } 
} 