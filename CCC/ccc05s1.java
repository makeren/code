import java.util.LinkedList;
import java.util.Scanner;

public class ccc05s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int t = sc.nextInt();
		LinkedList <String> n = new LinkedList <String>();
		int count = 0;

		for (int i = 0; i<t; i++) {
			String number = sc.next();
			count = 0;
			for (int j = 0; j<number.length(); j++) {
				if (count>9) {
					break;
				}
				if ("1234567890".contains(number.charAt(j)+"")) {
					n.add(number.charAt(j)+"");
					count++;
				} else {
					int num = number.charAt(j) - 'A';
					if (num>=0) {
						if (num<=2) {
							n.add("2");
							count++;
						} else if (num<=5) {
							n.add("3");
							count++;
						} else if (num<=8) {
							n.add("4");
							count++;
						} else if (num<=11) {
							n.add("5");
							count++;
						} else if (num<=14) {
							n.add("6");
							count++;
						} else if (num<=18) {
							n.add("7");
							count++;
						} else if (num<=21) {
							n.add("8");
							count++;
						} else if (num<=25) {
							n.add("9");
							count++;
						}
					}
				}
			}
			for (int k = 0; k<=9; k++) {
				if (k>0 && k%3==0 && k<9) {
					System.out.print("-");
				}
				System.out.print(n.get(k+(10*i)));
			}
			System.out.println();
		}

	}
}