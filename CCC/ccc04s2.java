import java.util.*;
public class ccc04s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int yodeller [] = new int [n];
		int worstRank [] = new int [n];
		Arrays.fill(worstRank, 1);
		
		for (int i = 0; i<k; i++) {
			for (int j = 0; j<n; j++) yodeller[j] += sc.nextInt(); 
			for (int j = 0; j<n; j++) {
				int r = 1;
				for (int l = 0; l<n; l++) {
					if (yodeller[l]>yodeller[j]) r++;
				}
				if (r>worstRank[j]) worstRank[j] = r;
			}
		}
		
		int topScore = Integer.MIN_VALUE;
		for (int i = 0; i<n; i++) {
			if (yodeller[i]>topScore) topScore = yodeller[i];
		}
		
		for (int i = 0; i<n; i++) {
			if (yodeller[i]==topScore) {
				System.out.println("Yodeller "+(i+1)+" is the TopYodeller: score "+topScore+", worst rank "+worstRank[i]);
			}
		}
		
		
		
		

	}

}
