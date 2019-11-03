import java.util.*;
public class ccc16s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int Q = sc.nextInt(), N = sc.nextInt();
		int dmoj [] = new int [N];
		int peg [] = new int [N];
		for (int i = 0; i<N; i++) dmoj[i] = sc.nextInt();
		for (int i = 0; i<N; i++) peg[i] = sc.nextInt();
		
		Arrays.sort(dmoj); Arrays.sort(peg);
		
		int speed = 0;
		if (Q==1) {
			for (int i = 0; i<N; i++) {
				speed+=Math.max(dmoj[i], peg[i]);
			}
		} else {
			for (int i = 0; i<N; i++) {
				speed+=Math.max(dmoj[i], peg[peg.length-1-i]);
			}
		}
		
		System.out.println(speed);

	}

}
