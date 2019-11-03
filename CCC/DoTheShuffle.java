import java.util.*;
public class DoTheShuffle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);

		int b = sc.nextInt();
		int n = sc.nextInt();
		char t = ' ';
		char [] s = new char [5];
		s[0] = 'A';
		s[1] = 'B';
		s[2] = 'C';
		s[3] = 'D';
		s[4] = 'E';

		while (b!=4) {
			if (b==1) {
				for (int i = 0; i<n; i++) {
					t = s[0];
					for (int j = 1; j<5; j++) {
						s[j-1] = s[j];
					}
					s[4] = t;
				}
			} else if (b==2) {
				for (int i = 0; i<n; i++) {
					t = s[4];
					for (int j = 4; j>0; j--) {
						s[j] = s[j-1];
					}
					s[0] = t;
				}
			} else if (b==3) {
				for (int i = 0; i<n; i++) {
					t = s[0];
					s[0] = s[1];
					s[1] = t;
				}
			}
			b = sc.nextInt();
			n = sc.nextInt();
		}

		for (int i = 0; i<5; i++) {
			System.out.print(s[i]+" ");
		}

	}

}
