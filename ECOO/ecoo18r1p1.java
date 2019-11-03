import java.util.*;
import java.io.*;
public class P1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new FileReader ("DATA11.txt"));

		while (sc.hasNext()) {
			int extra = 0;
			int days = 0;
			for (int i = 0; i<10; i++) {
				boolean flag = false;
				int count = 0;
				extra = 0;
				int T = sc.nextInt(), N = sc.nextInt();
				for (int j = 0; j<N; j++) {
					String S = sc.next();
					if (S.equals("B")) {
						flag = true;
						extra+=T;
					} else if (flag==false) {
						count++;
					}
				}
				days = N;
				if (extra+count>=days) {
					System.out.println(extra+count-days);
				} else {
					System.out.println("0");
				}
			}

		}

	}
}
