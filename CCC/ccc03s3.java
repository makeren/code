import java.util.*;
public class ccc03s3 {
	static int M, R, C, sz;
	static char g[][];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		M = sc.nextInt();
		R = sc.nextInt();
		C = sc.nextInt();
		g = new char[R][C];
		ArrayList<Integer> room = new ArrayList<Integer>();
		for (int i = 0; i<R; i++) {
			g[i] = sc.nextLine().toCharArray();
		}
		for (int r = 0; r<R; r++) {
			for (int c = 0; c<C; c++) {
				if (g[r][c]=='.') {
					sz = 0; 
					dfs(r, c);
					room.add(sz);
				}
			}
		}
		Collections.sort(room);
		for (int i = room.size()-1; i>=0; i--) {
			if (M>=room.get(i)) {
				M-=room.get(i);
				// cnt++;
			} else {
				break;
			}
		}
	//	System.out.println(cnt + " rooms, " + M + " square meter(s) left over");
	}
	static void dfs(int r, int c) {
		g[r][c] = 'I';
		sz++;
		if (r-1>=0 && g[r-1][c]=='.') dfs(r-1, c);
		if (r+1<R && g[r+1][c]=='.') dfs(r-1, c);
		if (c-1>=0 && g[r-1][c]=='.') dfs(r-1, c);
		if (c+1<C && g[r-1][c]=='.') dfs(r-1, c);
		
	}

}
