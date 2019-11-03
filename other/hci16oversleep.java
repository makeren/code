import java.io.*;
import java.util.*;

public class hci16oversleep {

    public static class Coor {
        int x, y;

        private Coor () {
        }

        private Coor (int x, int y) {
            this.x = x;
            this.y = y;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

        char [][] map = new char [n+2][m+2];
        int [][] dis = new int [n+2][m+2];
        boolean [][] vis = new boolean [n+2][m+2];

        for (int i = 1; i<=n; i++) {
            String S = br.readLine();

            for (int j = 1; j<=m; j++) {
                map[i][j] = S.charAt(j-1);
            }
        }

        Coor s = new Coor(), e = new Coor();

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=m; j++) {
                if (map[i][j] == 's') {
                    s = new Coor(i, j);
                    vis[i][j] = true;
                    break;
                }
            }
        }

        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=m; j++) {
                if (map[i][j] == 'e') {
                    e = new Coor(i, j);
                    break;
                }
            }
        }

        Queue<Coor> q = new LinkedList<>();
        q.add(s);

        while (!q.isEmpty()) {
            Coor cur = q.poll();

            if (cur == e) {
                break;
            }

            int x = cur.x, y = cur.y;

            if (!vis[x+1][y] && (map[x+1][y] == '.' || map[x+1][y] == 'e')) {
                vis[x+1][y] = true;
                dis[x+1][y] = dis[x][y]+1;
                q.add(new Coor(x+1, y));
            }

            if (!vis[x-1][y] && (map[x-1][y] == '.' || map[x-1][y] == 'e')) {
                vis[x-1][y] = true;
                dis[x-1][y] = dis[x][y]+1;
                q.add(new Coor(x-1, y));

            }

            if (!vis[x][y+1] && (map[x][y+1] == '.' || map[x][y+1] == 'e')) {
                vis[x][y+1] = true;
                dis[x][y+1] = dis[x][y]+1;
                q.add(new Coor(x, y+1));

            }

            if (!vis[x][y-1] && (map[x][y-1] == '.' || map[x][y-1] == 'e')) {
                vis[x][y-1] = true;
                dis[x][y-1] = dis[x][y]+1;
                q.add(new Coor(x, y-1));
            }

        }

        if (dis[e.x][e.y]!=0) {
            System.out.println(dis[e.x][e.y]-1);
        } else {
            System.out.println(-1);
        }


    }
}
