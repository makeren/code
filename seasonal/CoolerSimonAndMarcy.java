import java.util.*;
public class CoolerSimonAndMarcy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int items = sc.nextInt();
		int total = sc.nextInt();
		int dp [][] = new int [items+1][total+1];
		for (int i = 1; i<=items; i++) {
			int value = sc.nextInt();
			int cost = sc.nextInt();
			for (int j = 1; j<=total; j++) {
				if (j>=cost) dp[i][j] = Math.max(dp[i-1][j],  dp[i-1][j-cost]+value);
				else dp[i][j] = dp[i-1][j];
			}
		}
		System.out.println(dp[items][total]);



	}

}
