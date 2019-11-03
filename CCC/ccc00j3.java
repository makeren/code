import java.util.Scanner;

public class ccc00j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int count = 0;

		int q = sc.nextInt();
		int m1 = sc.nextInt();
		int m2 = sc.nextInt();
		int m3 = sc.nextInt();

		int m1r = 35-m1;
		int m2r = 100-m2;
		int m3r = 10-m3;

		while (q>0) {
			q--;
			m1r--;
			count++;
			if (m1r==0) {
				m1r = 35;
				q = q+30;
			}
			
			if (q==0) {
				break;
			}

			q--;
			m2r--;
			count++;
			if (m2r==0) {
				m2r = 100;
				q = q+60;
			}
			
			if (q==0) {
				break;
			}

			q--;
			m3r--;
			count++;
			if (m3r==0) {
				m3r = 10;
				q = q+9;
			}

		}

		System.out.println("Martha plays "+count+" times before going broke.");

	}

}
