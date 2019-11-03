import java.io.*;
public class mwc15c1p3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String [] d = br.readLine().split(" ");

		int [] freq = new int [101];
		for (int i = 0; i<N; i++) {
			freq[Integer.parseInt(d[i])]++;
		}
		int max = 0;
		int min = 100;
		int map = 0;
		int mip = 0;

		for (int i = 0; i<101; i++) {
			if (freq[i]>max) {
				max = freq[i];
				map = i;
			} else if (freq[i]==max) {
				if (i>max) {
					map = i;
				}
			}

			if (freq[i]!=0) {
				if (freq[i]<min) {
					min = freq[i];
					mip = i;
				} else if (freq[i]==min) {
					if (i<min) {
						mip = i;
					}
				}
			}
		}
		
		System.out.println(Math.abs(map-mip));




	}

}
