import java.util.*;
public class BFSD {
	
	public static class Node implements Comparable<Node> {
		int v, dis;
		public Node (int v, int dis) {
			this.v = v;
			this.dis = dis;
		}
		
		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.dis-o.dis;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int V = sc.nextInt(), E = sc.nextInt();
		int map[][] = new int [V][V];
		int step[] = new int [V];
		Arrays.fill(step, Integer.MAX_VALUE);
		step[0] = 0;

		for (int i = 0; i<E; i++) {
			int bv = sc.nextInt(), ev = sc.nextInt();
			int dis = sc.nextInt();
			map[bv][ev] = dis; map[ev][bv] = dis;
		}

		PriorityQueue<Node> q = new PriorityQueue<Node>();
		q.add(new Node(0, step[0]));
		// every item stored into queue will be the next neighbor node
		while (!q.isEmpty()) {
			Node cur = q.poll();
			int curV = cur.v;
			for (int i = 0; i<V; i++) {
				if (map[curV][i]!=0 && step[curV]+map[curV][i]<step[i]) {
					step[i] = step[curV]+map[curV][i];
					q.add(new Node(i, step[i]));
				}
			}
		}
		
		for (int i = 0; i<V; i++ ) {
			System.out.println(i+"\t"+step[i]);
		}
		


	}

}
