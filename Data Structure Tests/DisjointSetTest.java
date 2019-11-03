import java.util.*;
import java.io.*;
public class DisjointSetTest {

	public static int parent [];
	public static class Edge {
		int bv, ev;
		public Edge (int bv, int ev) {
			this.bv = bv;
			this.ev = ev;
		}
	}
	
	public static int find (int v) {
		if (parent[v]==-1) return v;
		else return(find(parent[v]));
	}

	public static void union (int pb, int pe) {
		parent[pb] = pe;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int V = readInt(), E = readInt();
		Edge edge [] = new Edge [E];
		for (int i = 0; i<E; i++) edge[i] = new Edge(readInt()-1, readInt()-1);
		parent = new int [V];
		Arrays.fill(parent, -1);

		LinkedList<Integer> queue = new LinkedList<Integer>();
		int count = 0;
		// read edge one by one from edge array
		for (int i = 0; i<E; i++) {
			int pb = find(edge[i].bv), pe = find(edge[i].ev);
			if (pb!=pe) {
				union(pb, pe);
				queue.add(i+1);
				count++;
				if (count==V-1) break;
			}
		}

		if (count==V-1) {
			while (!queue.isEmpty()) {
				System.out.println(queue.pop());
			}
		} else System.out.println("Disconnected Graph");

	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

}
