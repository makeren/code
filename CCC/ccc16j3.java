import java.util.Arrays;
import java.util.Scanner;

public class ccc16j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		String S = sc.next();
		int count = 0;
		int end = 0;

		

		boolean flag = true;

		for (int i = 0; i<S.length(); i++) {
			for (int j = i+1; j<=S.length(); j++) {
				String sub = S.substring(i, j);
				for (int k = 0; k<sub.length(); k++) {
					char f = sub.charAt(k);
					char e = sub.charAt(sub.length()-k-1);
					if (f==e) {
						count++;
					} else {
						if (count>end) {
							end = count;
						}
					}
				}
			}
		}
		
		System.out.println(end);





	}

}
