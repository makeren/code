import java.io.*;
import java.util.*;

public class Kruskal {

    public static class Edge implements Comparable<Edge> {
        int x, y, cost;

        public Edge (int x1, int y1, int c) {
            x = x1;
            y = y1;
            cost = c;
        }

        public int compareTo (Edge o) {
            if (this.cost > o.cost) {
                return 1;
            } else if (this.cost < o.cost) {
                return -1;
            } else {
                return 0;
            }
        }

    }

    public static class Subset {
        int parent, rank;

        public Subset (int p, int r) {
            parent = p;
            rank = r;
        }
    }

    public static Edge [] edges;
    public static Subset [] subsets;
    public static Edge [] MST;
    private static int count = 0;

    public static void main(String[] args) throws IOException {

        int N = readInt();
        edges = new Edge [N];
        subsets = new Subset [N];
        MST = new Edge [N-1];

        for (int i = 0; i<N; i++) {
            int x = readInt(), y = readInt(), w = readInt();
            edges[i] = new Edge(x, y, w);
            subsets[i] = new Subset(i, 0);
        }

        Arrays.sort(edges);

        int count = 0, cur = 0;

        while (count<N-1) {
            int xparent = find(edges[cur].x), yparent = find(edges[cur].y);
            if (xparent!=yparent) {
                union(xparent, yparent);
                MST[count] = edges[cur];
            }
            cur++;
        }

    }

    private static int find (int i) {

        if (subsets[i].parent!=i) {
            subsets[i].parent = find(subsets[i].parent);
        }
        return subsets[i].parent;
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

            count++;

        }
    }


    private static int readInt() throws IOException {

        int c = System.in.read(), ret = 0;
        boolean num = false;

        while (true) {
            if (c>='0' && c<='9') {
                ret = ret*10+c-'0';
                num = true;
                c = System.in.read();

            } else if (num) {
                break;
            }

        }

        return ret;

    }

}
