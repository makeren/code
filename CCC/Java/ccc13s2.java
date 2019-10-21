import java.util.*;
public class ccc13s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int [] cars = new int [n];
		 Queue<Integer> bridge = new LinkedList<Integer>();
		for (int i = 0; i<n; i++) {
			cars[i] = sc.nextInt();
		}
		int sum = 0;
		int total = 0;

		while (sum<=w) {
			if (bridge.size()==4) {
				bridge.poll();
			}
			bridge.add(cars[total]);
			
			total++;
			if (sum>w || total>=n) {
				break;
			}
		}

		System.out.println(total);

	}

}
