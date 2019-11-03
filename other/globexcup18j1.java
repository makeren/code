import java.io.*;

public class globexcup18j1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int N = Integer.parseInt(br.readLine());
		double num [] = new double [N];
		
		for (int i = 0; i<N; i++) {
			num[i] = Double.parseDouble(br.readLine());
		}
		
		int up = 0, down = 0;
		
		for (int i = 0; i<N; i++) {
			double x = num[i] - (int) num[i];
			if (x>=0.5) {
				up++;
			} else {
				down++;
			}
			
		}
		
		System.out.println(up);
		System.out.println(down);
		

	}

}
