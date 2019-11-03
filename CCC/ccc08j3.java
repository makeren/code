import java.util.*;

public class ccc08j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int [] x = new int [29];
		int [] y = new int [29];

		for (int i = 0; i<6; i++) {
			for (int j = i; j<29; j+=6) {
				for (int k = 0; k<6; k++) {
					if (i==k) x[j] = k;	break;
				}
				for (int l = 0; l<5; l++) {
					y[j] = i;
				}
			}
		}

		for (int j = 0; j<29; j++) {
			y[j] = j/6;
		}

		String S = sc.nextLine();

		int d = 0, a = 0;
		int t = S.charAt(0) - (int) 'A';

		if (t==-33) t = 26;
		else if (t==-20) t = 27;
		else if (t==-19) t = 28;
		

		int ax = Math.abs(x[0]-x[t]);
		int ay = Math.abs(y[0]-y[t]);
		a = ax+ay;

		for (int i = 0; i<=S.length()-2; i++) {
			
			int t1 = S.charAt(i) - (int) 'A';
			int t2 = S.charAt(i+1) - (int) 'A';

			if (t1==-33) {
				t1 = 26;
			} else if (t1==-20) {
				t1 = 27;
			} else if (t1==-19) {
				t1 = 28;
			}

			if (t2==-33) {
				t2 = 26;
			} else if (t2==-20) {
				t2 = 27;
			} else if (t2==-19) {
				t2 = 28;
			}

			int dx = Math.abs(x[t2]-x[t1]);
			int dy = Math.abs(y[t2]-y[t1]);
			int dc = dx+dy;
			d += dc;
		}

		int ls = 0;
		int l = S.charAt(S.length()-1) - (int) 'A';

		if (l==-33) {
			l = 26;
		} else if (l==-20) {
			l = 27;
		} else if (l==-19) {
			l = 28;
		}
		
		int lx = Math.abs(5-x[l]);
		int ly = Math.abs(4-y[l]);
		ls = lx+ly;

		System.out.println(a+d+ls);

	}

}
