import java.util.*;

public class ccc08j3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		String S0 = "ABCDEF";
		String S1 = "GHIJKL";
		String S2 = "MNOPQR";
		String S3 = "STUVWX";
		String S4 = "YZ -.&";

		char[][] A = new char[5][6];
		A[0] = S0.toCharArray();
		A[1] = S1.toCharArray();
		A[2] = S2.toCharArray();
		A[3] = S3.toCharArray();
		A[4] = S4.toCharArray();

		String s = sc.nextLine();
		int ar = 0, ac = 0, br = 0, bc = 0;
		int moves = 0;

		for (int cur = 0; cur<s.length(); cur++) {
			for (int i = 0; i<5; i++) {
				for (int j = 0; j<6; j++) {
					if (A[i][j]==s.charAt(cur)) {
						br = i; bc = j;
						moves += Math.abs(br-ar)+Math.abs(bc-ac);
						ar = br; ac = bc;
					}
				}
			}
		}

		moves += Math.abs(ar-4+ac-5);
		System.out.println(moves);

	}

}
