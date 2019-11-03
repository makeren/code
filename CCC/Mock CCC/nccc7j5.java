import java.util.*;
public class nccc7j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), D = sc.nextInt();

		int count = 0;

		for (int i = A; i<=B; i++) {
			for (int j = C; j<=D; j++) {
				if (gcd(i, j)==1) count++;
			}
		}

		System.out.println(count);

	}

	 public static int gcd(int u, int v) {
	        //simple termination cases
	        if (v == 0) return u;
	        if (u == 0) return v;

	        //look for factors of 2
	        // u and v even
	        // If u and v are both even, then gcd(u, v) = 2·gcd(u/2, v/2), because 2 is a common divisor
	        if ((u & 1) == 0 && (v & 1) == 0){
	            return gcd(u >> 1, v >> 1) << 1;
	        }

	        // u is even, v is odd
	        // If u is even and v is odd, then gcd(u, v) = gcd(u/2, v), because 2 is not a common divisor
	        else if ((u & 1) == 0){
	            return gcd(u >> 1, v);
	        }

	        // u is odd, v is even
	        // If u is odd and v is even, then gcd(u, v) = gcd(u, v/2)
	        else if ((v & 1) == 0){
	            return gcd(u, v >> 1);
	        }

	        // u and v odd, u >= v
	        // If u and v are both odd, and u ≥ v, then gcd(u, v) = gcd((u − v)/2, v)
	        else if (u >= v){
	            return gcd((u-v) >> 1, v);
	        }

	        // u and v odd, u < v
	        // If both are odd and u < v, then gcd(u, v) = gcd((v − u)/2, u)
	        else{
	            return gcd(u, (v-u) >> 1);
	        }
	    }

}
