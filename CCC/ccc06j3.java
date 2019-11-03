import java.util.Scanner;
import java.util.Hashtable;

public class ccc06j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		String [] k = new String [10];
		k[2] = "abc";
		k[3] = "def";
		k[4] = "ghi";
		k[5] = "jkl";
		k[6] = "mno";
		k[7] = "pqrs";
		k[8] = "tuv";
		k[9] = "wxyz";

		String in = sc.next();
		while (!in.equals("halt")) {
			int time = 0;

			for (int j = 0; j<in.length(); j++) {
				for (int i = 2; i<10; i++) {
					if (k[i].contains(in.charAt(j)+"")) {
						if (j!=0 && k[i].contains(in.charAt(j-1)+"")) {
							time += 2;
						}
						time += k[i].indexOf(in.charAt(j))+1;
					}
				}
			}
			
			System.out.println(time);
			in = sc.next();
		}

	}

}

