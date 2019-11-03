import java.io.*;
import java.util.*;

public class dpk {
    public static void main(String[] args) throws IOException {

        int N = readInt(), K = readInt(), winner = -1;
        int[] A = new int [N+1];
        int[][] dp = new int [K+1][N+1];

        for (int i = 1; i<=N; i++) {
            A[i] = readInt();
        }

        for (int i = 0; i<=N; i++) {
            dp[0][N] = K;
        }

        for (int k = 1; k<=K; k++) {
            for (int n = 1; n<=N; n++) {
                if (dp[k-1][n]>=A[n]) { // wrong, can't just look at dp[k-1][n], have to look at all possibilities and determine from which taking a[i] stones will let you win
                    dp[k][n] = dp[k - 1][n] - A[n];

                } else {
                    dp[k][n] = dp[k - 1][n];
                }
                if (dp[k][n]==0) {
                    winner = k%2;
                    break;
                }
            }
        }

        if (winner==1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
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

    private static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static String readLine() throws IOException {
        st = null;
        return in.readLine();
    }

    private static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    private static char readChar() throws IOException {
        return next().charAt(0);
    }

}
