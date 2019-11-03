import java.io.*;
public class dmopc16c2p1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double t = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		boolean isPossible = true;
		
		for (int i = 0; i<K; i++) {
			int pl = Integer.parseInt(br.readLine());
			if (pl==1) {
				t-=0.5;
			} else if (pl==2) {
				t-=1;
			} else {
				t-=5;
			}
			
			if (t<=0) {
				isPossible = false;
				break;
			}
		}
		
		if (true==isPossible) {
			System.out.println("Continue");
		} else {
			System.out.println("Return");
		}

	}

}
