import java.util.Scanner;

public class ccc01j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int H = sc.nextInt();


		for (int j = 1; j<=H; j=j+2) {
			for (int k = 0; k<j; k++) {
				System.out.print("*");
			}
			for (int l = (H*2-j*2)-1; l>=0; l--) {
				System.out.print(" ");
			}
			for (int k = 0; k<=j-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int j = H-2; j>0; j=j-2) {
			for (int k = 0; k<j; k++) {
				System.out.print("*");
			}
			for (int l = (H*2-j*2)-1; l>=0; l--) {
				System.out.print(" ");
			}
			for (int k = 0; k<=j-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
