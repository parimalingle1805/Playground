import java.util.Scanner;
import java.util.Arrays;

public class Main {
	static int isSubstring(String s1, String s2) 
    { 
        int M = s1.length(); 
        int N = s2.length(); 
      int i=0,j=0;
        for (i=0; i <N-M+1;i++) { 
            for (j=0; j<M;j++) 
                if (s2.charAt(i + j) != s1.charAt(j)) 
                    break; 
      
            if (j==M) 
                return i; 
        } 
      
        return -1; 
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String input=null,search=null;
		input=scan.nextLine();
		search=scan.nextLine();
	
		int index=	isSubstring(search,input);
		if(index==-1){
			System.out.println("Not found");
		}else{
			System.out.println("Pattern found at index "+index);
		}
		

	}

}
