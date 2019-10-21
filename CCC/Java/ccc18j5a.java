import java.io.*;
public class ccc18j5a {
	
	public static String [][] scon;
	public static int [][] con;
	public static int [] range;
	public static int dis = 0;
	public static int N = 0;
	public static int min = 0;
	public static boolean [][] done;
	public static boolean [] page;

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		min = N;
		page = new boolean [N+1];
		scon = new String [N+1][N];
		range = new int [N+1];
		con = new int [N+1][N];
		boolean all = true;
		done = new boolean [N+1][N+1];

		page[0] = page[1] = true;

		for (int i = 1; i<=N; i++) {
			String S = br.readLine();
			scon[i] = S.split(" ");

			if (!scon[i][0].equals("0")) {
				range[i] = Integer.parseInt(scon[i][0]);
				for (int j = 1; j<=range[i]; j++) {
					con[i][j-1] = Integer.parseInt(scon[i][j]);
					if (i!=con[i][j-1]) {
						page [con[i][j-1]] = true;
					}

				}
			}
		}

		for (int i = 2; i<=N; i++) {
			if (!page[i]) {
				all = false;
				break;
			}
		}

		search(1);

		if (all==true) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		System.out.println(min);
	}

	public static void search (int start) {
		if (range[start]!=0) {
			for (int i = 0; i<range[start]; i++) {
				if (!done[start][con[start][i]]) {
					dis++;
					done[start][con[start][i]] = true;
					search(con[start][i]);
					done[start][con[start][i]] = false;
					dis--;
				}
			}
		} else {
			dis++;
			if (dis<min) {
				min = dis;
			}
			dis--;
		}
	}

}