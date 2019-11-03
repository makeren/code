import java.io.*;
import java.util.*;

public class gfssoc1j5 {

    public static void main(String[] args) throws IOException {
        int N = readInt(), M = readInt(), T = readInt();

        boolean [][] map = new boolean [N+1][N+1];
        boolean [] vis = new boolean [N+1];
        int [][] dis = new int [N+1][N+1];

        for (int i = 0; i<M; i++) {
            map[readInt()][readInt()] = true;
        }

        Queue<Integer> q = new LinkedList<>();

        for (int v = 1; v<=N; v++) {
            q.add(v);

            while (!q.isEmpty()) {
                int cur = q.poll();

                for (int i = 1; i <= N; i++) {
                    if (!vis[i] && map[cur][i]) {
                        vis[i] = true;
                        dis[v][i] = dis[v][cur] + 1;
                        q.add(i);
                    }
                }
            }

            Arrays.fill(vis, false);

        }

        int Q = readInt();

        for (int k = 0; k<Q; k++) {
            int a = readInt(), b = readInt();
            if (dis[a][b]>0) {
                System.out.println((dis[a][b])*T);
            } else {
                System.out.println("Not enough hallways!");
            }


        }


    }

    private static int readInt() throws IOException {
        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {
            if (c>='0' && c<='9') {
                num = true;
                ret = ret*10 + c - '0';
                c = System.in.read();

            } else if (num) {
                break;
            }
        }

        return ret;
    }

}
