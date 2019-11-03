import java.io.*;

public class dpd {

    public static void main(String[] args) throws IOException {

        int N = readInt(), W = readInt();
        long [][] dp = new long [2][W+1];

        for (int i = 0; i<N; i++) {
            int w = readInt(), v = readInt();

            for (int j = 1; j<=W; j++) {
                if (w<=j) {
                    dp[1][j] = Math.max(dp[0][j-w]+v, dp[0][j]);
                } else {
                    dp[1][j] = dp[0][j];
                }
            }

            for (int k = 0; k<=W; k++) {
                dp[0][k] = dp[1][k];
            }

        }

        System.out.println(dp[1][W]);

    }

    private static int readInt() throws IOException {
        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {
            if (c>='0' && c<='9') {
                num = true;
                ret = ret*10+c-'0';
                c = System.in.read();
            } else if (num) {
                break;
            }
        }

        return ret;

    }

}
