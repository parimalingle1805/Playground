import java.util.Scanner;

public class Main {
	static void find_max(int arr[],int len,int k){
		int i=0,root=0;
		
	for(int l=0;l<k;l++){
		int max=0,index=0;
		for(i=0;i<len;i++){
			if(max<arr[i]){
				max=arr[i];
				index=i;
			}
		}//System.out.println(index);
		 root=(int)Math.sqrt(max);
	//	System.out.println(root);
	//	System.out.println(max);
		arr[index]=root;
		
			for(int j=0;j<len;j++){
		//	System.out.print(" "+arr[j]);
			}
		}int sum=0;
	for(int z=0;z<len;z++){
		sum=sum+arr[z];
	}System.out.println(sum);
	}
	
	
	
	
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int n=0,no_of_choc=0,k=0;
	n=scan.nextInt();
	
	int pile[]=new int[n];
		for(int i=0;i<n;i++){
			no_of_choc=scan.nextInt();
			pile[i]=no_of_choc;
		}
		k=scan.nextInt();
		find_max(pile,n,k);
	
	}
}
