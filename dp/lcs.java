import java.io.*;

public class lcs {
    public static void main(String[] args) throws IOException {

        int N = readInt(), M = readInt();
        int [] n = new int [N+1];
        int [] m = new int [M+1];
        int [][] dp = new int [N+1][M+1];

        for (int i = 1; i<=N; i++) {
            n[i] = readInt();
        }

        for (int i = 1; i<=M; i++) {
            m[i] = readInt();
        }

        for (int i = 1; i<=N; i++) {
            for (int j = 1; j<=M; j++) {
                if (n[i] == m[j]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        System.out.println(dp[N][M]);


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
