import java.util.*;
public class ccc18j5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		ArrayList<Integer> page [] = new ArrayList [N+1];
		for (int i = 0; i<page.length; i++) page[i] = new ArrayList<Integer>();

		boolean [] vis = new boolean [N+1]; vis[0] = true; vis[1] = true;
		int [] dis = new int [N+1];
		Arrays.fill(dis, Integer.MAX_VALUE); dis[1] = 1;


		for (int i = 1; i<=N; i++) {
			int M = sc.nextInt();
			for (int j = 0; j<M; j++) page[i].add(sc.nextInt());
		}

		Queue<Integer> Q = new LinkedList<Integer>();
		
		Q.add(1);
		while (!Q.isEmpty()) {
			int cur = Q.poll();
			for (int i = 0; i<page[cur].size(); i++) {
				int next = page[cur].get(i);
				if(!vis[next]) {
					Q.add(next);
					dis[next] = dis[cur]+1;
					vis[next] = true;
				}
			}
		}

		boolean all = true;
		int min = Integer.MAX_VALUE;
		for (int i = 2; i<=N; i++) {
			if(!vis[i]) all = false;
			if(page[i].isEmpty() && dis[i]<min) min = dis[i];
		}

		if(all) System.out.println("Y");
		else System.out.println("N");
		System.out.println(min);
	}

}
