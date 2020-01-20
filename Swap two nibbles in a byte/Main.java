import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int bin[] = new int[10];
		int temp[] = new int[10];
		
		
			int i=0,j=0,k=0,q=0;
			while(n>0){
				bin[i]=n%2;
				n=n/2;
				temp[i]=bin[i];
				i++;
			}
			for(j=i;j>=0;j--){
				bin[j]=bin[j];
				
				
			}j++;
		
			int x=0,y=0,tmp=0,l=0,m=0,p=128,tmp1=0,tmp2=0,tmp3=0,tmp4=0;

			tmp1=bin[0];bin[0]=bin[4];bin[4]=tmp1;
			tmp2=bin[1];bin[1]=bin[5];bin[5]=tmp2;
			tmp3=bin[2];bin[2]=bin[6];bin[6]=tmp3;
			tmp4=bin[3];bin[3]=bin[7];bin[7]=tmp4;
		
	for(l=7;l>=0;l--){
		bin[l]=bin[l];
		
		
	}
		for(l=7;l>=0;l--){
		//	System.out.println(bin[l]);
			//System.out.println();
			m=m+(bin[l]*p);
			p=p/2;
		}
			System.out.println(m);
			/*for(i=7;i>=0;i--){
				System.out.print(temp[i]);
				
			}*/

	}

}
