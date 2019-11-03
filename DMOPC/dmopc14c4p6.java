import java.io.*;
import java.util.*;

public class dmopc14c4p6 {
    public static void main(String[] args) throws IOException {

        int N = nextInt();
        ArrayList<Integer> [] tree = new ArrayList [N+1];

        for (int i = 0; i<=N; i++) {
            tree[i] = new ArrayList<>();
        }

        boolean [] vis = new boolean [N+1];
        int [] rank = new int [N+1];

        for (int i = 0; i<N-1; i++) {
            int u = nextInt(), v = nextInt();
            tree[u].add(v);
            tree[v].add(u);
        }

        Queue <Integer> q = new LinkedList<>();
        q.add(1);
        vis[1] = true;
        rank[1] = 1;
        int maxr = -1;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int v:tree[cur]) {
                if (!vis[v]) {
                    rank[v] = rank[cur]+1;
                    maxr = v;
                    vis[v] = true;
                    q.add(v);
                }

            }
        }

        Arrays.fill(rank, 0);
        Arrays.fill(vis, false);

        q.add(maxr);
        vis[maxr] = true;
        rank[maxr] = 1;

        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int v:tree[cur]) {
                if (!vis[v]) {
                    maxr = rank[v] = rank[cur]+1;
                    vis[v] = true;
                    q.add(v);
                }

            }
        }

        System.out.println(maxr);


    }

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }


}
