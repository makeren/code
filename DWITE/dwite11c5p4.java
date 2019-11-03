import java.io.*;

public class dwite11c5p4 {

    private static int [][] map = new int [12][12];
    private static int nburnt = 0, level = 2;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int q = 0; q<5; q++) {

            int trees = 0, time = 0, burnt = 0;
            level = 2;

            for (int i = 0; i<12; i++) {
                for (int j = 0; j<12; j++) {
                    map[i][j] = 0;
                }
            }

            for (int i = 1; i<=10; i++) {
                String line = br.readLine();

                for (int j = 1; j<=10; j++) {
                    char cur = line.charAt(j - 1);
                    if (cur == 'T') {
                        trees++;
                        map[i][j] = 1;

                    } else if (cur == 'F') {
                        map[i][j] = 2;
                    }

                }
            }

            do {

                nburnt = 0;

                for (int i = 1; i <= 10; i++) {
                    for (int j = 1; j <= 10; j++) {
                        if (map[i][j] == level) {
                            spread(i, j);

                        }
                    }
                }

                burnt += nburnt;
                time++;
                level++;

//                System.out.println("level: "+level+" time: "+time+" burnt: "+burnt+" nburnt: "+nburnt);
//                for (int i = 0; i<12; i++) {
//                    for (int j = 0; j<12; j++) {
//                        System.out.print(+map[i][j]);
//                    }
//                    System.out.println();
//                }


            } while (nburnt>0);

            if (burnt == trees) {
                System.out.println(time-1);
            } else {
                System.out.println(-1);
            }

            br.readLine();

        }

    }

    private static void spread (int x, int y) {
        if (map[x+1][y] == 1) {
            map[x+1][y] = level+1;
            nburnt++;
        }

        if (map[x-1][y] == 1) {
            map[x-1][y] = level+1;
            nburnt++;
        }

        if (map[x][y+1] == 1) {
            map[x][y+1] = level+1;
            nburnt++;

        }

        if (map[x][y-1] == 1) {
            map[x][y-1] = level+1;
            nburnt++;

        }

    }


}
