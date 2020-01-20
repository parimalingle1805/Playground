
import java.util.*;
public class Main
{ 
	static void printSubStr(String str, int low, int high) { 
		System.out.println(str.substring(low, high + 1)); 
	} 

	static int longestPalSubstr(String str) { 
		int n = str.length(); 
		boolean table[][] = new boolean[n][n]; 

		int maxLength = 1; 
		for (int i = 0; i < n; ++i) 
			table[i][i] = true; 

		int start = 0; 
		for (int i = 0; i < n - 1; ++i) { 
			if (str.charAt(i) == str.charAt(i + 1)) { 
				table[i][i + 1] = true; 
				start = i; 
				maxLength = 2; 
			} 
		} 
		
		for (int k = 3; k <= n; ++k) { 
			
				
			for (int i = 0; i < n - k + 1; ++i) 
			{ 
				int j = i + k - 1; 

				if (table[i + 1][j - 1] && str.charAt(i) == 
										str.charAt(j)) { 
					table[i][j] = true; 

					if (k > maxLength) { 
						start = i; 
						maxLength = k; 
					} 
				} 
			} 
		}  
		printSubStr(str, start, start + maxLength - 1); 
		System.exit(0);
		return 0; 
	} 

	public static void main(String[] args) { 
	Scanner scan=new Scanner(System.in);
		String str; 
      str=scan.next();
		System.out.println(longestPalSubstr(str)); 
	} 
} 
