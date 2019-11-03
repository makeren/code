import java.util.*;

public class ccc09j5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        boolean [][] friends = new boolean [51][51];
        friends[1][6] = friends[6][1] = true;
        friends[2][6] = friends[6][2] = true;
        friends[3][6] = friends[6][3] = true;
        friends[3][4] = friends[4][3] = true;
        friends[3][5] = friends[5][3] = true;
        friends[3][15] = friends[15][3] = true;
        friends[4][6] = friends[6][4] = true;
        friends[4][5] = friends[5][4] = true;
        friends[5][6] = friends[6][5] = true;
        friends[6][7] = friends[7][6] = true;
        friends[7][8] = friends[8][7] = true;
        friends[8][9] = friends[9][8] = true;
        friends[9][12] = friends[12][9] = true;
        friends[9][10] = friends[10][9] = true;
        friends[10][11] = friends[11][10] = true;
        friends[11][12] = friends[12][11] = true;
        friends[12][13] = friends[13][12] = true;
        friends[13][14] = friends[14][13] = true;
        friends[13][15] = friends[15][13] = true;
        friends[16][17] = friends[17][16] = true;
        friends[16][18] = friends[18][16] = true;
        friends[17][18] = friends[18][17] = true;

        char c = sc.next().charAt(0);
        while (c != 'q') {
            if (c == 'i') {
               int x = sc.nextInt(), y = sc.nextInt();
                friends[x][y] = friends[y][x] = true;

            } else if (c == 'd') {
                int x = sc.nextInt(), y = sc.nextInt();
                friends[x][y] = friends[y][x] = false;

            } else if (c == 'n') {
                int count = 0, x = sc.nextInt();
                for (boolean f:friends[x]) {
                    if (f) count++;
                }
                System.out.println(count);

            } else if (c == 'f') {
                int count = 0, x = sc.nextInt();
                boolean [] ff = new boolean [51];

                for (int i = 1; i<51; i++) {
                    if (friends[x][i]) {
                        for (int j = 1; j<51; j++) {
                            if (friends[i][j] && !friends[x][j] && x!=j) {
                                ff[j] = true;
                            }
                        }
                    }
                }

                for (boolean friend:ff) {
                    if (friend) count++;
                }

                System.out.println(count);

            } else if (c == 's') {
                int x = sc.nextInt(), y = sc.nextInt();

                Queue<Integer> q = new LinkedList<>();
                boolean [] vis = new boolean [51];
                int [] dis = new int [51];
                Arrays.fill(dis, Integer.MAX_VALUE);
                vis[x] = true; dis[x] = 0;
                q.add(x);

                while (!q.isEmpty()) {
                    int cur = q.poll();
                    for (int i = 1; i<51; i++) {
                        if (friends[cur][i] && !vis[i]) {
                            vis[i] = true;
                            dis[i] = Math.min(dis[i], dis[cur]+1);
                            q.add(i);
                            if (i == y) break;
                        }
                    }
                }

                if (dis[y]<Integer.MAX_VALUE) System.out.println(dis[y]);
                else System.out.println("Not connected");

            }

            c = sc.next().charAt(0);
        }


    }

}
