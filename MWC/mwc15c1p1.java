import java.io.*;
import java.util.Arrays;
public class mwc15c1p1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int [] s = new int [N];
		
		for (int i = 0; i<N; i++) {
			String [] ts = br.readLine().split(" ");
			s[i] = Integer.parseInt(ts[0])*60+Integer.parseInt(ts[1]);
		}
		Arrays.sort(s);
		int count = 0;
		
		String [] XY = br.readLine().split(" ");
		double Y = Integer.parseInt(XY[0])*60+Integer.parseInt(XY[1]);
		
		while (true) {
			Y-=s[count];
			if (Y<0) {
				break;
			}
			count++;
			if (count==N) {
				break;
			}
		}
		
		System.out.println(count);

	}

}
