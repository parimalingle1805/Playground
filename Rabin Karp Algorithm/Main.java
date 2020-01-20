import java.util.Scanner;

public class Main {

	static int isSubstring(String s1, String s2) 
    { 
        int M = s1.length(); 
        int N = s2.length();
        
       int asc=0; 

       for(int k=0;k<M;k++){
    	   asc=asc+s1.charAt(k);
       }
       
      int i=0,j=0,asci=0;
        for (i=0; i <N;i++) { 
            for (j=i; j<i+M;j++){
            	asci=asci+s2.charAt(j);
            } 
            	if(asci==asc){
               
                return i; }else{asci=0;}
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
			System.out.println("Found pattern at index "+index);
		}
}
}
