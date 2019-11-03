import java.io.*;
import java.util.*;

public class dmopc13c1p4 {

    public static class Coor {
        int x, y;

        private Coor (){
        }

        private Coor (int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int k = 0; k<t; k++) {
            String [] in = br.readLine().split(" ");
            int l = Integer.parseInt(in[0]), w = Integer.parseInt(in[1]);

            char [][] map = new char [w+2][l+2];
            int [][] dis = new int [w+2][l+2];
            boolean [][] vis = new boolean [w+2][l+2];

            for (int i = 1; i<=w; i++) {
                String s = br.readLine();
                for (int j = 1; j<=l; j++) {
                    map[i][j] = s.charAt(j-1);
                }
            }

            Coor st = new Coor(), wc = new Coor(-1, -1);

            // finding start
            for (int i = 1; i<=w; i++) {
                for (int j = 1; j<=l; j++) {
                    if (map[i][j]=='C') {
                        vis[i][j] = true;
                        dis[i][j] = 0;
                        st = new Coor(i, j);
                        //   System.out.println("st at "+i+" "+j);
                        break;
                    }
                }
            }

            Queue<Coor> q = new LinkedList<>();
            q.add(st);

            while(!q.isEmpty()) {
                Coor cur = q.poll();
                // System.out.println("cur x: "+cur.x+"\tcur y: "+cur.y+"\tdis from C: "+dis[cur.x][cur.y]);

                if (map[cur.x][cur.y] == 'W') {
                    //  System.out.println("peepee time");
                    wc = new Coor(cur.x, cur.y);
                    break;
                }

                if (dis[cur.x][cur.y] < 59) {

                    if ((map[cur.x+1][cur.y] == 'O' || map[cur.x+1][cur.y] == 'W') && !vis[cur.x+1][cur.y]) {
                        vis[cur.x+1][cur.y] = true;
                        dis[cur.x+1][cur.y] = dis[cur.x][cur.y]+1;
                        q.add(new Coor(cur.x+1, cur.y));
                    }

                    if ((map[cur.x-1][cur.y] == 'O' || map[cur.x-1][cur.y] == 'W') && !vis[cur.x-1][cur.y]) {
                        vis[cur.x-1][cur.y] = true;
                        dis[cur.x-1][cur.y] = dis[cur.x][cur.y]+1;
                        q.add(new Coor(cur.x-1, cur.y));
                    }

                    if ((map[cur.x][cur.y+1] == 'O'  || map[cur.x][cur.y+1] == 'W') && !vis[cur.x][cur.y+1]) {
                        vis[cur.x][cur.y+1] = true;
                        dis[cur.x][cur.y+1] = dis[cur.x][cur.y]+1;
                        q.add(new Coor(cur.x, cur.y+1));
                    }

                    if ((map[cur.x][cur.y-1] == 'O' || map[cur.x][cur.y-1] == 'W') && !vis[cur.x][cur.y-1]) {
                        vis[cur.x][cur.y-1] = true;
                        dis[cur.x][cur.y-1] = dis[cur.x][cur.y]+1;
                        q.add(new Coor(cur.x, cur.y-1));
                    }

                }


            }

            if (wc.x!=-1) {
                System.out.println(dis[wc.x][wc.y]);
            } else {
                System.out.println("#notworth");
            }


        }




    }
}
