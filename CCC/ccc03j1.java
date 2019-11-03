import java.util.Scanner;

public class ccc03j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int t = sc.nextInt();
		int s = sc.nextInt();
		int h = sc.nextInt();

		for (int i = 0; i<t; i++) {
			System.out.print("*");
			for (int k = 0; k<2; k++) {
				for (int j = 0; j<s; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 0; i<3+s*2; i++) {
			System.out.print("*");
		}
		
		for (int i = 0; i<h; i++) {
			System.out.println();
			for (int j = 0; j<s+1; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
		}

	}

}
