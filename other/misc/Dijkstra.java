import java.util.*; 

public class Dijkstra { 
	public static int V, E, src;
	public static double map[][]; 
	public static double dis[];
	public static boolean vis[];

	public static int minDistance() { 
		double min = Double.MAX_VALUE;
		int min_index= -1; 
		for (int v = 0; v < V; v++) 
			if (!vis[v] && dis[v] < min) {
				min = dis[v]; 
				min_index = v; 
			}
		return min_index; 
	} 

	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt(); E = sc.nextInt(); src = sc.nextInt();
		map = new double[V][V];
		for (int i = 0; i<E; i++) {
			int r = sc.nextInt(), c = sc.nextInt();
			double cost = sc.nextDouble();
			map[r][c] = cost; map[c][r] = cost;
		}
		
		dis = new double[V];
		vis = new boolean[V];
		Arrays.fill(dis, Double.MAX_VALUE);
		dis[src] = 0; 

		for (int i = 0; i < V-1; i++) {
			int u = minDistance(); 
			vis[u] = true; 
			for (int v = 0; v < V; v++) 
				if (!vis[v] && map[u][v]!=0 && dis[u]+map[u][v] < dis[v]) dis[v] = dis[u] + map[u][v]; 
		}
		System.out.println("Vertex\t\tDistance from "+src); 
		for (int i = 0; i < V; i++) System.out.println(i+"\t\t"+dis[i]); 
	}
}
