import java.util.*;

public class PrimTeacher {
	public static int V, E;
	public static boolean[] mstSet;
	public static int[] parent;
	public static double[] key;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		V = sc.nextInt(); E = sc.nextInt();

		double map[][] = new double[V][V];
		
		for (int i = 0; i<E; i++) {
			int bv = sc.nextInt(), ev = sc.nextInt();
			double cost = sc.nextDouble();
			map[bv][ev] = cost; map[ev][bv] = cost;
		}

		mstSet = new boolean[V]; 
		parent = new int[V];
		key = new double[V];
		
		Arrays.fill(key, Double.MAX_VALUE);
		key[0] = 0;
		parent[0] = -1;
		
		for (int i = 0; i<V; i++) {
			int u = minKey();
			mstSet[u] = true;

			//you can use map row u to update
			//key array and parent array
			for (int col = 0; col<V; col++) {
				if (!mstSet[col] && key[col]>map[u][col] && map[u][col]!=0) {
					key[col] = map[u][col];
					parent[col] = u;
				}
			}

		}

		//output the parent

	}

	public static int minKey() {
		int min_index = -1;
		double minCost = Double.MAX_VALUE;
		for (int i = 0; i<V; i++) {
			if (minCost>key[i] && !mstSet[i]) {
				minCost = key[i];
				min_index = i;
			}
		}
		return min_index;
	}

}