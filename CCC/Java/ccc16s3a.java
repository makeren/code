import java.util.*;
import java.io.*;
public class ccc16s3a {
	public static boolean [] pho;
	public static ArrayList <Integer> adj [], adj2 [];
	static int len, far, st, edge = 0;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		pho = new boolean [N];
		adj = new ArrayList [N];
		adj2 = new ArrayList [N];
		for (int i = 0; i<M; i++) {
			st = sc.nextInt();
			pho[st] = true;
		}

		for (int i = 0; i<N; i++) {
			adj[i] = new ArrayList <Integer>();
			adj2[i] = new ArrayList <Integer>();
		}

		for (int i = 0; i<N-1; i++) {
			int u = sc.nextInt(), v = sc.nextInt();
			adj[u].add(v);
			adj[v].add(u);
		}
		dfs1(st, -1); 
		dfs2(st, -1, 0);
		len = 0;
		dfs2(st, -1, 0);
		System.out.println(2*edge-len);



	}
	public static boolean dfs1 (int u, int pa) {
		boolean flag = pho[u];
		for (int v:adj[u]) {
			if (v!=pa) {
				flag |= dfs1(v, u);
			}
			if (flag && pa!=-1) {
				adj2[u].add(pa);
				adj2[pa].add(u);
			}
		}
		return flag;
	}
	
	public static void dfs2 (int u, int pa, int d) {
		if (d>len) {
			len = d;
			st = u;
		}
		for (int v:adj2[u]) {
			if (v!=pa) dfs2(v, u, d+1);
		}
	}

}
