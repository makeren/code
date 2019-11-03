import java.io.*;
public class vmss7wc16c1p1 {


	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int year = Integer.parseInt(br.readLine());

		for (int i = 2; i<year-1; i++) {
			if (true==isPrime(i)) {
				while (year%i==0) {
					System.out.println(i);
					year = year/i;
				}
			}
		}
		if (year!=1) {
			System.out.println(year);
		}

	}

	static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		} else if (n==2) {
			return true;
		} else {
			for (int i = 3; i<n/2; i+=2){
				if (n%i==0) {
					return false;
				}
			}
		}
		return true;

	}

}
