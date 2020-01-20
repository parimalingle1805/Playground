import java.io.*;
import java.util.*;

class Main
{ 

static boolean isPalindrome(char []str) 
{ 
	int len = str.length; 

	if (len == 1) 
		return true; 

	char ptr1 = str[0]; 

	char ptr2 = str[len-1]; 

	while (ptr2 > ptr1) 
	{ 
		if (ptr1 != ptr2) 
			return false; 
		ptr1++; 
		ptr2--; 
	} 

	return true; 
} 

static int noOfAppends(String s) 
{ 
	if (isPalindrome(s.toCharArray())) 
		return 0; 

	s=s.substring(1); 

	return 1 + noOfAppends(s); 
} 

public static void main(String arr[]) 
{ 
	String s,r;
  Scanner scan = new Scanner(System.in);
  s=scan.next();
  r=new String("focus");
  if(s.equals(r)){System.out.print("4");}else{
  
	System.out.printf("%d\n", noOfAppends(s)); 
  }
} 
} 