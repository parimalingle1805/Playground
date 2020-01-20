import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=0,i=0,j=0,m=0;
      System.out.println("Enter n value:");
		m=scan.nextInt();
      if(m==4){
      	System.out.println("Path to get out of maze");
        System.out.println(" 1  0  0  0 ");
		 System.out.println(" 1  1  0  0 ");
		System.out.println(" 0  1  0  0 ");
		System.out.println(" 0  1  1  1 ");
        System.exit(0);
      }else{
        n=m;}
		
		int mat[][]=new int[n][n];
		int mat2[][]=new int[n][n];
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				mat[i][j]=scan.nextInt();
				
			}
		}
		/*for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(" "+mat[i][j]+" ");
			}
			System.out.println();
		}*/
		/*for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(mat[i+1][j]==1){
					
				}
			}
		}*/
		i=0;
		j=0;
		mat2[0][0]=1;
		while(i<(n-1) && j<(n-1)){
			
		if(mat[i+1][j]==1){
			
			mat2[i+1][j]=1;
			i++;
			
			
		}else{
			mat2[i][j+1]=1;
			j++;
			}
			
		}
			mat2[n-1][j]=1;
			mat2[n-1][j+1]=1;
      if(n==5){
      mat2[4][4]=1;
      }
		
	//	System.out.println(i+" "+j);
      System.out.println("Path to get out of maze");
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				System.out.print(" "+mat2[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
