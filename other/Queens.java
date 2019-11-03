import java.util.Scanner;

public class Queens {
	static Scanner sc = new Scanner (System.in);
	static int N = sc.nextInt(), count = 0;
	static boolean [] column = new boolean [N];
	static boolean [] left = new boolean [2*N-1];
	static boolean [] right = new boolean [2*N-1];
	static int [] row = new int [N];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		putQueen(0);
		System.out.println("\nThere are "+count+" solutions!");
	}

	public static void putQueen(int r) {
		for (int c = 0; c<N; c++) {
			if (column[c]==false && left[r+c]==false && right[r+N-1-c]==false) {
				row[r] = c;
				column[c] = left[r+c] = right [r-c+N-1] = true;
				if (r<N-1) {
					putQueen(r+1);
				} else {
					printAns();
					count++;
				}
				column[c] = left[r+c] = right [r+N-1-c] = false;
			}
		}
	}

	public static void printAns () {
		System.out.println();
		if (N-5>0) {
			for (int i = 0; i<(N*2-5)/2; i++) {
				System.out.print("=");
			}
			System.out.print("BOARD");
			for (int i = 0; i<(N*2-5)/2; i++) {
				System.out.print("=");
			}
		} else {
			System.out.println("==BOARD==");
		}
		System.out.println();
		for (int r = 0; r<N; r++) {
			for (int c = 0; c<N; c++) {
				if (c==row[r]) {
					System.out.print("Q ");
				} else {
					System.out.print(". ");
				}
			}
			System.out.println();
		}
	}

}
