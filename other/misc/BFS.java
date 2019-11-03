import java.util.*;
public class BFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//map, queue, distance array
		int V = sc.nextInt(), E = sc.nextInt();

		ArrayList <Integer> adj []= new ArrayList [V+1];
		
		for (int i = 0; i<adj.length; i++) {
			adj[i] = new ArrayList <Integer>();
		}
		
		for (int i = 0; i<E; i++) {
			int r = sc.nextInt(), c = sc.nextInt();
			adj[r].add(c); adj[c].add(r);
		}

		Queue <Integer> Q = new LinkedList <Integer>();
		boolean [] vis = new boolean [V+1];
		int [] dis = new int [V+1];
		
		Q.add(1);
		vis[1] = true;
		dis[1] = 0;
		
		while (!Q.isEmpty()) {
			int cur = Q.poll();
			for (int v:adj[cur]) {
				if (!vis[v]) {
					vis[v] = true;
					Q.add(v);
					dis[v] = dis[cur]+1;
				}
			}
		}
		for (int i = 1; i<=V; i++) {
			if (dis[i]==0) System.out.println("There is no connection between Vertex 1 and "+i+".");
			else System.out.println("Vertex 1 to "+i+" distance is "+dis[i]+".");
		}

	}

}
