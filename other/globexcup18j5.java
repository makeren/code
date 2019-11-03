import java.io.*;
import java.util.*;
public class globexcup18j5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String [] in = br.readLine().split(" ");
		int N = Integer.parseInt(in[0]);
		int M = Integer.parseInt(in[1]);
		int Q = Integer.parseInt(in[2]);
		int C = Integer.parseInt(in[3]);
		
		ArrayList<Integer> house [] = new ArrayList [N+1];
		for (int i = 0; i<house.length; i++) house[i] = new ArrayList<Integer>();

		for (int i = 0; i<M; i++) {
			String [] uv = br.readLine().split(" "); 
			int u = Integer.parseInt(uv[0]), v = Integer.parseInt(uv[1]);
			house[u].add(v); house[v].add(u);
		}
		
		int [] dis = new int [N+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		boolean [] vis = new boolean [N+1];

		for (int i = 0; i<Q; i++) {
			String [] ab = br.readLine().split(" "); 
			int a = Integer.parseInt(ab[0]), b = Integer.parseInt(ab[1]);
			Queue <Integer> q = new LinkedList <Integer>();
			vis[C] = true; dis[C] = 0;
			q.add(C);
			while (!q.isEmpty()) {
				int cur = q.poll();
				for (int v:house[cur]) {
					if (!vis[v]) {
						vis[v] = true;
						dis[v] = Math.min(dis[v], dis[cur]+1);
						q.add(v);
					}
				}
			}
			if (!vis[a] || !vis[b]) System.out.println("This is a scam!");
			else System.out.println(dis[a]+dis[b]);
		}

	}

}
