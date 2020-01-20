import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int bin[] = new int[100];
		int rev[] = new int[100];
		
			int i=0,j=0,k=0;
			while(n>0){
				bin[i]=n%2;
				n=n/2;
				rev[i]=bin[i];
				i++;
			}
			for(j=i-1;j>=0;j--){
				bin[j]=bin[j];
			}j++;
		
			for(k=0;k<=i-1;k++){
				rev[k]=rev[k];
			}k--;
			for(int l=0;l<i;l++,k--,j++){
				if(rev[k]!=bin[j]){System.out.println("no");
				System.exit(0);
				}else{continue;}
					
			}System.out.println("yes");
			
			
	}

}
