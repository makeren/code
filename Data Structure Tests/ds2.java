import java.io.*;
import java.util.ArrayList;

public class ds2 {

    public static class Edge {
        int x, y;

        private Edge (int x1, int y1) {
            x = x1;
            y = y1;

        }

    }

    public static class Subset {
        int parent, rank;
        private Subset (int p, int r) {
            parent = p;
            rank = r;
        }
    }

    private static Subset [] subsets;
    private static ArrayList<Integer> MST = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        int N = readInt(), M = readInt();

        subsets = new Subset [N+1];
        Edge [] edges = new Edge [M+1];

        for (int i = 1; i<=N; i++) {
            subsets[i] = new Subset(i,0);

        }

        for (int i = 1; i<=M; i++) {
            edges[i] = new Edge(readInt(), readInt());

        }

        int count = 0, cur = 1;

        while (count<N-1 && cur<=M) {

            int xparent = find(edges[cur].x), yparent = find(edges[cur].y);

            if (xparent!=yparent) {
                union(xparent, yparent);
                MST.add(cur);
                count++;
            }

            cur++;

        }

        if (MST.size() == N-1) {
            for (int i = 0; i<N-1; i++) {
                System.out.println(MST.get(i));
            }
        } else {
            System.out.println("Disconnected Graph");
        }


    }

    private static int find (int cur) {

        if (subsets[cur].parent!=cur) {
            subsets[cur].parent = find(subsets[cur].parent);
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
                subsets[xroot].rank++;
                subsets[yroot].parent = xroot;

            }
        }

    }

    private static int readInt() throws IOException {
        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {

            if (c>='0' && c<='9') {
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
