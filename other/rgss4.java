import java.io.*;
import java.util.Arrays;

public class rgss4 {
    public static void main(String[] args) throws IOException {

        int N = readInt();
        int [] n = new int [N];
        int [] sum = new int [N];

        for (int i = 0 ;i<N; i++) {
            sum[i] = n[i] = readInt();
        }

        for (int i = 0; i<N; i++) {
            for (int j = i; j<N; j++) {
                if (n[j]>n[i]) {
                    sum[j] = Math.max(sum[j], sum[i]+n[j]);
                }

            }

        }

        Arrays.sort(sum);

        System.out.println(sum[N-1]);


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
