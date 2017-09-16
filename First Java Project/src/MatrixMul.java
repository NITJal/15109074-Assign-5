import java.util.Scanner;
public class MatrixMul {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r1,c1,r2,c2;
		System.out.println("Enter dimensions of first matrix:");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter dimensions of second matrix:");
		r2=sc.nextInt();
		c2=sc.nextInt();
		int i,j,k;
		if(c1!=r2)
		{
			System.out.println("Matrix multiplication not possible.");			
		}
		else
		{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int res[][]=new int[r1][c2];
			System.out.println("Enter elements of matrix 1:");
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter elements of matrix 2:");
			for(i=0;i<r2;i++)
			{
				for(j=0;j<c2;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			for(i=0;i<r1;i++)
			{
				for(j=0;j<c1;j++)
				{
					for(k=0;k<c2;k++)
					{
						res[i][k]+=a[i][j]*b[j][k];
					}
				}
			}
			System.out.println("Resultant matrix is:");
			for(i=0;i<r1;i++)
			{
				for(k=0;k<c2;k++)
				{
					System.out.print(res[i][k]+" ");
				}
				System.out.println();
			}
		}
	}
}
