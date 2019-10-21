import java.util.*;
public class ccc18s3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		// points (.) seen by camera: mark visited ("wrong") until the first wall
		// if start point not seen by camera, dis = 0

		// input into 2d char array
		// store camera coordinates
		// preprocess camera directions
		// if start point not monitored by camera, start bfs, push into queue
		// (but do not mark visited)
		// if you get to the same cell and cannot get a smaller distance, it's bad


		int N = sc.nextInt(), M = sc.nextInt();
		int d[][] = {{0, 1}, {0, -1}, {-1, 0}, {1, 0}}; //R, L, U, D
		char adj [][] = new char [N+2][M+2];
		boolean vis [][] = new boolean [N+2][M+2];
		int dis [][] = new int [N+2][M+2];
		ArrayList <Coor> cam = new ArrayList <Coor>();
		Coor st;

		for (int i = 1; i<=N; i++) {
			String S =  sc.next();
			for (int j = 1; j<=M; j++) {
				adj[i][j] = S.charAt(j-1);
				if (adj[i][j]=='C') {
					cam.add(new Coor(i, j));
				} else if (adj[i][j]=='S') {
					st = new Coor(i, j);
				}
			}
			for (Coor each: cam) {
				int r = each.r;
				int c = each.c;
				vis[r][c] = true;
				for (int k = 0; k<4; k++) {
					while (true) {
						int nr = r+d[k][0], nc = c+d[k][1];
						if (adj[nr][nc]=='W') {
							break;
						} else if (adj[nr][nc]=='.' || adj[nr][nc]=='S') {
							vis[nr][nc] = true;
							if (adj[nr][nc]=='.') {
								dis[nr][nc] = -1;
							}
						}
						r = nr; c = nc;
					}
				}
			}
		}
		//if the start is not visited
	}
	static class Coor {
		int r, c;
		Coor (int r0, int c0) {
			r = r0;
			c = c0;
		}
	}

}
