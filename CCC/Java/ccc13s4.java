import java.io.*;
import java.util.*;
public class ccc13s4 {
	public static boolean vis [];
	public static ArrayList<Integer> students [];
	public static boolean taller = false;
	public static int p, q;
	public static boolean sstart;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = readInt(), M = readInt();
		students = new ArrayList [N+1];
		for (int i = 0; i<students.length; i++) students[i] = new ArrayList<Integer>();
		for (int i = 0; i<M; i++) {
			int x = readInt(), y = readInt();
			students[y].add(x);
		}
		vis = new boolean[N+1];
		boolean visp = false, visq = false;
		p = readInt(); q = readInt();
		
		vis[q] = true; sstart = true;
		dfs(q); if (vis[p]) visp = true;
		Arrays.fill(vis, false);
		vis[p] = true; sstart = false;
		dfs(p); if (vis[q]) visq = true;
		
		if (taller) System.out.println("yes");
		else if (!vis[p] || !vis[q]) System.out.println("unknown");
		else System.out.println("no");
		
	}
	
	public static void dfs (int cur) {
		if (cur==p && sstart) taller = true;
		for (int v:students[cur]) {
			if (!vis[v]) {
				vis[v] = true;
				dfs(v);
			}
		}
	}

	private static int readInt() throws IOException {
		int ret = 0, sign = 1, c = 0;
		boolean dig = false;
		while (c!=-1) {
			c = System.in.read();
			if (!dig && c=='-') sign = -1;
			if (c>='0' && c<='9') {
				dig = true;
				ret = ret * 10 + c - '0';
			} else if (dig) break;
		}
		return sign*ret;
	}

}
