import java.util.Scanner;

public class Grid150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();

		int [] [] grid = new int [A+1] [A+1];
		int [] count = new int [A+1];
		int num = 0;
		int max = 0;
		int columns = 0;
		int [] maxcolumn = new int[A];

		for (int r = 0; r<A; r++) {
			System.out.print(r%10 + " ");
			for (int c = 0; c<=A; c++) {
				grid[r] [c] = 0;
				count[c]=0;
			}
		}
		System.out.println();
		for (int r = 1; r<=A; r++) {
			for (int c = r; c<=A; c = c+r) {
				grid[r][c] = 1;
				count[c]=count[c]+1;
			}
		}

		for (int r = 1; r<=A; r++) {
			for (int c = 1; c<=A; c++) {
				System.out.print(grid[r][c] + " ");
			}
			System.out.println();
		}
		for (int c = 1; c<=A; c++) {
			if (count[c]>max) {
				columns=0;
				max=count[c];
				maxcolumn[columns]=c;
			} else if (count[c]==max) {
				columns=columns+1;
				maxcolumn[columns]=c;				
			}
		}
		System.out.print("The max sum is " + max + "\nThe column with the largest sum is ");
		for (int c=0; c<=columns; c++) {
			System.out.print(maxcolumn[c] + " ");
		}
		System.out.println();


	}

}
