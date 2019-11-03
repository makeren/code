import java.util.Scanner;

public class ccc10j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int N = 0;
		int B = 0;
		int countn = 0;
		int countb = 0;

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();

		while(true) {

			for (int i = 0; i<a; i++) {
				N++;
				countn++;
				if (countn>s) {
					break;
				}
			}
			
			for (int i = 0; i<b; i++) {
				N--;
				countn++;
				if (countn>s) {
					break;
				}
			}
			if (countn>s) {
				break;
			}
		}

		while(true) {
			for (int i = 0; i<c; i++) {
				B++;
				countb++;
				if (countb>s) {
					break;
				}
			}
			
			for (int i = 0; i<d; i++) {
				B--;
				countb++;
				if (countb>s) {
					break;
				}
			}
			if (countb>s) {
				break;
			}
		
		}
		
		if (N>B) {
			System.out.println("Nikky");
		} else if (B>N) {
			System.out.println("Byron");
		} else {
			System.out.println("Tied");
		}


	}

}