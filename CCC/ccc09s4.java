import java.io.*;
import java.util.*;

public class ccc09s4 {

    private static int N;
    private static boolean [] vis;
    private static int [] dis;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());

        int [][] map = new int [5001][5001];
        dis = new int [5001];
        vis = new boolean [5001];

        Arrays.fill(dis, 1<<30);

        for (int i = 0; i<=N; i++) {
            for (int j = 0; j<=N; j++) {
                map[i][j] = 1<<30;
            }
        }

        String [] ln;

        for (int i = 0; i<T; i++) {
            ln = br.readLine().split(" ");
            int x = Integer.parseInt(ln[0]), y = Integer.parseInt(ln[1]), c = Integer.parseInt(ln[2]);

            map[x][y] = map[y][x] = Math.min(map[x][y], c);

        }

        int K = Integer.parseInt(br.readLine());

        int [][] cities = new int [K][2];

        for (int i = 0; i<K; i++) {
            ln = br.readLine().split(" ");
            cities[i][0] = Integer.parseInt(ln[0]); //city
            cities[i][1] = Integer.parseInt(ln[1]); //cost
        }

        int D = Integer.parseInt(br.readLine());
        dis[D] = 0;

        for (int i = 1; i<=N; i++) {
            int cur = min();
            vis[cur] = true;

            for (int j = 1; j<=N; j++) {
                if (!vis[j] && map[cur][j]!=1<<30)
                dis[j] = Math.min(dis[j], dis[cur] + map[cur][j]);
            }
        }

        int minCost = 1<<30;

        for (int i = 0; i<K; i++) {
            minCost = Math.min(minCost, dis[cities[i][0]] + cities[i][1]);
        }

        System.out.println(minCost);

    }

    private static int min () {
        int min = 1<<30, minIndex = -1;

        for (int i = 1; i<=N; i++) {
            if (!vis[i] && dis[i]<min) {
                min = dis[i];
                minIndex = i;
            }
        }

        return minIndex;
    }


}
