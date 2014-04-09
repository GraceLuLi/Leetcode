
public class EightQueens {
		
	
	static boolean isValidPos(int row, int col ,int[] cols)
	{
		cols[row] = col;
		for(int i = 0; i < row; i++)
		{
		   if(cols[i] == col || Math.abs(row - i) == Math.abs(cols[i] - col))
		   {
		      return false;
		   }
		}
		return true;
	}
    
	static void printBoard(int[]cols)
	{
		for(int i : cols)
		{
			System.out.print(i + " ");
		}
		System.out.println();
	}
	static int count = 0;
	static void placeForRow(int row, int[] cols)
	{
		if(row == 8)
		{
			count++;
			printBoard(cols);
			return;
		}
		 for(int j = 0; j < 8; j++)
		  {
		     if(isValidPos(row, j, cols))
		     {
		    	 cols[row] = j;
		    	 placeForRow(row+1, cols);
		     }		     
		  }
		return;
	}
	
	static void placeQueens(int[] cols)
	{
		placeForRow(0, cols);
	}
	
	static public void main(String[] args)
	{
		int[] cols = new int[8];
		placeQueens(cols);
		 System.out.println(count);
	}
}
