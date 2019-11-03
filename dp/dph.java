import java.io.*;

public class dph {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        String [] hw = br.readLine().split(" ");
        int H = Integer.parseInt(hw[0]), W = Integer.parseInt(hw[1]);

        char [][] map = new char [H+1][W+1];
        long [][] ways = new long [H+1][W+1];

        for (int i = 1; i<=H; i++) {
            String ln = br.readLine();
            for (int j = 1; j<=W; j++) {
                map[i][j] = ln.charAt(j-1);
            }
        }

        for (int i = 1; i<=H; i++) {
            if (map[i][1] != '.') {
                break;
            }
            ways[i][1] = 1;
        }

        for (int i = 1; i<=W; i++) {
            if (map[1][i] != '.') {
                break;
            }
            ways[1][i] = 1;

        }

        for (int i = 1; i<=H; i++) {
            for (int j = 1; j<=W; j++) {
                if (i!=1 && j!=1 && map[i][j] == '.') {
                    ways[i][j] = (ways[i-1][j]+ways[i][j-1]) % 1000000007;
                }

            }
        }

        System.out.println(ways[H][W]);



    }


}
