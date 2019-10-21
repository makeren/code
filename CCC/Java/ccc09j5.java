import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
public class ccc09j5 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean [][] p = new boolean [51][51];
		p[1][6] = p[6][1] = true;
		p[2][6] = p[6][2] = true;
		p[3][6] = p[6][3] = true;
		p[3][4] = p[4][3] = true;
		p[3][5] = p[5][3] = true;
		p[3][15] = p[15][3] = true;
		p[4][6] = p[6][4] = true;
		p[4][5] = p[5][4] = true;
		p[5][6] = p[6][5] = true;
		p[6][7] = p[7][6] = true;
		p[7][8] = p[8][7] = true;
		p[8][9] = p[9][8] = true;
		p[9][12] = p[12][9] = true;
		p[9][10] = p[10][9] = true;
		p[10][11] = p[11][10] = true;
		p[11][12] = p[12][11] = true;
		p[12][13] = p[13][12] = true;
		p[13][15] = p[15][13] = true;
		p[13][14] = p[14][13] = true;
		p[16][17] = p[17][16] = true;
		p[16][18] = p[18][16] = true;
		p[17][18] = p[18][17] = true;

		String act = br.readLine();

		while (!act.equals("q")) {
			
			if (act.equals("i")) {
				int x = Integer.parseInt(br.readLine());
				int y = Integer.parseInt(br.readLine());
				p[x][y] = true;
				p[y][x] = true;

			} else if (act.equals("d")) {
				int x = Integer.parseInt(br.readLine());
				int y = Integer.parseInt(br.readLine());
				p[x][y] = false;
				p[y][x] = false;

			} else if (act.equals("n")) {
				int count = 0;
				int x = Integer.parseInt(br.readLine());
				for (int i = 0; i<51; i++) {
					if (p[x][i]==true) {
						count++;
					}
				}
				System.out.println(count);

			} else if (act.equals("f")) {
				int count = 0;
				int x = Integer.parseInt(br.readLine());
				for (int i = 0; i<51; i++) {
					if (p[x][i]==true) {
						for (int j = 0; j<51; j++) {
							if (p[i][j]==true && !p[x][j] && j!=x) {
								count++;
							}
						}
					}
				}
				System.out.println(count);


			} else if (act.equals("s")) {
				int x = Integer.parseInt(br.readLine());
				int y = Integer.parseInt(br.readLine());

				Queue<Integer> Q = new LinkedList<Integer>();
				boolean [] vis = new boolean [51];
				int [] dis = new int [51];

				Q.add(x);
				while (!Q.isEmpty()) {
					int cur = Q.poll();
					for (int ex = 1; ex<51; ex++) {
						if(p[cur][ex] && !vis[ex]) {
							Q.add(ex);
							vis[ex] = true;
							dis[ex] = dis[cur]+1;
						}
					}
				}
				if (dis[y]==0) {
					System.out.println("Not connected");
				} else {
					System.out.println(dis[y]);
				}
			}
			
			act = br.readLine();
		}

	}

}
