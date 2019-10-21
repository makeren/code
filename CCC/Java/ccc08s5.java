import java.util.*;

public class ccc08s5 {
	static boolean dp[][][][] = new boolean [31][31][31][31];
	public static boolean solve (int a, int b, int c, int d) { // take quantities of each particle 

		// if the last move made by opponent reduced a particle to negative, it's illegal and i win
		if (a<0 || b<0 || c<0 || d<0) return true;

		// if the state is determined to be winning, return true
		if(dp[a][b][c][d]) return true;

		// try all reactions, if opponent is unable to win in a resulting state, you win
		dp[a][b][c][d] = (!solve(a-1, b-1, c, d-2) ||
				!solve(a-1, b-1, c-1, d-1) ||
				!solve (a, b, c-2, d-1) ||
				!solve (a, b-3, c, d) ||
				!solve (a-1, b, c, d-1));

		return dp[a][b][c][d];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int particles [][] = new int [n][4];
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<4; j++) {
				particles[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i<n; i++) {
			solve(particles[i][0], particles[i][1], particles[i][2], particles[i][3]);
		}



	}

}
