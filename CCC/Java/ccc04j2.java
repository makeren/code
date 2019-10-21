import java.util.Scanner;

public class ccc04j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int year = X;

		int m = 4;
		int t = 2;
		int c = 3;
		int d = 5;

		for (int i=X; i<=Y; i++) {
			if((i-X)%m == 0 && (i-X)%t == 0 && (i-X)%c == 0 && (i-X)%d == 0) {
				System.out.println("All positions change in year "+i);
			}
		}



	}

}
