import java.util.Scanner;

public class ccc07j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String[] trans = new String[12];
		trans[0] = "see you";
		trans[1] = "I'm happy";
		trans[2] = "I'm unhappy";
		trans[3] = "wink";
		trans[4] = "stick out my tongue";
		trans[5] = "sleepy";
		trans[6] = "totally awesome";
		trans[7] = "Canadian Computing Competition";
		trans[8] = "because";
		trans[9] = "thank-you";
		trans[10] = "you're welcome";
		trans[11] = "talk to you later";

		String[] txt = new String[12];
		txt[0] = "CU";
		txt[1] = ":-)";
		txt[2] = ":-(";
		txt[3] = ";-)";
		txt[4] = ":-P";
		txt[5] = ";-)";
		txt[6] = "TA";
		txt[7] = "CCC";
		txt[8] = "CUZ";
		txt[9] = "TY";
		txt[10] = "YW";
		txt[11] = "TTYL";

		String S = "";

		do {
			S = sc.nextLine();
			boolean isFound = false;
			for (int i = 0; i<12; i++) {
				if (S.equals(txt[i])) {
					isFound = true;
					System.out.println(trans[i]);
					break;
				}
			}

			if (false==isFound) {
				System.out.println(S);
			}
		}while (!S.equals("TTYL"));



	}

}
