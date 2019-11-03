import java.io.*;

public class anoisyclass {

    private static boolean [][] students;
    private static boolean [] path;
    private static boolean [] vis;
    private static int N;
    private static boolean cycle = false;


    public static void main(String[] args) throws IOException {

        N = readInt();
        int M = readInt();
        students = new boolean [N+1][N+1];
        path = new boolean [N+1];
        vis = new boolean [N+1];

        vis[1] = true;

        for (int i = 0; i<M; i++) {
            students[readInt()][readInt()] = true;
        }

        for (int i = 1; i<=N; i++) {
            path[i] = true;
            dfs(i);
            path[i] = false;
        }

        if (cycle) System.out.println("N");
        else System.out.println("Y");


    }

    private static void dfs (int cur) {

        for (int i = 1; i<=N; i++) {
            if (students[cur][i]) {
                if (!vis[i]) {
                    vis[i] = true;
                    path[i] = true;
                    dfs(i);
                    path[i] = false;

                } else if (path[i]) {
                    cycle = true;
                    return;

                }
            }
        }

    }

    private static int readInt() throws IOException {
        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {
            if (c>='0' && c<='9') {
                num = true;
                ret = ret * 10 + c - '0';
                c = System.in.read();
            } else if (num) break;
        }

        return ret;
    }

}
