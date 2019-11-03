import java.util.*;
public class vmss7wc16c3p2ADJLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt(), M = sc.nextInt(), A = sc.nextInt(), B = sc.nextInt();
		//creating array list for adj list
		ArrayList<Integer> adj[] = new ArrayList[N+1];
		for (int i = 0; i<=N; i++) {
			adj[i] = new ArrayList<Integer>();
		}
		
		//set points in adjacency list
		for (int i = 0; i<M; i++) {
			int u = sc.nextInt(), v = sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
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
			for (int v:adj[cur]) {
				//find a new vertex v
				if(!vis[v]) {
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
