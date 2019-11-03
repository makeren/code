import java.io.*;
import java.util.*;

public class tss17b {

    private static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int N = readInt(), Q = readInt();

        double [] dis = new double [N];

        for (int i = 0; i<N; i++) {
            double x = readDouble(), y = readDouble();
            dis[i] = Math.sqrt(x*x+y*y);

        }

        Arrays.sort(dis);

        for (int q = 0; q<Q; q++) {
            System.out.println(search(readInt(), dis));
        }



    }

    private static int search (int key, double [] dis) {

        int l = 0, r = dis.length-1;

        while (l<=r) {
            int mid = l+(r-l)/2;

            if (dis[mid]<=key) {
                l = mid+1;

            } else {
                r = mid-1;
            }
        }

        return l;

    }

    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }


}
