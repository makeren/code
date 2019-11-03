import java.io.*;
import java.util.*;

public class ccc18s3 {

    // because you're checking backwards, treat conveyors as backwards

    public static class Coor {
        int r, c;
        Coor() {
        }
        Coor(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }

    public static void main(String[] args) throws IOException {

        int N = nextInt(), M = nextInt();

        char [][] map = new char [N+2][M+2];
        for (int i = 1; i<=N; i++) {
            String ln = nextLine();
            for (int j = 1; j<=M; j++) {
                map[i][j] = ln.charAt(j-1);
            }
        }

        boolean [][] vis = new boolean [N+2][M+2];
        int [][] dis = new int [N+2][M+2];

        for (int i = 0; i<=N+1; i++) {
            for (int j = 0; j<=M+1; j++) {
                dis[i][j] = -1;
            }
        }

        Coor start = new Coor();

        //cameras, walls, start, exits
        for (int r = 1; r<=N; r++) {
            for (int c = 1; c<=M; c++) {
                if (map[r][c]=='W') {
                    vis[r][c] = true;

                } else if(map[r][c]=='C') {
                    vis[r][c] = true;

                    //up
                    for (int i = r-1; i>=0; i--) {
                        if (map[i][c]=='W') break;
                        else if (map[i][c]=='.' || map[i][c]=='S') {
                            vis[r][c] = true;
                        }
                    }

                    //down
                    for (int i = r+1; i<=N; i++) {
                        if (map[i][c]=='W') break;
                        else if (map[i][c]=='.' || map[i][c]=='S') {
                            vis[r][c] = true;
                        }
                    }

                    //left
                    for (int i = c-1; i>=0; i--) {
                        if (map[r][i]=='W') break;
                        else if (map[r][i]=='.' || map[r][i]=='S') {
                            vis[r][c] = true;
                        }
                    }

                    //right
                    for (int i = c+1; i<=M; i++) {
                        if (map[r][i]=='W') break;
                        else if (map[r][i]=='.' || map[r][i]=='S') {
                            vis[r][c] = true;
                        }
                    }

                }  else if (map[r][c]=='S') {
                    start = new Coor(r, c);
                    dis[r][c] = 0;

                }
            }
        }

        Queue<Coor> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            Coor cur = q.poll();
            vis[cur.r][cur.c] = true;

            // up
            if (!vis[cur.r+1][cur.c]) {
                if (map[cur.r+1][cur.c]=='.') {
                    dis[cur.r+1][cur.c] = dis[cur.r][cur.c]+1;
                    q.add(new Coor(cur.r+1, cur.c));

                } else if (map[cur.r+1][cur.c]=='D') {
                    dis[cur.r+2][cur.c] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r+2, cur.c));

                } else if (map[cur.r+1][cur.c]=='R') {
                    dis[cur.r+1][cur.c-1] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r+1, cur.c-1));

                } else if (map[cur.r+1][cur.c]=='L') {
                    dis[cur.r+1][cur.c+1] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r+1, cur.c+1));
                }
            }

            // down
            if (!vis[cur.r-1][cur.c]) {
                if (map[cur.r-1][cur.c]=='.') {
                    dis[cur.r-1][cur.c] = dis[cur.r][cur.c]+1;
                    q.add(new Coor(cur.r-1, cur.c));

                } else if (map[cur.r-1][cur.c]=='U') {
                    dis[cur.r-2][cur.c] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r-2, cur.c));

                } else if (map[cur.r-1][cur.c]=='R') {
                    dis[cur.r-1][cur.c-1] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r-1, cur.c-1));

                } else if (map[cur.r-1][cur.c]=='L') {
                    dis[cur.r-1][cur.c+1] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r-1, cur.c+1));
                }
            }

            // left
            if (!vis[cur.r][cur.c-1]) {
                if (map[cur.r][cur.c-1]=='.') {
                    dis[cur.r][cur.c-1] = dis[cur.r][cur.c]+1;
                    q.add(new Coor(cur.r, cur.c-1));

                } else if (map[cur.r][cur.c-1]=='D') {
                    dis[cur.r-1][cur.c-1] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r-1, cur.c-1));

                } else if (map[cur.r][cur.c-1]=='U') {
                    dis[cur.r+1][cur.c-1] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r+1, cur.c-1));

                } else if (map[cur.r][cur.c-1]=='R') {
                    dis[cur.r][cur.c-2] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r, cur.c-2));

                }
            }

            // right
            if (!vis[cur.r][cur.c+1]) {
                if (map[cur.r][cur.c+1]=='.') {
                    dis[cur.r][cur.c+1] = dis[cur.r][cur.c]+1;
                    q.add(new Coor(cur.r, cur.c+1));

                } else if (map[cur.r][cur.c+1]=='D') {
                    dis[cur.r-1][cur.c+1] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r-1, cur.c+1));

                } else if (map[cur.r][cur.c+1]=='U') {
                    dis[cur.r+1][cur.c+1] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r+1, cur.c+1));

                } else if (map[cur.r][cur.c+1]=='L') {
                    dis[cur.r][cur.c+2] = dis[cur.r][cur.c];
                    q.add(new Coor(cur.r, cur.c+2));

                }
            }


        }

        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<=M; j++) {
                if (map[i][j]=='.') {
                    System.out.println(dis[i][j]);
                }
            }
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

    private static String nextLine() throws IOException {
        st = null;
        return in.readLine();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }


}
