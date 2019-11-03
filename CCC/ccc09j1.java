import java.io.*;
public class ccc09j1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int [] isbn = new int [3];

		int sum = 91;

		for (int i = 0; i<3; i++) {
			isbn[i] = Integer.parseInt(br.readLine());
		}

		sum+=isbn[0];
		sum+=isbn[1]*3;
		sum+=isbn[2];

		System.out.println("The 1-3-sum is "+sum);


	}

}
