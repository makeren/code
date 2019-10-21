import java.util.*;
public class ccc10j4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		while (true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}

			int a [] = new int [n], x = sc.nextInt();

			for (int i = 0; i<n-1; i++) {
				int y = sc.nextInt();
				a[i] = y-x; x = y;
			}
			if (n==1) {
				System.out.println(0);
				continue;
			}

			int cycle = 0;

			for (cycle = 1; cycle<n-1; cycle++) {
				boolean flag = true;
				for (int i = 0; i<n-1; i++) {
					if (a[i]!=a[i%cycle]) {
						flag = false;
					}
				}
				if (true==flag) { 
					System.out.println(cycle);
					break;
				}
			}
			if (cycle == n-1) {
				System.out.println(n-1);
			}
		}

	}

}
