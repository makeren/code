import java.util.*;
public class JaydenStudiesTrees {
	static int N = 0;
	static int max = 0;
	static int vertex = 0;
	static ArrayList <Integer> adj[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		N = sc.nextInt();
		adj = new ArrayList [N+1];

		for (int i = 0; i<=N; i++) {
			adj [i] = new ArrayList <Integer>();
		}
		for (int i = 1; i<N; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			adj[x].add(y);
			adj[y].add(x);
		}
		// start from any vertex
		bfs(1);
		// then search again from farthest vertex from start
		bfs(vertex);
		System.out.println(max);

	}
	public static void bfs (int start) {
		// initializing
		Queue <Integer> Q = new LinkedList<Integer>();
		boolean [] vis = new boolean [N+1];
		int [] dis = new int [N+1];
		Q.add(start);
		vis[start] = true;
		// standard while looping
		while (!Q.isEmpty()) {
			int cur = Q.poll();
			// check to see if current distance is the longest distance
			if (dis[cur] > max) {
				max = dis[cur];
				vertex = cur;
				//in the end, max will be the longest distance in this run
				// vertex will be the vertex that led to the longest distance
				// (from 1, the starting vertex)
			}
			// going through all the points, one by one
			for (int v:adj[cur]) {
				// this for loop uses the variable v to go through all the elements in adj[cur]
				// specifically, the connections
				// e.g. adj[cur] contains 2, 3, and 6
				// then v will take on the values of 2, 3, and 6
				if (!vis[v]) {
					// add unvisited points to queue
					vis[v] = true;
					Q.add(v);
					// update distance
					dis[v] = dis[cur]+1;
				}
			}
		}

	}

}


