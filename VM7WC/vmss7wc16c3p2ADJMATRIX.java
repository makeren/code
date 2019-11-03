import java.util.*;
public class vmss7wc16c3p2ADJMATRIX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt(), M = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		boolean [][] adj = new boolean [N+1][N+1];
		
		//set points in adjacency matrix
		for (int i = 0; i<M; i++) {
			int u = sc.nextInt(), v = sc.nextInt();
			adj[u][v] = true;
			adj[v][u] = true;
		}
		
		//create queue + visited or not array + distance array
		Queue<Integer> Q = new LinkedList<Integer>();
		boolean [] vis = new boolean [N+1];
		int [] dis = new int [N+1];
		//add A (starting) as the first location
		Q.add(A);
		vis[A] = true;
		dis[A] = 0;
		//brute force looping basically
		while (!Q.isEmpty()) {
			int cur = Q.poll();
			for (int v = 1; v<=N; v++) {
				//is connected and never visited
				if(adj[cur][v]==true && !vis[v]) {
					//add v to part of the queue
					Q.add(v);
					//set as visited
					vis[v] = true;
					//distance updated
					dis[v] = dis[cur]+1;
				}
			}
		}
		if (vis[B]==true) {
			System.out.println("GO SHAHIR!");
		} else {
			System.out.println("NO SHAHIR!");
		}

	}

}
