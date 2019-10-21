import java.util.*;
public class ccc00s4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int d = sc.nextInt();
		int dis [] = new int [5281];

		Arrays.fill(dis, 0x3f3f3f3f);
		dis[0] = 0;

		int n = sc.nextInt();
		int clubs [] = new int [n];
		for (int i = 0; i<n; i++) clubs[i] = sc.nextInt();

		for (int i = 0; i<=d; i++) {
			for (int j = 0; j<n; j++) {
				int old = i-clubs[j];
				if (old<0) continue;
				dis[i] = Math.min(dis[i], dis[old]+1);
			}
		}
		
		if (dis[d]!=0x3f3f3f3f) System.out.println("Roberta wins in "+dis[d]+" strokes.");
		else System.out.println("Roberta acknowledges defeat.");


	}

}
