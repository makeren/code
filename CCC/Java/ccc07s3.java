import java.util.*;
public class ccc07s3 {
	public static int [] dis = new int [10000];
	public static int [] friends = new int [10000];
	public static boolean inCircle;
	public static int a, b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i<n; i++) {
			int x = sc.nextInt(), y = sc.nextInt();
			friends[x] = y;
		}
		
		a = sc.nextInt(); b = sc.nextInt();
		while (a+b!=0) {
			inCircle = false;
			Arrays.fill(dis, 0);
			dfs(a);
			if (inCircle) System.out.println("Yes "+(dis[b]-1));
			else System.out.println("No");
			
			a = sc.nextInt(); b = sc.nextInt();
		}
		

	}
	public static void dfs (int cur) {
		int temp = friends[cur];
		dis[temp] = dis[cur]+1;
		if (temp==b) inCircle = true;
		else if (temp==a) inCircle = false;
		else dfs(temp);
	}
	

}
