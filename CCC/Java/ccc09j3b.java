import java.util.Scanner;

public class ccc09j3b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String [] city = {
				" in Ottawa",
				" in Victoria",
				" in Edmonton",
				" in Winnipeg",
				" in Toronto",
				" in Halifax",
				" in St. John's",
		};
		
		int O = sc.nextInt();
		
		int hour = O/100;
		int minute = O%100;

		for (int i = 0; i<city.length; i++) {
			String S = city[i];
			if (S.equals (" in Victoria")) {
				hour = hour-3;
			} else if (S.equals (" in Edmonton")) {
				hour = hour-2;
			} else if (S.equals (" in Winnipeg")) {
				hour = hour-1;
			} else if (S.equals (" in Halifax")) {
				hour = hour+1;
			} else if (S.equals (" in St. John's")) {
				hour = hour+1;
				minute = minute+30;
			}
			System.out.printf("%d%02d%s\n",hour,minute,city[i]);
		}


	}

}
