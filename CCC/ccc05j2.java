import java.util.Scanner;

public class ccc05j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();
		int rsa = 0;

		for (int i = M; i<=N; i++) {
			int count = 0;
			for (int j = 1; j<=N; j++) {
				if (i%j==0) {
					count++;
				}
			}
			if (count==4) {
				rsa++;
			}
		}
		
		System.out.println("The number of RSA numbers between " + M + " and " + N + " is " + rsa);
		
	}

}
