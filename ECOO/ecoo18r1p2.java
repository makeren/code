import java.util.*;
import java.io.*;

public class P2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new FileReader ("DATA21.txt"));
		while (sc.hasNext()) {
			for (int k = 0; k<10; k++) {
				int N = sc.nextInt();
				int route [][] = new int [N][70];
				ArrayList <Integer> mroute = new ArrayList <Integer>();
				int min = 70000;
				int ID = 0;
				int [] R = new int [N];

				for (int i = 0; i<N; i++) {
					ID = sc.nextInt();
					R[i] = sc.nextInt();

					for (int j = 0; j<R[i]; j++) {
						route[ID-1][j] = sc.nextInt();
					}

					Arrays.sort(route[ID-1]);


					if (route[ID-1][70-R[i]]<=min) {
						min = route[ID-1][70-R[i]];
					}
				}

				for (int i = 0; i<N; i++) {
					if (route[i][70-R[i]]==min) {
						mroute.add(i+1);
					}
				}
	
				System.out.print(min+" "+"{");
				for (int i = 0; i<mroute.size()-1; i++) {
					System.out.print(mroute.get(i)+", ");
				}
				System.out.print(mroute.get(mroute.size()-1)+"}");
				System.out.println();

			}
		}

	}

}
