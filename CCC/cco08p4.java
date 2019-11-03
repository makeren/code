import java.io.*;
import java.util.*;

public class cco08p4 {

    private static String [] city;
    private static int [][] vis;
    private static int count = 0;
    private static int cycle = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        city = new String [n];
        vis = new int [n][m];

        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                vis[i][j] = -1;
            }
        }

        for (int i = 0; i<n; i++) {
            city[i] = br.readLine();
        }

        for (int i = 0; i<n; i++) {
            for (int j = 0; j<m; j++) {
                if (vis[i][j] == -1) {
                    travel(i, j);

                }
            }
        }

        System.out.println(count);

    }

    private static void travel (int x, int y) {

        if (vis[x][y]==cycle) {
            cycle++;
            count++;
            return;
        } else if (vis[x][y]!=-1) {
            cycle++;
            return;

        }

        vis[x][y] = cycle;

        if (city[x].charAt(y)=='N') {
            travel(x-1, y);

        } else if (city[x].charAt(y)=='S') {
            travel(x+1, y);

        } else if (city[x].charAt(y)=='E') {
            travel(x, y+1);

        } else {
            travel(x, y-1);

        }
    }

}
