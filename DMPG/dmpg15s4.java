import java.util.*;
public class dmpg15s4 {

	public static class Beacon {
		int x; int y; int r;
		public Beacon (int x1, int y1, int r1) {
			x = x1; y = y1; r = r1;
		}
	}
	public static Beacon list [];
	public static boolean vis [];
	public static int end;
	public static boolean isConnected;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int B = sc.nextInt(), Q = sc.nextInt();
		list = new Beacon [B+1];
		vis = new boolean [B+1];

		for (int i = 1; i<=B; i++) {
			int x = sc.nextInt(),y = sc.nextInt(), r = sc.nextInt();  
			list[i] = new Beacon (x, y, r);
		}

		for (int i = 0; i<Q; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			end = b; isConnected = false; Arrays.fill(vis, false);
			dfs(a);
			if (isConnected) System.out.println("YES");
			else System.out.println("NO");
		}

	}

	public static void dfs (int cur) {
		vis[cur] = true;
		if (cur==end) isConnected = true;
		else {
			int x = list[cur].x, y = list[cur].y, r = list[cur].r;
			for (int i = 1; i<list.length; i++) {
				int dis = (int) (Math.pow((list[i].x-x), 2)+Math.pow((list[i].y-y), 2));
				if (dis<=Math.pow(r, 2) && !vis[i]) {
					dfs(i);
				}
			}
		}
	}


}
