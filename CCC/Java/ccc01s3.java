import java.util.*;
public class ccc01s3 {
	public static class Edge {
		int st, ed;
		public Edge (int a, int b) {
			st = a;
			ed = b;
		}
	}
	public static ArrayList<Edge> roads;
	public static boolean noDisconnect;
	public static boolean [] vis;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		roads = new ArrayList<Edge>();
		ArrayList<Integer> A = new ArrayList<Integer>();
		String s = sc.next();
		while (!s.equals("**")) {
			int a = s.charAt(0), b = s.charAt(1);
			if (s.charAt(0)=='A' || s.charAt(1)=='A') A.add(roads.size());
			roads.add(new Edge (a, b));
			s = sc.next();
		}
		vis = new boolean [roads.size()];
		int count = 0;
		for (int i = 0; i<roads.size(); i++) {
			Edge temp = roads.get(i); noDisconnect = false;
			roads.remove(i);
			//System.out.println("road "+(char)temp.st + "" + (char)temp.ed+" has been removed");
			if (i!=A.get(0) || A.size()!=1) dfs(A.get(0));
			
			if (!noDisconnect) {
				count++;
				System.out.println((char)temp.st + "" + (char)temp.ed);
			}
			roads.add(i, temp);
			//System.out.println("road "+(char)temp.st + "" + (char)temp.ed+" has been added back!\n");
			Arrays.fill(vis, false);
		}

		System.out.println("There are "+count+" disconnecting roads.");


	}

	public static void dfs (int cur) {
		//System.out.println("now testing road "+(char)roads.get(cur).st + "" + (char)roads.get(cur).ed);
		if (roads.get(cur).st==66 || roads.get(cur).ed==66) {
			//System.out.println ("this road leads to B!");
			noDisconnect = true;
		} else {
			vis[cur] = true;
			int st = roads.get(cur).st, ed = roads.get(cur).ed;
			for (int i = 0; i<roads.size(); i++) {
				if (!vis[i] && !noDisconnect && (roads.get(i).st==st || roads.get(i).ed==st || roads.get(i).st==ed || roads.get(i).ed==ed)) {
					//System.out.println ("this road leads to "+(char)roads.get(i).st + "" + (char)roads.get(i).ed);
					dfs(i);
				}
			}
		}

	}

}
