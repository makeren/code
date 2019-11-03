import java.io.*;

public class bf3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		
		while(!prime(N)) N++;
		if (N==1) N++;
		System.out.println(N);

	}
	public static boolean prime (int n) {
		for (int i = 2; i<=Math.sqrt(n); i++) {
			if (n%i==0) return false;
		}
		return true;
	}

}
