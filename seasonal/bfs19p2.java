import java.util.*;
import java.io.*;

public class bfs19p2 {
    private static class Coor {
        int r, c;
        Coor (int r1, int c1) {
            r = r1;
            c = c1;
        }
    }

    private static class Cost {
        int l, r, d;
        Cost(){}
        Cost (int l1, int r1, int d1) {
            l = l1;
            r = r1;
            d = d1;
        }
    }
    public static void main(String[] args) throws IOException {

        int N = nextInt();

        char[][] grid = new char [N+2][N+2];
        boolean[][] vis = new boolean [N+2][N+2];
        Cost[][] cost = new Cost [N+2][N+2];
        for (int r = 1; r<=N; r++) {
            for (int c = 1; c<=N; c++) {
                cost[r][c] = new Cost();
            }
        }

        for (int r = 1; r<=N; r++) {
            String s = next();
            for (int c = 1; c<=N; c++) {
                grid[r][c] = s.charAt(c-1);
            }
        }

        vis[1][1] = true;
        cost[1][1] = new Cost(0, 0, 0);

        Queue<Coor> q = new LinkedList<>();
        q.add(new Coor(1, 1));

        while (!q.isEmpty()) {
            Coor cur = q.poll();
            int r = cur.r, c = cur.c;

            if (r==N && c==N) break;

            if (!vis[r+1][c] && grid[r+1][c]=='.') { // down
                vis[r+1][c] = true;
                cost[r+1][c].l = cost[r][c].l;
                cost[r+1][c].r = cost[r][c].r;
                cost[r+1][c].d = cost[r][c].d+1;
                q.add(new Coor(r+1, c));
            }

            if (!vis[r][c+1] && grid[r][c+1]=='.') { // right
                vis[r][c+1] = true;
                cost[r][c+1].l = cost[r][c].l;
                cost[r][c+1].d = cost[r][c].d;
                cost[r][c+1].r = cost[r][c].r+1;
                q.add(new Coor(r, c+1));
            }

            if (!vis[r][c-1] && grid[r][c-1]=='.') { // left
                vis[r][c-1] = true;
                cost[r][c-1].r = cost[r][c].r;
                cost[r][c-1].d = cost[r][c].d;
                cost[r][c-1].l = cost[r][c].l+1;
                q.add(new Coor(r, c-1));
            }

        }

        if (!vis[N][N]) {
            System.out.println(-1);

        } else {
            System.out.println((cost[N][N].d*cost[N][N].d + cost[N][N].l*cost[N][N].l + cost[N][N].r*cost[N][N].r));
        }

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

    private static char nextChar() throws IOException {
        return next().charAt(0);
    }

}
