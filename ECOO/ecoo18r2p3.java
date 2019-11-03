import java.util.*;
import java.io.*;
public class R2P3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new FileReader ("DATA31.txt"));
		while (sc.hasNext()) {
			for (int l = 0; l<10; l++) {
				int K = sc.nextInt(), M = sc.nextInt();
				int i = 0;
				int N = 0;
				int count = 0;
				//				Queue <Integer> factors = new LinkedList <Integer>();
				//				int K2 = K;
				//				for (int c = 2; c<=K2; c++) {
				//					while (K2%c==0) {
				//						factors.add(c);
				//						K2 = K2/c;
				//					}
				//				}
				//
				//				int nums [] = new int [factors.size()];
				//				for (int y = 0; y<factors.size(); y++) {
				//				int oK = factors.poll();

				while (true) {
					i++;
					double j = i;
					while (j%K==0) {
						count++;
						j = j/K;
					}
					if (count>=M) {
						N = i;
						break;
					}
				}

				System.out.println(N);
			}
			//			Arrays.sort(nums);
			//			System.out.println(nums[0]);
		}
	}
	//	}

}
