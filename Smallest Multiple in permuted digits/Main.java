import java.util.Scanner;
import java.util.Arrays;

public class Main
{  static long least;
	public static void main(String[] args) 
	{ 
		String str=null;// = "ABC"; 
		int d=0;
		int arr[]=new int[100];
		Scanner scan=new Scanner(System.in);
		str = scan.next();
		d=scan.nextInt();
		int n = str.length(); 
		least=(long) Math.pow(10,n);
		Main p = new Main(); 
		long ans=p.permute(str, 0, n-1,d); 
		if(ans==Math.pow(10,n)){System.out.println("-1");}else{
		System.out.println(ans);
		}
		
		
	} 
	
	 long permute(String str, int l, int r,int d) 
	{
		if (l == r) {
		long num = Long.parseLong(str);
	//	System.out.println(num);
			if(num%d==0){
				if(least>num){
					least=num;
				}//System.out.println(least);
			//	return least;
				
				
				
			}
		}
		else
		{ 
			for (int i = l; i <= r; i++) 
			{ 
				str = swap(str,l,i); 
				permute(str, l+1, r,d); 
				str = swap(str,l,i); 
			} 
		} 
		
	return least;
	} 
	
	
	public String swap(String a, int i, int j) 
	{ 
		char temp; 
		char[] charArray = a.toCharArray(); 
		temp = charArray[i] ; 
		charArray[i] = charArray[j]; 
		charArray[j] = temp; 
		return String.valueOf(charArray); 
	} 

} 
