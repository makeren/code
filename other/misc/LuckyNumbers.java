import java.util.Scanner;

public class LuckyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the range (inclusive) in which you wish to search for lucky numbers:");
		System.out.print("	From: ");
		int N = sc.nextInt();
		System.out.print("	To: ");
		int M = sc.nextInt();
		int count = 0;

		System.out.println("\nLIST OF LUCKY NUMBERS FROM "+N+" TO "+M);

		while (N!=M+1) {
			boolean isLucky = true;
			int a = N;

			while (a!=0) {
				if (a%3==0 && a!=0) {
					isLucky = false;
					break;
				}
				a /= 3;
			}
			if (true==isLucky) {
				count++;
				System.out.println(N+" is lucky!");
			}
			N++;
		}

		System.out.println("\nThere are "+count+" lucky numbers.");

		System.out.print("\n\nNumber of integers you want proof for (enter '0' to terminate the program): ");
		int S = sc.nextInt();

		if (S!=0) {
			for (int i = 1; i<=S; i++) {
				int term = 1;
				System.out.print("Integer #"+i+": ");
				int P = sc.nextInt()*3;
				do {
					P /= 3;
					System.out.print("	Term #"+term+" = "+P+" ("+P+"/3 = "+P/3.0);
					if (P%3==0 && P!=0) {
						System.out.print(", cannot be a lucky number)");
					} else {
						System.out.print(")");
					}
					System.out.println();
					term++;
				} while (P!=0);
				System.out.println();
			}
		}




	}

}
