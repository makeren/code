import java.util.Scanner;

public class ccc10s2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		byte k = sc.nextByte();

		String [] codes = new String [k];
		char [] letters = new char [k];

		sc.nextLine();
		for (int j = 0; j<k; j++) {
			String bi = sc.nextLine();
			int send = 0;
			int sstart = 0;

			letters [j] = bi.charAt(0);

			for (int i = send; i<bi.length(); i++) {
				if ("1234567890".contains(bi.charAt(i)+"")) {
					sstart = i;
					break;
				}
			}

			for (int i = sstart; i<bi.length(); i++) {
				if ("1234567890".contains(bi.charAt(i)+"")) {
					send = Integer.parseInt(i+"")+1;
				} else {
					break;
				}
			}

			String bicode = bi.substring(sstart, send);
			codes [j] = bicode;

		}

		String trans = sc.next();
		String outp = "";
		int start = 0;
		int count = 1;
		
		while (start+count<=trans.length()) {
			String temp = trans.substring(start, start+count);
			boolean flag = false;
			for (int j = 0; j<codes.length; j++) {
				if (temp.equals(codes[j])) {
					String templt = letters[j]+"";
					outp = outp+templt;
					start = start+count;
					count = 1;
					flag = true;
					break;
				}
			}
			if (flag==false) {
				count++;
			}
		}

		System.out.println(outp);


	}

}
