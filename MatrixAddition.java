import java.util.Scanner;
public class MatrixAddition {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number of rows:");
		int rows=sc.nextInt();
		System.out.print("enter the number of columns:");
		int cols=sc.nextInt();
		int[][]A=new int[rows][cols];
		int[][]B=new int[rows][cols];
		int[][]C=new int[rows][cols];
		System.out.print("enter elements of matrix A:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				A[i][j]=sc.nextInt();
			}
		}
		System.out.print("enter elements of matrix B:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				B[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				C[i][j]=A[i][j]+B[i][j];
			}
		}
		System.out.print("Sum of two matrices:");
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
		System.out.print(C[i][j] + " ");
		}
		System.out.println();
		}
		sc.close();
	}
}
  		
		

		

		
		
