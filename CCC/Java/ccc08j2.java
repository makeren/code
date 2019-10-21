import java.util.Scanner;

public class ccc08j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		char [] A = new char [6];
		A[1] = 'A';
		A[2] = 'B';
		A[3] = 'C';
		A[4] = 'D';
		A[5] = 'E';

		while (true) {
			int b = sc.nextInt();
			int n = sc.nextInt();

			if (b==1) {
				for (int i = 0; i<n; i++) {
					A[0] = A[1];
					for (int j = 2; j<=5; j++) {
						A[j-1] = A[j];
					}
					A[5] = A[0];
				}
			}

			if (b==2) {
				for (int i = 0; i<n; i++) {
					A[0] = A[5];
					for (int j = 5; j>=2; j--) {
						A[j] = A[j-1];
					}
					A[1] = A[0];
				}
			}

			if (b==3) {
				for (int i = 0; i<n; i++) {
					A[0] = A[2];
					A[2] = A[1];
					A[1] = A[0];
				}
			}

			if (b==4) {
				for (int i = 1; i<6; i++) {
					System.out.print(A[i]+" ");
				}
				break;
			}

		}

	}

}
