import java.util.Scanner;

public class Mobitel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int [] key = new int [10];
		for (int i = 1; i<key.length; i++) {
			key[i] = Integer.parseInt(sc.next());
		}

		String [] ch = new String [10];
		ch[2] = "abc";
		ch[3] = "def";
		ch[4] = "ghi";
		ch[5] = "jkl";
		ch[6] = "mno";
		ch[7] = "pqrs";
		ch[8] = "tuv";
		ch[9] = "wxyz";

		String in = sc.next();

		for (int i = 0; i<in.length(); i++) {
			boolean isFound = false;
			char tc = in.charAt(i);
			for (int j = 2; j<ch.length; j++) {
				if (ch[j].contains(tc+"")) {
					for (int k = 0; k<ch[j].length(); k++) {
						if (ch[j].charAt(k)==tc) {
							isFound = true;
							if (i==0) {
								for (int w = 0; w<key.length ;w++) {
									if (key[w]==j) {
										for (int h = 0; h<ch[j].indexOf(tc)+1; h++) {
											System.out.print(w);
										}
										break;
									}
								}

							} else {
								if (ch[j].contains(in.charAt(i-1)+"")) {
									System.out.print("#");
									for (int w = 0; w<key.length ;w++) {
										if (key[w]==j) {
											for (int h = 0; h<ch[j].indexOf(tc)+1; h++) {
												System.out.print(w);
											}
											break;
										}
									}
								} else {
									for (int w = 0; w<key.length ;w++) {
										if (key[w]==j) {
											for (int h = 0; h<ch[j].indexOf(tc)+1; h++) {
												System.out.print(w);
											}
											break;
										}
									}
								}
							}
							break;
						}
						if (true==isFound) {
							break;
						}
					}
				}
				if (true==isFound) {
					break;
				}
			}
		}

	}

}
