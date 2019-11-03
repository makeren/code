import java.io.*;
public class gfsspc1p4 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		boolean flag = true;
		int count = 0;

		// Fibonacci
		int [] fbs = new int [14];
		fbs[0] = 1;
		fbs[1] = 2;
		for (int i = 2; i<fbs.length; i++) {
			fbs[i] = fbs[i-1] + fbs[i-2];
		}

		// checking
		for (int i = 0; i<N; i++) {
			if (S.charAt(i)=='A') {
				if (i+1==fbs[count]) {
					count++;
				} else {
					flag = false;
					break;
				}
			} else {
				if (i+1==fbs[count]) {
					flag = false;
					break;
				}
			}
		}

		// output
		if (flag==true) {
			System.out.println("That's quite the observation!");
		} else {
			System.out.println("Bruno, GO TO SLEEP");
		}


	}

}
