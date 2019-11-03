import java.io.*;

public class dmpg17s2 {

    public static class Subset {
        int parent, rank;
        private Subset (int p, int r) {
            parent = p;
            rank = r;
        }
    }

    private static Subset [] subsets;

    public static void main(String[] args) throws IOException {

        int N = readInt(), Q = readInt();
        subsets = new Subset [N+1];

        for (int i = 1; i<=N; i++) {
            subsets[i] = new Subset(i, 0);
        }

        for (int i = 0; i<Q; i++) {
           int q = readInt(), x = readInt(), y = readInt();
           int xroot = find(x), yroot = find(y);

            if (q == 0) {
                union(xroot, yroot);

            } else {
                if (subsets[x].parent == subsets[y].parent) {
                    System.out.println("Y");

                } else {
                    System.out.println("N");
                }

            }

        }


    }

    private static int find (int cur) {

        if (subsets[cur].parent!=cur) {
            subsets[cur].parent = find (subsets[cur].parent);
        }

        return subsets[cur].parent;

    }

    private static void union (int x, int y) {
        int xroot = find(x), yroot = find(y);
        if (xroot!=yroot) {
            if (subsets[xroot].rank>subsets[yroot].rank) {
                subsets[yroot].parent = xroot;

            } else if (subsets[yroot].rank>subsets[xroot].rank) {
                subsets[xroot].parent = yroot;

            } else {
                subsets[yroot].parent = xroot;
                subsets[xroot].rank++;

            }
        }

    }

    private static int readInt() throws IOException {

        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {
            if (c == 'A') {
                ret = 0;
                num = true;
                c = System.in.read();

            } else if (c == 'Q') {
                ret = -1;
                num = true;
                c = System.in.read();

            } else if (c>='0' && c<='9') {
                ret = ret*10 + c - '0';
                num = true;
                c = System.in.read();

            } else if (num) {
                break;
            }
        }

        return ret;

    }

}
