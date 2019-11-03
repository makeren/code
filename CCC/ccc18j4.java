import java.util.*;
public class ccc18j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int [][] table = new int [N][N];
		int [][] table2 = new int [N][N];

		for (int i = 0; i<N; i++) {
			for (int j = 0; j<N; j++) {
				table[i][j] = sc.nextInt();
			}
		}

		boolean isOne = true;
		boolean isTwo = true;
		boolean isThree = true;
		boolean isFour = true;

		// 360 
		for (int i = 0; i<N-1; i++) {
			if (table[0][i]>table[0][i+1]) {
				isFour = false;
				break;
			}
		}
		if (isFour==true) {
			for (int i = 0; i<N-1; i++) {
				if (table[i][0]>table[i+1][0]) {
					isFour = false;
					break;
				}
			}
		}

		// 90
		for (int i = 0; i<N-1; i++) {
			if (table[0][i]<table[0][i+1]) {
				isOne = false;
				break;
			}
		}
		if (isOne==true) {
			for (int i = 0; i<N-1; i++) {
				if (table[i][N-1]>table[i+1][N-1]) {
					isOne = false;
					break;
				}
			}
		}

		// 180
		for (int i = 0; i<N-1; i++) {
			if (table[N-1][i]<table[N-1][i+1]) {
				isTwo = false;
				break;
			}
		}
		if (isTwo==true) {
			for (int i = 0; i<N-1; i++) {
				if (table[i][N-1]<table[i+1][N-1]) {
					isTwo = false;
					break;
				}
			}

		}

		// 270
		for (int i = 0; i<N-1; i++) {
			if (table[N-1][i]>table[N-1][i+1]) {
				isThree = false;
				break;
			}
		}
		if (isThree==true) {
			for (int i = 0; i<N-1; i++) {
				if (table[i][0]<table[i+1][0]) {
					isThree = false;
					break;
				}
			}

		}
		//

		if (isOne==true) {
			for (int j = N-1; j>=0; j--) {
				for (int i = 0; i<N; i++) {
					System.out.print(table[i][j]+" ");
				}
				System.out.println();
			}
		} else if (isTwo==true) {
			for (int i = N-1; i>=0; i--) {
				for (int j = N-1; j>=0; j--) {
					System.out.print(table[i][j]+" ");
				}
				System.out.println();
			}
		} else if (isThree==true) {
			for (int j = 0; j<N; j++) {
				for (int i = N-1; i>=0; i--) {
					System.out.print(table[i][j]+" ");
				}
				System.out.println();
			}
		} else if (isFour==true) {
			for (int i = 0; i<N; i++) {
				for (int j = 0; j<N; j++) {
					System.out.print(table[i][j]+" ");
				}
				System.out.println();
			}
		}


	}
}