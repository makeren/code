import java.util.Scanner;

public class ccc02j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		String S = sc.next();

		while (!S.equals("quit!")) {
			if (S.length()>4 && S.endsWith("or") && !"aeiouy".contains(S.charAt(S.length()-3) + "")) {
				System.out.println(S.substring(0, S.length()-2) + "our");
				S = sc.next();
			} else {
				System.out.println(S);
				S = sc.next();
			}
		}

	}

}
