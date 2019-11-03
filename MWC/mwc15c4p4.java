import java.util.*;

public class mwc15c4p4 {
	static int N = 0;
	static ArrayList <Integer> adj[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		N = sc.nextInt();
		adj = new ArrayList [1001];

		for (int i = 0; i<=1000; i++) {
			adj [i] = new ArrayList <Integer>();
		}
		for (int i = 1; i<N; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			adj[x].add(y);
		}

		int st = sc.nextInt(), ed = sc.nextInt();
		Queue <Integer> Q = new LinkedList <Integer>();
		boolean vis [] = new boolean [1001];
		Q.add(st);
		vis[st] = true;
		while (!Q.isEmpty()) {
			int cur = Q.poll();
			for (int v:adj[cur]) {
				if (!vis[v]) {
					Q.add(v);
					vis[v] = true;
				}
			}
		}
		
		System.out.println(vis[ed]? "Tangled":"Not Tangled");


	}
}
