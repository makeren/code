import java.io.*;
import java.util.*;

public class ccc01s3_ds {

    public static class Edge {
        char x, y;

        private Edge (char x1, char y1) {
            x = x1;
            y = y1;
        }
    }

    public static class Subset {
        char parent;
        int rank;

        private Subset (char p, int r) {
            parent = p;
            rank = r;

        }
    }

    private static Subset [] subset = new Subset [26];

    public static void main(String[] args) throws IOException {

        ArrayList<Edge> roads = new ArrayList<>();

        char x = readChar(), y = readChar();
        readChar();

        for (int i = 0; i<26; i++) {
            subset[i] = new Subset((char)(i+'A'), 0);
        }

        while (x!='*') {
            roads.add(new Edge(x, y));
            x = readChar();
            y = readChar();
            readChar();

        }

        int count = 0;

        for (int i = 0; i<roads.size(); i++) {
            Edge temp = roads.get(i);

            for (Edge cur:roads) {
                if (cur!=temp) {
                    union(find(cur.x), find(cur.y));
                }
            }

            if (find('A')!=find('B')) {
                count++;
                System.out.println(temp.x+""+temp.y);
            }

            for (int k = 0; k<26; k++) {
                subset[k].parent = (char)(k+'A');
                subset[k].rank = 0;
            }

        }

        System.out.println("There are "+count+" disconnecting roads.");



    }

    private static char find (char i) {
        if (subset[i-'A'].parent!=i) {
            subset[i-'A'].parent = find(subset[i-'A'].parent);
        }

        return subset[i-'A'].parent;

    }

    private static void union (char x, char y) {
        char xroot = find(x), yroot = find(y);
        int xin = xroot-'A', yin = yroot-'A';

        if (subset[xin].rank>subset[yin].rank) {
            subset[yin].parent = xroot;

        } else if (subset[yin].rank>subset[xin].rank) {
            subset[xin].parent = yroot;

        } else {
            subset[xin].rank++;
            subset[yin].parent = xroot;

        }

    }


    private static char readChar () throws IOException {
        return (char) System.in.read();
    }

}
