import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = GCD(a, b);
	}
	
	public static int GCD(int a, int b) {
		int rem = a%b;
		if (rem==0) return b;
		else return GCD(b, rem);
	}

}
