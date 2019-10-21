import java.util.*;

public class ccc00j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int m = sc.nextInt(), n = sc.nextInt();
		int count = 0;
		boolean flag = false;

		for (int i = m; i<=n; i++) {
			String s = i+"";
			for (int j = 0; j<s.length(); j++) {
				if ((s.charAt(j)=='1' && s.charAt(s.length()-1-j)=='1')
					|| (s.charAt(j)=='8' && s.charAt(s.length()-1-j)=='8')
					|| (s.charAt(j)=='0' && s.charAt(s.length()-1-j)=='0')
					|| (s.charAt(j)=='6' && s.charAt(s.length()-1-j)=='9')
					|| (s.charAt(j)=='9' && s.charAt(s.length()-1-j)=='6')) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) count++;
		}

		System.out.println(count);

	}

}


