import java.io.*;
import java.util.*;

public class dmopc16c4p2 {
    // systest

    public static class Batch {
        int st, ed, p;

        private Batch (int s, int e, int p) {
            st = s;
            ed = e;
            this.p = p;
        }

    }

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int B = readInt(), total = 0;

        Batch [] batch = new Batch [B];

        for (int i = 0; i<B; i++) {
            int st = readInt(), ed = readInt(), p = readInt();
            batch[i] = new Batch (st, ed, p);
            total+=p;
        }

        int F = readInt();
        int [] failed = new int [F];

        for (int i = 0; i<F; i++) {
            failed[i] = readInt();
        }

        Arrays.sort(failed);

        for (Batch b:batch) {
            int afterst = upsearch(b.st, failed);

            if (afterst<F && b.st<=failed[afterst] && failed[afterst]<=b.ed) {
                total-=b.p;
            }

        }

        System.out.println(total);


    }

    private static int upsearch (int key, int [] dis) {

        int l = 0, r = dis.length-1;

        while (l<=r) {
            int mid = l+(r-l)/2;

            if (dis[mid]<key) {
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

}
