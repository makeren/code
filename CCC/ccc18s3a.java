import java.util.*;

public class ccc18s3a {

	public static class Coor {
		int r, c;
		Coor() {
		}
		Coor(int r, int c) {
			this.r = r;
			this.c = c;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		char map[][] = new char [N][M];
		for (int i = 0; i<N; i++) {
			map[i] = sc.next().toCharArray(); 
		}

		boolean vis [][] = new boolean [N][M];
		int dis [][] = new int [N][M];
		LinkedList <Coor> list = new LinkedList<Coor>();
		Coor start = new Coor();
		Arrays.fill(dis, Integer.MAX_VALUE);
		dis[start.c][start.r] = 0;

		//cameras, walls, start, exits
		for (int r = 0; r<N; r++) {
			for (int c = 0; c<M; c++) {
				if(map[r][c]=='W') {
					dis[r][c] = -1;
					vis[r][c] = true;
				} else if(map[r][c]=='C') {
					dis[r][c] = -1;
					vis[r][c] = true;
					//up
					for (int i = r-1; i>=0; i--) {
						if (map[i][c]=='W') break;
						else if (map[i][c]=='.' || map[i][c]=='S') dis[i][c] = -1; vis[r][c] = true;
					}
					//down
					for (int i = r+1; i<N; i++) {
						if (map[i][c]=='W') break;
						else if (map[i][c]=='.' || map[i][c]=='S') dis[i][c] = -1; vis[r][c] = true;
					}
					//left
					for (int i = c-1; i>=0; i--) {
						if (map[r][i]=='W') break;
						else if (map[r][i]=='.' || map[r][i]=='S') dis[r][i] = -1; vis[r][c] = true;
					}
					//right
					for (int i = c+1; i<M; i++) {
						if (map[r][i]=='W') break;
						else if (map[r][i]=='.' || map[r][i]=='S') dis[r][i] = -1; vis[r][c] = true;
					}
				} else if (map[r][c]=='.') list.add(new Coor(r, c));
				else if (map[r][c]=='S') list.add(new Coor(r, c)); start = new Coor(r, c);
			}
		}

		Queue<Coor> q = new LinkedList<Coor>();
		q.add(start);

		while (!q.isEmpty()) {
			Coor cur = q.poll();
			if (!vis[cur.r+1][cur.c] && dis[cur.r+1][cur.c]!=-1) {
				if (map[cur.r+1][cur.c]=='.') {
					if (dis[cur.r][cur.c]+1<dis[cur.r+1][cur.c]) dis[cur.r+1][cur.c] = dis[cur.r][cur.c]+1; //new distance
					q.add(new Coor(cur.r+1, cur.c));
				}
			}
			//regular bfs, except conveyers don't have a dis value

		}




	}

}
