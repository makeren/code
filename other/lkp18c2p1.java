import java.util.*;
public class lkp18c2p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		int [] line = new int [N];

		for (int i = 0; i<N; i++) {
			line[i] = sc.nextInt();
		}

		for (int i = 0; i<M; i++) {
			int min = Integer.MAX_VALUE, index = -1;
			for (int j = 0; j<line.length; j++) {
				if (line[j]<min) {
					min = line[j];
					index = j;
				}
			}
			line[index]++;
			System.out.println(min);
		}	


	}

}
