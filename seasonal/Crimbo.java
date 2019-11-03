import java.io.*;
public class Crimbo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String [] d = new String [n+1];
		for (int i = 1; i<n+1; i++) {
			d[i] = br.readLine();
		}

		for (int i = 1; i<n+1; i++) {
			if ((Integer.toString(i).endsWith("1") || Integer.toString(i).endsWith("2") || Integer.toString(i).endsWith("3")) &&
					!Integer.toString(i).endsWith("11") && !Integer.toString(i).endsWith("12") && !Integer.toString(i).endsWith("13")) {
				if (Integer.toString(i).endsWith("1")) {
					System.out.println("On the "+i+"st day of Christmas my true love sent to me:");
				} else if (Integer.toString(i).endsWith("2")) {
					System.out.println("On the "+i+"nd day of Christmas my true love sent to me:");
				} else {
					System.out.println("On the "+i+"rd day of Christmas my true love sent to me:");
				}
			} else {
				System.out.println("On the "+i+"th day of Christmas my true love sent to me:");
			}
			for (int j = i; j>0; j--) {
				if (i>1 && j==1) {
					System.out.print("and ");
				}
				System.out.println(j+" "+d[j]);
			}
			System.out.println();

		}

	}

}
