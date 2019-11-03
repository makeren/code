import java.util.*;
public class dwite07c2p5 {
	static int N;
	static int adj[][];
	static int vis[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		N = sc.nextInt();
		adj = new int [N+1][N+1];
		vis = new int [N+1];
		int M = sc.nextInt();
		
		for (int i = 0; i<M; i++) {
			int r = sc.nextInt(), c = sc.nextInt();
			adj[c][r] = adj[r][c] = 1;
		}

		for (int i = 0; i<=N; i++) {
			if (vis[i]==0) {
				dfs(i);
			}
		}
	}
	
	static void dfs (int u) {
		vis[u] = 1;
		for (int i = 0; i<N+1; i++) {
			if (adj[u][i]==1) {
				if(vis[i]==0) {
					dfs(i);
				}
			}
		}
		vis[u] = 2;
	}


}

