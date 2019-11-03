import java.util.*;
public class ccc13j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		int c = sc.nextInt();
		int [] chores = new int [c];
		for (int i = 0; i<c; i++) {
			chores[i] = sc.nextInt();
		}
		Arrays.sort(chores);
		int done = 0;
		int sum = 0;
		
		while (sum<=t) {
			sum+=chores[done];
			done++;
		}
		
		System.out.println(done-1);

	}

}
