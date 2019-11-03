import java.util.*;
public class tree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		int adj[][] = new int [4][4];
		int sum = 0;
		for (int r = 0; r<4; r++) {
			int row = 0;
			for (int c = 0; c<4; c++) {
				adj[r][c] = sc.nextInt();
				sum+=adj[r][c];
				row+=adj[r][c];
			}
			if (row==0) {
				System.out.println("No");
				return;
			}
		}
		if (sum!=6) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}

}
