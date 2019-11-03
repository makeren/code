import java.util.*;
public class tle17c3p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int x = sc.nextInt(), y = sc.nextInt();
		int N = sc.nextInt();
		double [] d = new double [N];

		for (int i = 0; i<N; i++) {
			int px = sc.nextInt(), py = sc.nextInt();
			d[i] = Math.abs(px-x)+Math.abs(py-y);
		}

		Arrays.sort(d);

		double a = 2*d[N-1]*d[N-1];

		if (a-(int)a<0.5) {
			System.out.println((int)a);
		} else {
			System.out.println((int)a+1);
		}





	}

}
