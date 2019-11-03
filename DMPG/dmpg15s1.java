import java.util.Scanner;

public class dmpg15s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int C = sc.nextInt();
		sc.nextLine();
		String [] S = sc.nextLine().split(" ");

		int [] CS = new int [5];
		int [] CSD = new int [5];

		for (int i = 0; i<5; i++) {
			CS[i] = Integer.parseInt(S[i]);
		}

		CSD[0] = 4;
		CSD[1] = 5;
		CSD[2] = 4;
		CSD[3] = 3;
		CSD[4] = 6;

		int T = 0;

		for (int i = 0; i<5; i++) {
			if (CS[i]%CSD[i]>0) {
				CS[i] = CS[i]/CSD[i];
				CS[i]++;
			} else {
				CS[i] = CS[i]/CSD[i];
			}

			T+=CS[i];
		}
		if (C-T<0) {
			System.out.println(0);
		} else {
			System.out.println(C-T);
		}

	}

}
