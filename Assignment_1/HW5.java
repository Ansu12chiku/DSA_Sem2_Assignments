/*
Write a java program that randomly fills in 0s and 1s into a 4-by-4 matrix, 
prints the matrix, and finds the first row and column with the most 1s.
*/
package Assignment_1;
public class HW5 
{
	public static void main(String[] args) 
    {  
        int[][] arr = new int[4][4];
     	for (int i = 0; i < 4; i++)
        {
			for (int j = 0; j < 4; j++) 
                arr[i][j] = (int)(Math.random() * 2);
		}
		for (int i = 0; i < arr.length; i++)
        {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j]+" ");

			System.out.println();
		}
        System.out.println("The largest row index : " + largestRow(arr));
		System.out.println("The largest column index : " + largestColumn(arr));

	}
	public static int largestRow(int[][] m) {
		int Maximum = 0;
		int temp = 0;
		for (int i = 0; i < m.length; i++) {
			int count = 0;
			for (int j = 0; j < m[i].length; j++) {
				if (m[i][j] == 1)
					count++;
			}
			if (count > temp) {
				temp = count;
				Maximum = i;
			}
		}
		return Maximum;
	}
	public static int largestColumn(int[][] m) 
    {
		int maxColumnIndex = 0;
		int max = 0;
		for (int col = 0; col < m[0].length; col++)
        {
			int count = 0;
			for (int row = 0; row < m.length; row++) 
            {
				if (m[row][col] == 1)
					count++;
			}
			if (count > max) 
            {
				max = count;
				maxColumnIndex = col;
			}
		}
		return maxColumnIndex;
	}
}