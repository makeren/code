import java.io.*;

public class dpa {
    public static void main(String[] args) throws IOException {

        int N = readInt();
        int [] stones = new int [N];
        int [] cost = new int [N];

        for (int i = 0; i<N; i++) {
            stones[i] = readInt();
        }

        cost[1] = Math.abs(stones[1]-stones[0]);

        for (int i = 2; i<N; i++) {
            cost[i] = Math.min(cost[i-1]+Math.abs(stones[i]-stones[i-1]),
                                cost[i-2]+Math.abs(stones[i]-stones[i-2]));
        }

        System.out.println(cost[N-1]);

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
