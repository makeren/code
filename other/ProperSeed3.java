import java.util.Scanner;

public class ProperSeed3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int I = sc.nextInt(), N = sc.nextInt(), J = sc.nextInt(), ans = 0;
		int[] dif = new int [I+2];
		for (int i = 0; i<J; i++) {
			int x = sc.nextInt(), y = sc.nextInt(), v = sc.nextInt();
			dif[x] += v; dif[y+1] -=v;
		}
		
		for (int i = 1; i<=I; i++) {
			dif[i] += dif [i-1];
			if (dif[i]<N) ans++;
		}
		System.out.println(ans);

	}

}
