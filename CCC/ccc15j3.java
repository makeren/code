import java.util.Scanner;

public class ccc15j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();

		int base = (int) 'a';
		int A;
		String S1 = "";

		String[] change = new String[26];
		change[0] = "a";
		change[1] = "bac";
		change[2] = "cad";
		change[3] = "def";
		change[4] = "e";
		change[5] = "feg";
		change[6] = "geh";
		change[7] = "hij";
		change[8] = "i";
		change[9] = "jik";
		change[10] = "kil";
		change[11] = "lim";
		change[12] = "mon";
		change[13] = "nop";
		change[14] = "o";
		change[15] = "poq";
		change[16] = "qor";
		change[17] = "ros";
		change[18] = "sut";
		change[19] = "tuv";
		change[20] = "u";
		change[21] = "vuw";
		change[22] = "wux";
		change[23] = "xuy";
		change[24] = "yuz";
		change[25] = "zuz";

		for(int i=0;i<S.length();i++) {
			A = (int) (S.charAt(i)) - base;
			S1= S1 + change[A];
		}	
		System.out.println(S1);
	}

}
