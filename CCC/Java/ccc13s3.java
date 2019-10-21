import java.util.*;
public class ccc13s3 {
	static int T = 0, G = 0, rem = 0, ans = 0, pts [] = new int [5];
	static boolean game [][] = new boolean [5][5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		T = sc.nextInt();
		G = sc.nextInt();
		rem = 6-G;
		for (int i = 0; i<G; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), sa = sc.nextInt(), sb = sc.nextInt();
			if (sa>sb) {
				pts[a]+=3;
			} else if (sb>sa) {
				pts[b]+=3;
			} else {
				pts[a]++;
				pts[b]++;
			}
			game[a][b] = game[b][a] = true;
		}
		solve();
		System.out.println(ans);
	}
	public static void solve() {
		if (rem==0) {
			for (int i = 1; i<=4; i++) 
				if (i!=T && pts[i]>=pts[T]) return;
			ans++;
			return;
		}
		boolean back[][] = new boolean [5][5];
		for (int r = 1; r<=4; r++) 
			for (int c = 1; c<=4; c++) 
				back[r][c] = game[r][c];
		for (int i = 1; i<=4; i++) {
			for (int j = i+1; j<=4; j++) {
				if (!game[i][j]) {
					game[j][i] = game[i][j] = true; rem--;
					pts[i]+=3; solve(); pts[i]-=3;
					pts[j]+=3; solve(); pts[j]-=3;
					pts[i]++; pts[j]++; solve(); pts[i]--; pts[j]--;
					rem++;
				}
			}
		}
		for (int r = 1; r<=4; r++) 
			for (int c = 1; c<=4; c++) 
				game[r][c] = back[r][c];
	}

}
