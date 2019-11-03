import java.util.*;
import java.io.*;
public class P0 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new FileReader ("DATA01.txt"));
		while (sc.hasNext()) {
			for (int j = 0; j<5; j++) {
				int [] F = new int [3];
				int [] P = new int [3];
				for (int i = 0; i<20; i++) {
					String S = sc.next();
					if (S.equals("LADYBUG")) {
						F[0]++;
					} else if (S.equals("SPIDER")) {
						F[1]++;
					} else if (S.equals("CENTIPEDE")) {
						F[2]++;
					} else if (S.equals("COCKROACH")) {
						P[0]++;
					} else if (S.equals("ANT")) {
						P[1]++;
					} else {
						P[2]++;
					}
			}
				Arrays.sort(P);
				Arrays.sort(F);
				
			if (P[2]>F[2]) {
				System.out.println("PEST");
			} else {
				System.out.println("FRIEND");
			}
		}
	}


}

}
