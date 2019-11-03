import java.util.Scanner;

public class ccc00j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int start = sc.nextInt();
		int days = sc.nextInt();
		int count = start-1;
		boolean newLine = true;

		System.out.println("Sun Mon Tue Wed Thr Fri Sat");

		for (int i = 0; i<(start-1)*3+start-1; i++) {
			System.out.print(" ");
		}

		for (int i = 1; i<=days; i++) {
			if (newLine==false)	System.out.print(" ");
			else newLine = false;
			if (i-10<0) {
				System.out.print("  "+i);
				count++;
			} else {
				System.out.print(" "+i);
				count++;
			}

			if (count>=7 || i==days) {
				count = 0;
				newLine = true;
				System.out.println();
			}
		}

	}

}
