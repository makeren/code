import java.util.Scanner;

public class ccc13j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		S = S.replaceAll("I", "");
		S = S.replaceAll("O", "");
		S = S.replaceAll("S", "");
		S = S.replaceAll("H", "");
		S = S.replaceAll("Z", "");
		S = S.replaceAll("X", "");
		S = S.replaceAll("N", "");
		if(S.length()==0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}

}
