import java.util.*;
import java.io.*;

public class dmopc14c1p5 {

    public static class Coor {
        int x, y;

        private Coor (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] rc = br.readLine().split(" ");
        int R = Integer.parseInt(rc[0]), C = Integer.parseInt(rc[1]);

        String [] sstart = br.readLine().split(" ");
        Coor start = new Coor (Integer.parseInt(sstart[0])+1, Integer.parseInt(sstart[1])+1);

        String [] soffice = br.readLine().split(" ");
        Coor office = new Coor (Integer.parseInt(soffice[0])+1, Integer.parseInt(soffice[1])+1);

        char [][] map = new char [R+2][C+2];
        boolean [][] vis = new boolean [R+2][C+2];
        int [][] dis = new int [R+2][C+2];

        for (int i = 1; i<=R; i++) {
            String S = br.readLine();
            for (int j = 1; j<=C; j++) {
                map[i][j] = S.charAt(j-1);
            }
        }

        Queue<Coor> q = new LinkedList<>();
        vis[start.x][start.y] = true;
        q.add(start);


        while (!q.isEmpty()) {
            Coor cur = q.poll();
            int cx = cur.x, cy = cur.y;

            if (!vis[cx+1][cy] && map[cx+1][cy]=='O') {
                vis[cx+1][cy] = true;
                dis[cx+1][cy] = dis[cx][cy]+1;
                q.add(new Coor(cx+1, cy));
            }

            if (!vis[cx-1][cy] && map[cx-1][cy]=='O') {
                vis[cx-1][cy] = true;
                dis[cx-1][cy] = dis[cx][cy]+1;
                q.add(new Coor(cx-1, cy));
            }

            if (!vis[cx][cy+1] && map[cx][cy+1]=='O') {
                vis[cx][cy+1] = true;
                dis[cx][cy+1] = dis[cx][cy]+1;
                q.add(new Coor(cx, cy+1));
            }

            if (!vis[cx][cy-1] && map[cx][cy-1]=='O') {
                vis[cx][cy-1] = true;
                dis[cx][cy-1] = dis[cx][cy]+1;
                q.add(new Coor(cx, cy-1));
            }


        }

        int portal = dis[office.x][office.y];

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i<T; i++) {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]) + 1, y = Integer.parseInt(xy[1]) + 1;

            if (vis[x][y]) {
                portal = Math.min(dis[x][y], portal);
            }
        }

        System.out.println(dis[office.x][office.y]-portal);


    }

}
