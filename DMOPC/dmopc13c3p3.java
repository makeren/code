import java.util.*;
public class dmopc13c3p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), H = sc.nextInt();
		int [][] map = new int [N+1][N+1];
		int [][] d = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
		boolean [][] vis = new boolean [N+1][N+1];
		
		for (int i = 1; i<=N; i++) {
			for (int j = 1; j<=N; j++) {
				map[i][j] = sc.nextInt();
			}
			
			Queue<P> Q = new LinkedList<P>();
			Q.add(new P(1, 1));
			vis[1][1] = true;
			while(!Q.isEmpty()) {
				P cur = Q.poll();
				for (int k = 0; k<4; k++) {
					int nr = cur.r + d[k][0], nc = cur.c + d[k][1];
					if (nr>=1 && nr<=N && nc>=1 && nc<=N && !vis[nr][nc] && Math.abs(map[cur.r][cur.c]- map[nr][nc])<=H) {
						Q.add(new P(nr, nc));
						vis[nr][nc] = true;
					}
				}
			}
		}
		if (vis[N][N]) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	}
	static class P {
		int r, c;
		P (int r0, int c0) {
			r = r0; c = c0;
			}
	}

}
