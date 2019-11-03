import java.io.*;
import java.util.*;

class Item {
    int w, v;
    public Item (int w, int v){
        this.w = w;
        this.v = v;
    }
}

public class dpe {
    public static void main(String[] args) throws IOException {

        int N = nextInt(), W = nextInt();
        Item[] items = new Item [N+1];
        long[][] dp = new long [2][1005];

        for (int i = 1; i<=N; i++) {
            items[i] = new Item(nextInt(), nextInt());
        }

        for (int n = 1; n<=N; n++) {
            for (int w = 1; w<=W; w++) {
                if (items[n].w<=w) {
                    dp[1][w] = Math.max(dp[0][w], dp[0][w-items[n].w]+items[n].v);

                } else {
                    dp[1][w] = dp[0][w];
                }
            }

            for (int w = 1; w<=W; w++) {
                dp[0][w] = dp[1][w];
            }

        }

        System.out.println(dp[1][W]);


    }

    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(in.readLine().trim());
        }
        return st.nextToken();
    }

    private static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }


}
