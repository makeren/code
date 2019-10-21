import java.util.*;
public class hkccc15j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int [] x = new int [N];
		int [] y = new int [N];

		for (int i = 0; i<N; i++) {
			int xp = sc.nextInt(), yp = sc.nextInt();
			x[i] = xp;
			y[i] = yp;
		}

		int sz = Integer.MAX_VALUE;

		for (int i = 0; i<N; i++) {
			for (int j = i+1; j<N; j++) {
				int t = Math.max(Math.abs(x[i]-x[j]), Math.abs(y[i]-y[j]));
				sz = Math.min(sz,  t);
			}
		}
		
		System.out.println(sz*sz);


	}

}
