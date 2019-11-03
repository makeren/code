import java.util.*;
import java.io.*;
public class R2P1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new FileReader ("DATA11.txt"));
		while (sc.hasNext()) {
			for (int i = 0; i<10; i++) {
				int C = sc.nextInt(), O = sc.nextInt(), W = sc.nextInt(), S = sc.nextInt();
				int pC = sc.nextInt(), pW = sc.nextInt(), pS = sc.nextInt(), pO = sc.nextInt();
				int fS = sc.nextInt(), fO = sc.nextInt(), fC = sc.nextInt(), fW = sc.nextInt();
				while ((C>=pC && W>=pW) || ((S>=fS && O>=fO) && (pO>fO))) {
					if (C>=pC && W>=pW) {
						C-=pC; W-=pW;
						O+=pO; S+=pS;
					} else {
						if (fO<pO) {
							C+=fC; W+=fW;
							O-=fO; S-=fS;
						}
					}
				}
				System.out.println(O);
			}
		}
	}

}
