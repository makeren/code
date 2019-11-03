import java.util.*;
public class ccc18j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		String y = sc.next();
		String t = sc.next();
		int spaces = 0;
		for (int i = 0; i<N; i++) {
			if (y.charAt(i)=='C' && t.charAt(i)=='C') {
				spaces++;
			}
		}
		System.out.println(spaces);

	}

}