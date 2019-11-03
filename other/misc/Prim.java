import java.util.*;
import java.io.*;

public class Prim {
	public static int V, E;
	public static int parent[];
	public static double minCost[]; // the connections between mstSet and others 
	public static boolean mstSet[];

	public static class Edge {
		int ev; double cost;
		public Edge(int ev, double cost) {
			this.ev = ev;
			this.cost = cost;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		V = sc.nextInt();
		E = sc.nextInt();

		ArrayList<Edge> [] map = new ArrayList[V];
		for (int i = 0; i<V; i++) {
			map[i] = new ArrayList<Edge>();
		}
		for (int i = 0; i<E; i++) {
			int bv = sc.nextInt(), ev = sc.nextInt();
			double cost = sc.nextDouble();
			map[bv].add(new Edge(ev, cost));
			map[ev].add(new Edge(bv, cost));
		}

		parent = new int[V];
		minCost = new double [V]; // the connections between mstSet and others 
		mstSet = new boolean[V];

		Arrays.fill(minCost, Double.MAX_VALUE);
		minCost[0] = 0;	parent[0] = -1;

		int u = 0;
		for (int i = 0; i<V; i++) {
			u = minKey();
			mstSet[u] = true;

			// use map row u to update mincost array and parents array

			for (int col = 0; col<V; col++) {
				if (!mstSet[col] && map[u].get(col).cost<minCost[i] && map[u].get(col).cost!=0) {
					minCost[col] = map[u].get(col).cost;
					parent[col] = u;
				}
			}
		}

		System.out.println("bv\t ev\t cost");
		for (int i = 0; i<V; i++) {
			System.out.println(i+" "+parent[i]+" "+minCost[i]);	
		}


	}

	public static int minKey() {
		//find out the lowest cost connection from the minCost array
		int min_index = -1;
		double min = Double.MAX_VALUE;
		for(int i = 0; i<V; i++) {
			if (!mstSet[i] && minCost[i]<min) {
				min = minCost[i];
				min_index = i;
			}
		}
		return min_index;
	}

}

// steps for prim
// store graph into a data structure
// 2d array or adjacency list
// vertex by vertex into minimum spanning map
// two sets of vertices, find lowest cost edge that connects the ones in map and the others
// undirected graph, so connect vertices both ways
// keep track of which vertices are already in map (like a vis array, boolean)
// stop when all vertices are in map
// pick a vertex from "not in" set, try to connect to one point, look for minimum cost
// look for all the connections to a certain vertex in the map and look for cheapest
// make sure the connection isn't already in the map (the row of that vertex in the array)
// add it to the "in" set
// parents array to keep track of who brought who into the map, to later recover the whole map
// key array is the same idea, but to show the lowest cost
// min key to find next available minimum cost edge
// key just contains the cost of the vertex that you bring in
