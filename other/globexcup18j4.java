import java.util.*;
public class globexcup18j4 {
	public static long a, b, c, d, e;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		a = sc.nextLong(); b = sc.nextLong(); c = sc.nextLong(); d = sc.nextLong(); e = sc.nextLong();
		long N = sc.nextLong();
		long x = magic(N);
		System.out.println(x%1000000007);
		

	}
	public static long magic (long n) {
		if (n==0) return e;
		else return (a*magic(n/b))%1000000007+(c*magic(n/d))%1000000007;
	}

}
