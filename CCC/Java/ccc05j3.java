import java.io.*;

public class ccc05j3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		String [] d = new String [10];

		int count = 0;
		String inp = br.readLine();

		while (!inp.equals("SCHOOL")) {
			d[count] = inp;
			count++;
			inp = br.readLine();
		}

		for (int i = count-1; i>=0; i-=2) {
			if (d[i].equals("R")) {
				System.out.print("Turn LEFT ");
			} else {
				System.out.print("Turn RIGHT ");
			}

			if (i!=0) {
				System.out.print("onto "+d[i-1]+" street.");
				System.out.println();
			}
			
		}

		System.out.print("into your HOME.");

	}

}
