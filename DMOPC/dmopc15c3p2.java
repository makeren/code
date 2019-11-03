import java.io.*;
import java.util.Arrays;
public class dmopc15c3p2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		long sum = 0;
		long time = 0;
		boolean isEven = true;

		String [] ss = br.readLine().split(" ");
		long [] slices = new long [N];

		for (int i = 0; i<N; i++) {
			slices[i] = Long.parseLong(ss[i]);
			sum+=slices[i];
		}

		if (sum%N!=0) {
			System.out.println("Impossible");
		} else {
			do {
				Arrays.sort(slices);
				long average = sum/N;
				time = slices[N-1]-average;
				
				for (int i = 0; i<N-1; i++) {
					if (slices[i]-slices[i+1]!=0) {
						isEven = false;
					}
				}
			} while (false==isEven);
			System.out.println(time);
		}

	}

}
