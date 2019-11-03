import java.util.Arrays;
import java.util.Scanner;

public class TandemBicycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int T = sc.nextInt();
		int N = sc.nextInt();

		String [] D = new String [N];
		String [] P = new String [N];
		int [] D1 = new int [N];
		int [] P1 = new int[N];
		int sum = 0;

		sc.nextLine();
		String l1 = sc.nextLine();
		for (int i = 0; i<N; i++) {
			D = l1.split(" ");
		}
		for (int j = 0; j<N; j++) {
			D1[j] = Integer.parseInt(D[j]);
		}
		sc.nextLine();
		String l2 = sc.nextLine();
		for (int i = 0; i<N; i++) {
			P = l2.split(" ");
		}
		for (int j = 0; j<N; j++) {
			P1[j] = Integer.parseInt(P[j]);
		}


		Arrays.sort(D1);
		Arrays.sort(P1);

		if (T==1) {
			for (int i = 0; i<N; i++) {
				if (D1[i]>P1[i]) {
					sum = sum+D1[i];
				} else {
					sum = sum+P1[i];
				}

			}
		} else if (T==2) {
			for (int i = 0; i<N; i++) {
				if (D1[i]>P1[P1.length-i-1]) {
					sum = sum+D1[i];
				} else {
					sum = sum+P1[P1.length-i-1];
				}
			}
		}
	}

}
