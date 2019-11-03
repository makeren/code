import java.util.*;
public class Kruskal {
	
	public static Edge [] edge; //store original edges
	public static Edge [] mst; //store final result (the mst)
	public static int [] parent;
	
	public static class Edge implements Comparable <Edge> {
		int bv;
		int ev;
		double cost;
		// first constructor contains no input parameters
		public Edge() {
		}
		public Edge(int bv, int ev, double cost) {
			this.bv = bv;
			this.ev = ev;
			this.cost = cost;
		}

		public int compareTo(Edge o) {
			if (this.cost>o.cost) return 1;
			else if (this.cost<o.cost)return -1;
			else return 0;
		}
		
	}
	
	public static int find (int v) {
		if (parent[v]==-1) return v; // the root parent has been found
		else return find(parent[v]); // keep going until the parent is -1
	}
	
	public static void union (int bp, int ep) {
		parent[bp] = ep;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create edge class (with beginning vertex, ending vertex, and cost), implement comparable
		// function compareTo to see which edges have a greater cost
		// store edges of graph in edge array
		// sort array by cost
		// create find parent function and parent array, start with each at -1
		// connect edges with a common node with union, and one's parent to the other
		// keep going until -1 is reached
		// if the two parents are the same, discard edge
		// stop once number of edges = number of nodes-1
		
		Scanner sc = new Scanner (System.in);
		int V = sc.nextInt(), E = sc.nextInt();
		edge = new Edge [E];
		mst = new Edge [V-1];
		parent = new int [V];
		
		for (int i = 0; i<E; i++) edge[i] = new Edge(sc.nextInt(), sc.nextInt(), sc.nextDouble());
		for (int i = 0; i<V-1; i++) mst[i] = new Edge();
		for (int i = 0; i<V; i++) parent[i] = -1;
		
		Arrays.sort(edge);
		int count = 0;
		for (int i = 0; i<E; i++) {
			//find root parent of bv and ev of every edge
			int bp = find(edge[i].bv);
			int ep = find(edge[i].ev);
			
			if (bp!=ep) { // if root parents are not equal
				union(bp, ep);
				mst[count] = edge[i];
				count++;
				if (count==V-1) break;
			}
		}
		
		for (int i = 0; i<V-1; i++) System.out.println(mst[i].bv+" "+mst[i].ev+" "+mst[i].cost);
	

	}

}
