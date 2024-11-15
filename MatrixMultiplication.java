
import java.util.Scanner;
public class MatrixMultiplication
{
	int row,col;
	int[][] matrix;

	MatrixMultiplication(int row,int col)
	{	
		this.row = row;
		this.col = col;
		matrix= new int[row][col];
	}

	public void input()
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i<row; i++)
		{
			for(int j = 0; j<col; j++)
			{
				System.out.print("Enter element at " + i + " " + j + " : ");
				matrix[i][j] = kb.nextInt();
			}
		}
	}
	
	public void display()
	{
		for(int i = 0; i<row; i++)
		{
			for(int j = 0; j<col; j++)
			{
				System.out.print(matrix[i][j] + "  ");
			}
			System.out.println();
		}

	}

	public int multiply(MatrixMultiplication mat1, MatrixMultiplication mat2, MatrixMultiplication result)
	{
		int r1 = mat1.row;
		int c1 = mat1.col;
		int r2 = mat2.row;
		int c2 = mat2.col;

		if  (r2 != c1)
		{
			System.out.println("Matrices cannot be multiplied.");
			return 0;
		}

		for(int i = 0; i< r1; i++)
		{
			for(int j = 0; j<c2; j++)
			{
				result.matrix[i][j] = 0;
				for(int k = 0; k<c1; k++)
				{
					result.matrix[i][j] += mat1.matrix[i][k] * mat2.matrix[k][j];
				}
			}
		}
		return 1;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int row,col;
		
		System.out.print("Enter number of row of matrix 1 : ");
		row = sc.nextInt();
		System.out.print("Enter number of columns of matrix 1 : ");
		col = sc.nextInt();
		MatrixMultiplication mat1 = new MatrixMultiplication(row,col);
		mat1.input();
		System.out.println("\nMatrix 1 : ");
		mat1.display();
		System.out.println();
		System.out.print("Enter number of row of matrix 2 : ");
		row = sc.nextInt();
		System.out.print("Enter number of columns of matrix 2 : ");
		col = sc.nextInt();
		MatrixMultiplication mat2 = new MatrixMultiplication(row,col);
		mat2.input();
		System.out.println("\nMatrix 2 : ");
		mat2.display();
		System.out.println();
		MatrixMultiplication result = new MatrixMultiplication(mat1.row,mat2.col);
		int stats = result.multiply(mat1,mat2,result);
		if (stats != 0)
		{
			System.out.println("Multiplied Matrix : ");
			result.display();
		}				

	}
}