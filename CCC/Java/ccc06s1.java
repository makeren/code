import java.util.*;
public class ccc06s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int [] A = new int [5];
		int [] B = new int [5];
		int count = 0;
		String g = sc.next();
		for (int i = 0; i<=g.length()-2; i+=2) {
			A[count] = g.charAt(i)+g.charAt(i+1);
			count++;
		}
		count = 0;
		g = sc.next();
		for (int i = 0; i<=g.length()-2; i+=2) {
			B[count] = g.charAt(i)+g.charAt(i+1);
			count++;
		}

		int X = sc.nextInt();
		for (int i = 0; i<X; i++) {
			boolean isChild = true;
			String BG = sc.next();
			String bg = BG.toLowerCase();
			String BGU = BG.toUpperCase();

			for (int j = 0; j<5; j++) {
				if (BG.charAt(j)==bg.charAt(j)) {
					if (A[j]==2*BGU.charAt(j) || B[j]==2*BGU.charAt(j)) {
						isChild = false;
						break;
					}
				} else {
					if (A[j]==2*bg.charAt(j) && B[j]==2*bg.charAt(j)) {
						isChild = false;
						break;
					}
				}
			}
			if (true==isChild) {
				System.out.println("Possible baby.");
			} else {
				System.out.println("Not their baby!");
			}
		}


	}

}
