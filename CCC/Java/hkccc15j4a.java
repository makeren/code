import java.util.Arrays;
import java.util.Scanner;
public class hkccc15j4a {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(), N = sc.nextInt();
		int s1 = 0, e1 = 0;
		int s2, e2 = 0;
		int max = 0;
		
		for (int i = 0; i<N; i++) {
			s2 = sc.nextInt(); e2 = sc.nextInt();
			if (s2-e1>max) max = s2-e1;
			s1 = s2; e1 = e2;
		}
		
		if (L-e2>max) max = L-e2;
		
		System.out.println(max);

	}

}
