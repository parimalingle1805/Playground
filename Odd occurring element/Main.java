import java.util.Scanner;

public class Main 
{
	int getOddTimesElement(int ar[]) 
	{
		int i;
		int result = 0;
		for (i = 0; i < ar.length; i++) 
		{
			result = result ^ ar[i];
		}
		return result;
	}
 
 
	public static void main(String[] args) 
	{
		Main occur = new Main();
		int n=0,j=0;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		int array[] = new int[n];//{1, 1, 2, 2, 2, 3, 3};
		
		for(j=0;j<n;j++){
			array[j]= scan.nextInt();
		}
		
		
		System.out.println(occur.getOddTimesElement(array));
	}
}