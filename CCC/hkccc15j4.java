import java.util.*;
public class hkccc15j4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt(), N = sc.nextInt();
		boolean river [] = new boolean [L];
		Arrays.fill(river, true);
		
		for (int i = 0; i<N; i++) {
			int st = sc.nextInt(), end = sc.nextInt();
			for (int a = st; a<end; a++) if (river[a]) river[a] = false;
		}

		int max = 0, count = 0;
		for (int i = 0; i<L; i++) {
			if (river[i]) count++;
			else if(count>max) max = count; count = 0;
		}
		if (count>max) max = count;
		System.out.println(max);

	}

}
