import java.io.*;
import java.util.*;

public class ccc01s3 {

    public static class Edge {
        int st, ed;
        public Edge (int n, int m) {
            st = n;
            ed = m;
        }
    }

    public static ArrayList<Edge> roads = new ArrayList<>();
    public static boolean vis [] = new boolean [26];
    public static boolean disconnecting = true;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        while (!s.equals("**")) {
            roads.add(new Edge(s.charAt(0), s.charAt(1)));
            s = br.readLine();
        }

        int count = 0;

        for (int i = 0; i<roads.size(); i++) {
            Edge temp = roads.get(i);
            roads.remove(i);
            vis[0] = true;
            dfs(0);

            if (disconnecting) {
                System.out.println((char)temp.st+""+(char)temp.ed);
                count++;
            }

            roads.add(i, temp);
            Arrays.fill(vis, false);
            disconnecting = true;
        }

        System.out.println("There are "+count+" disconnecting roads.");

    }

    private static void dfs (int cur) {
        if (cur == 'B'-'A') {
            disconnecting = false;
        }

        for (Edge road:roads) {
            if (!vis[(road.ed)-'A'] && (road.st)-'A' == cur) {
                vis[(road.ed)-'A'] = true;
                dfs((road.ed)-'A');

            } else if (!vis[(road.st)-'A'] && (road.ed)-'A' == cur) {
                vis[(road.st)-'A'] = true;
                dfs((road.st)-'A');

            }
        }

    }
}
