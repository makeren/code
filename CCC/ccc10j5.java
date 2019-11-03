import java.util.*;
import java.io.*;
public class ccc10j5 {

	public static class Coor {
		int x, y;
		public Coor (int x1, int y1) {
			x = x1;
			y = y1;
		}
	}

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		Coor st = new Coor(readInt(), readInt());
		Coor ed = new Coor(readInt(), readInt());
		Coor [] move = {new Coor (1, 2), new Coor (2, 1), new Coor (2, -1), new Coor (1, -2),
				new Coor(-1, -2), new Coor (-2, -1), new Coor (-2, 1), new Coor (-1, 2)};
		boolean vis [][] = new boolean [9][9];
		int dis [][] = new int [9][9];
		for (int i = 1; i<=8; i++) for (int j = 1; j<=8; j++) dis[i][j] = Integer.MAX_VALUE;
		dis[st.x][st.y] = 0;
		vis[st.x][st.y] = true;
		Queue<Coor> q = new LinkedList<>();
		q.add(st);
		
		while(!q.isEmpty()) {
			Coor cur = q.poll();
			for (int i = 0; i<move.length; i++) {
				Coor next = new Coor(cur.x+move[i].x, cur.y+move[i].y);
				if (next.x>=1 && next.x<=8 && next.y>=1 && next.y<=8) {
					if (!vis[next.x][next.y]) {
						vis[next.x][next.y] = true;
						dis[next.x][next.y] = Math.min(dis[next.x][next.y], dis[cur.x][cur.y]+1);
						q.add(next);
					}
				}
			}
		}
		System.out.println(dis[ed.x][ed.y]);
	}

	public static int readInt() throws IOException {
		int ret = 0;
		boolean num = false;

		for (int c = 0; (c = System.in.read())!=-1;) {
			if (c>='0' && c<='9') {
				num = true;
				ret = ret * 10 + c - '0';
			} else if (num) break;
		}

		return ret;
	}

}
