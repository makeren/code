import java.util.*;

public class ccc17j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		int k = sc.nextInt();
		double sum = 0;
		
		for (int i = 0; i<=k; i++) {
			sum = sum + N*Math.pow(10, i);
		}
		
		System.out.println((int)sum);

	}

}
