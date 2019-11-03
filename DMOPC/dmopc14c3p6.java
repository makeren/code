import java.util.*;
public class dmopc14c3p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int customers = sc.nextInt();
		int time = sc.nextInt();
		int[] dp1 = new int[time+1];
		int[] dp2 = new int[time+1];
		
		for (int i = 0; i<customers; i++){
			int c1 = sc.nextInt(), v1 = sc.nextInt();
			int c2 = sc.nextInt(), v2 = sc.nextInt();
			int c3 = sc.nextInt(), v3 = sc.nextInt();
			
			for(int j = 1; j<=time; j++){
				dp2[j] = dp1[j];
				if(j>=c1){
					dp2[j] = Math.max(dp2[j], v1+dp1[j-c1]);
				}
				if(j>=c2){
					dp2[j] = Math.max(dp2[j], v2+dp1[j-c2]);
				}
				if(j>=c3){
					dp2[j] = Math.max(dp2[j], v3+dp1[j-c3]);
				}
			}
			for(int j = 0; j<=time; j++){
				dp1[j] = dp2[j];
			}
		}
		//System.out.println(dp2[w]);
	}

}