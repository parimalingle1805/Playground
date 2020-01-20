import java.io.*;
import java.util.Scanner; 

class Main
{ 
	 
	
	// Returns count of possible paths in 
	// a maze[R][C] from (0,0) to (R-1,C-1) 
	static int countPaths(int maze[][]) 
	{ 
		// If the initial cell is blocked, 
		// there is no way of moving anywhere 
		if (maze[0][0]==-1) 
			return 0; 
	
		// Initializing the leftmost column 
		for (int i = 0; i < maze.length; i++) 
		{ 
			if (maze[i][0] == 0) 
				maze[i][0] = 1; 
	
			// If we encounter a blocked cell 
			// in leftmost row, there is no way 
			// of visiting any cell directly below it. 
			else
				break; 
		} 
	
		// Similarly initialize the topmost row 
		for (int i =1 ; i< maze.length ; i++) 
		{ 
			if (maze[0][i] == 0) 
				maze[0][i] = 1; 
	
			// If we encounter a blocked cell in 
			// bottommost row, there is no way of 
			// visiting any cell directly below it. 
			else
				break; 
		} 
	
		// The only difference is that if a cell 
		// is -1, simply ignore it else recursively 
		// compute count value maze[i][j] 
		for (int i = 1; i < maze.length; i++) 
		{ 
			for (int j = 1; j <maze.length ; j++) 
			{ 
				// If blockage is found, 
				// ignore this cell 
				if (maze[i][j] == -1) 
					continue; 
	
				// If we can reach maze[i][j] from 
				// maze[i-1][j] then increment count. 
				if (maze[i - 1][j] > 0) 
					maze[i][j] = (maze[i][j] + 
								maze[i - 1][j]); 
	
				// If we can reach maze[i][j] from 
				// maze[i][j-1] then increment count. 
				if (maze[i][j - 1] > 0) 
					maze[i][j] = (maze[i][j] + 
								maze[i][j - 1]); 
			} 
		} 
	
		// If the final cell is blocked, 
		// output 0, otherwise the answer 
		return (maze[maze.length - 1][maze.length - 1] > 0) ? 
				maze[maze.length - 1][maze.length - 1] : 0; 
	} 
	
	// Driver code 

	public static void main (String[] args) 
	{ int r=0,c=0,i=0,j=0;
		Scanner scan = new Scanner(System.in);
		r=scan.nextInt();
		c=scan.nextInt();
		int maze[][] = new int[r][c];
	//	for(i=0;i<r;i++){
	//		for(j=0;j<c;j++){
			maze[i][j] = 0;
	//		}
		
		
		System.out.println (countPaths(maze)); 
	
//	} 

} 
}