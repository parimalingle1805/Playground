
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

	static int ROW = 0, COL = 0;

	boolean isSafe(int M[][], int row, int col,
				   boolean visited[][])
	{
		return (row >= 0) && (row < ROW) && (col >= 0) && (col < COL) && (M[row][col] == 1 && !visited[row][col]);
	}

	void DFS(int M[][], int row, int col, boolean visited[][])
	{
		int rowNbr[] = new int[] { -1, -1, -1, 0, 0, 1, 1, 1 };
		int colNbr[] = new int[] { -1, 0, 1, -1, 1, -1, 0, 1 };

		visited[row][col] = true;

		for (int k = 0; k < 8; ++k)
			if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited))
				DFS(M, row + rowNbr[k], col + colNbr[k], visited);
	}

	int countIslands(int M[][])
	{
		boolean visited[][] = new boolean[ROW][COL];
		int count = 0;
		for (int i = 0; i < ROW; ++i)
			for (int j = 0; j < COL; ++j)
				if (M[i][j] == 1 && !visited[i][j])
				{
					DFS(M, i, j, visited);
					++count;
				}

		return count;
	}

	// Driver method
	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		ROW = scan.nextInt();
		COL = scan.nextInt();

		int M[][] = new int[ROW][COL];

		for(int i=0;i<ROW;i++){
			for(int j=0;j<COL;j++){
				M[i][j]=scan.nextInt();
			}
		}
		Main I = new Main();
		System.out.println(I.countIslands(M)-1);
	}
}

