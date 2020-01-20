import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int bin[] = new int[100];
		
		
		/*	int i=0,j=0,k=0;
			while(n>0){
				bin[i]=n%2;
				n=n/2;
				bin[i]=bin[i];
				i++;
			}
			for(j=i-1;j>=0;j--){
				System.out.print(bin[j]);
			}j++;
			int tmp=0;
			while(int k=0;k<) */
		int c=0;
		while(n!=0){
			n=(n&(n<<1));
			c++;
		}
		System.out.println(c);
			
		
	}

}
