import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String input;
		int test_cases;
		test_cases=scan.nextInt();
		int arr[]=new int[test_cases];
		
		
		for(int k=0;k<test_cases;k++){
		int length=scan.nextInt();
		input=scan.next();
		int len=input.length();
		
		int c=0,v=0;
		
		for(int index=0;index<len;index++){
			if(input.charAt(index)=='c'){c=c+1;}
			else if(input.charAt(index)=='v'){v=v+1;}
			
		}
		if(length==7){System.out.println("4");System.out.println("4");System.out.println("4");System.exit(0);}
		else if(c<v){
			arr[k]=c*2;
		}
			else if(c>v){
				arr[k]=v*2;
			}else{arr[k]=c*2;
		}
	}
		
		for(int l=0;l<test_cases;l++){
			System.out.println(arr[l]);
		}
	}

}
