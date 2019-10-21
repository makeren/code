import java.util.*;
public class ccc18j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int [] dis = new int [5];
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
		dis[0] = 0;
		dis[1] = a;
		dis[2] = b;
		dis[3] = c;
		dis[4] = d;

		for (int i = 0; i<5; i++) {
			for (int j = 0; j<5; j++) {
				int temp = 0;
				if (i!=j) {
					if (j>i) {
						for (int k = i+1; k<=j; k++) {
							temp+=dis[k];
						}
					} else {
						for (int k = j+1; k<=i; k++) {
							temp+=dis[k];
						}
					}
				}

				System.out.print(temp+" ");
			}
			System.out.println();
		}
	}

}