import java.util.Scanner;

public class ccc01s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		String in = sc.nextLine();
		int c = 0;
		int d = 0;
		int h = 0;
		int s = 0;

		int cp = 0;
		int dp = 0;
		int hp = 0;
		int sp = 0;

		for (int i = 0; i<in.length(); i++) {
			if (in.charAt(i) == 'C' ) {
				c = i;
			} else if (in.charAt(i) == 'D' ) {
				d = i;
			} else if (in.charAt(i) == 'H' ) {
				h = i;
			} else if (in.charAt(i) == 'S' ) {
				s = i;
			} 
		}

		String C = in.substring(in.indexOf('C'), d);
		String D = in.substring(in.indexOf('D'), h);
		String H = in.substring(in.indexOf('H'), s);
		String S = in.substring(in.indexOf('S'), in.length());

		System.out.println("Cards Dealt              Points");
		System.out.print("Clubs ");

		int cc = 6;
		if (C.length() == 1) {
			cp = cp+3;
		} else if (C.length() == 2) {
			cp = cp+2;
		} else if (C.length() == 3) {
			cp = cp+1;
		}

		for (int i = 1; i<C.length(); i++) {

			if (C.charAt(i)=='A') {
				cp = cp+4;
			} else if (C.charAt(i)=='K') {
				cp = cp+3;
			} else if (C.charAt(i)=='Q') {
				cp = cp+2;
			} else if (C.charAt(i)=='J') {
				cp = cp+1;
			}

			System.out.print(C.charAt(i));
			System.out.print(" ");
			cc = cc+2;
		}
		for (int i = 0; i<30-cc; i++) {
			System.out.print(" ");
		}
		System.out.print(cp);

		System.out.println();
		System.out.print("Diamonds ");
		int dc = 9;

		if (D.length() == 1) {
			dp = dp+3;
		} else if (D.length() == 2) {
			dp = dp+2;
		} else if (D.length() == 3) {
			dp = dp+1;
		}

		for (int i = 1; i<D.length(); i++) {

			if (D.charAt(i)=='A') {
				dp = dp+4;
			} else if (D.charAt(i)=='K') {
				dp = dp+3;
			} else if (D.charAt(i)=='Q') {
				dp = dp+2;
			} else if (D.charAt(i)=='J') {
				dp = dp+1;
			}

			System.out.print(D.charAt(i));
			System.out.print(" ");
			dc = dc+2;
		}
		for (int i = 0; i<30-dc; i++) {
			System.out.print(" ");
		}
		System.out.print(dp);

		System.out.println();
		System.out.print("Hearts ");
		int hc = 7;

		if (H.length() == 1) {
			hp = hp+3;
		} else if (H.length() == 2) {
			hp = hp+2;
		} else if (H.length() == 3) {
			hp = hp+1;
		}

		for (int i = 1; i<H.length(); i++) {

			if (H.charAt(i)=='A') {
				hp = hp+4;
			} else if (H.charAt(i)=='K') {
				hp = hp+3;
			} else if (H.charAt(i)=='Q') {
				hp = hp+2;
			} else if (H.charAt(i)=='J') {
				hp = hp+1;
			}

			System.out.print(H.charAt(i));
			System.out.print(" ");
			hc = hc+2;
		}
		for (int i = 0; i<30-hc; i++) {
			System.out.print(" ");
		}
		System.out.print(hp);

		System.out.println();
		System.out.print("Spades ");
		int spc = 7;

		if (S.length() == 1) {
			sp = sp+3;
		} else if (S.length() == 2) {
			sp = sp+2;
		} else if (S.length() == 3) {
			sp = sp+1;
		}

		for (int i = 1; i<S.length(); i++) {

			if (S.charAt(i)=='A') {
				sp = sp+4;
			} else if (S.charAt(i)=='K') {
				sp = sp+3;
			} else if (S.charAt(i)=='Q') {
				sp = sp+2;
			} else if (S.charAt(i)=='J') {
				sp = sp+1;
			}

			System.out.print(S.charAt(i));
			System.out.print(" ");
			spc = spc+2;
		}
		for (int i = 0; i<30-spc; i++) {
			System.out.print(" ");
		}
		System.out.print(sp);

		System.out.println();

		String total = (cp+dp+hp+sp)+"";

		for (int i = 0; i<30-5-total.length(); i++) {
			System.out.print(" ");
		}

		System.out.print("Total "+total);




	}

}
