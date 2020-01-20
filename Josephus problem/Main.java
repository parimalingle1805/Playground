import java.io.*; 
import java.util.*;
  
class Main { 
  
static int josephus(int n, int k) 
{ 
if (n == 1) 
    return 1; 
else
    return (josephus(n - 1, k) + k-1) % n + 1; 
} 
  
public static void main(String[] args) 
{ 
int n =0; 
int k = 0;
  Scanner scan = new Scanner(System.in);
  n=scan.nextInt();
  k=scan.nextInt();
System.out.println(josephus(n, k)); 
} 
} 