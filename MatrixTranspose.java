
import java.util.Scanner;
public class MatrixTranspose
{
	int row,col;
	int[][] matrix;

	MatrixTranspose(int row,int col)
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

	public void transpose(MatrixTranspose mat, MatrixTranspose transpose)
	{
		int r = mat.row;
		int c = mat.col;
		transpose.row = mat.col;
		transpose.col = mat.row;
		for(int i = 0; i<r ; i++)
		{
			for (int j = 0; j<c; j++)
			{
				transpose.matrix[j][i] = mat.matrix[i][j];
			}
		}
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int row,col;
		
		System.out.print("Enter number of row of matrix 1 : ");
		row = sc.nextInt();
		System.out.print("Enter number of columns of matrix 1 : ");
		col = sc.nextInt();
		MatrixTranspose mat1 = new MatrixTranspose(row,col);
		mat1.input();
		System.out.println("\nMatrix : ");
		mat1.display();
		System.out.println();

		MatrixTranspose transpose = new MatrixTranspose(col,row);
		System.out.println("Transpose : ");
		transpose.transpose(mat1,transpose);
		transpose.display();
	}
}