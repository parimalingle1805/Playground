import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Main {     
    static void printLargest(Vector<String> arr){ 
      
        Collections.sort(arr, new Comparator<String>(){
        @Override
        public int compare(String X, String Y) { 
        String XY=X + Y; 
        String YX=Y + X;  
        return XY.compareTo(YX) > 0 ? -1:1; 
    } 
    }); 
          
    Iterator it = arr.iterator(); 
  
    while(it.hasNext()) 
        System.out.print(it.next()); 
      
    } 
    public static void main (String[] args) { 
          Scanner scan = new Scanner(System.in);
          int n=0,a=0,j=0;
          
          n=scan.nextInt();
        Vector<String> arr; 
        arr = new Vector<>();
        for(j=0;j<n;j++){
        	a = scan.nextInt();
        	String s = Integer.toString(a);
        arr.add(s); 
        }
        
        printLargest(arr); 
    } 
} 