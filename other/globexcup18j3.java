import java.util.*;
public class globexcup18j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner (System.in);
		int N = sc.nextInt();
		int count = 0;

		for (int i = 0; i<N; i++) {
			int n = sc.nextInt();
			String s = n+"";
			int sum = 0;
			for (int j = 0; j<s.length(); j++) sum+=s.charAt(j)-'0';
			if (isPrime(n) && isPrime(sum) && n!=1) count++;

		}
		System.out.println(count);
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i==0) return false;
		}
		return true;
	}

}
