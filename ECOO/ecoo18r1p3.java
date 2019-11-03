import java.util.*;
import java.io.*;

public class P3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (new FileReader("DATA31.txt"));
		while (sc.hasNext()) {
			for (int i = 0; i<10; i++) {
				int N = sc.nextInt(), X = sc.nextInt(), Y = sc.nextInt(), Z = sc.nextInt();
				String [] codes = new String [N];
				ArrayList <Integer> ncodes [] = new ArrayList [N];
				String [] done = new String [N];

				for (int j = 0; j<ncodes.length; j++) {
					ncodes[j] = new ArrayList <Integer>();
				}

				for (int j = 0; j<N; j++) {
					codes[j] = sc.next();
				}
				for (int j = 0; j<N; j++) {
					for (int k = 0; k<codes[j].length(); k++) {
						ncodes[j].add(Integer.parseInt(codes[j].charAt(k)+""));
					}
				}
				
				for (int j = 0; j<N; j++) {
					for (int k = 0; k<ncodes[j].size(); k++) {
						if (ncodes[j].get(k)%2==0) {
							done[j]+=ncodes[j].get(k)+X;
						} else if (ncodes[j].get(k)==0) {
							done[j]+=Z;
						} else {
							done[j]+=ncodes[j].get(k)-Y;
						}
					}
				}
				
				sc.nextLine();
				sc.nextLine();
				
				String [] ans = new String [N];
				for (int j = 0; j<N; j++) {
					ans[j] = sc.next();
				}
				
				int [] fail = new int [N];
				int fcount = 0;
				boolean isMatch = true;

				for (int j = 0; j<N; j++) {
					if (done[j].length()!=ans[j].length()) {
						fail[fcount] = j;
						fcount++;
						isMatch = false;
					} else {
						for (int k = 0; k<done[j].length(); k++) {
							if (done[j].charAt(k)!=ans[j].charAt(k)) {
								fail[fcount] = j;
								fcount++;
								isMatch = false;
								break;
							}
						}
					}
				}

				if (isMatch == true) {
					System.out.println("MATCH");
				} else {
					System.out.print("FAIL: ");
					for (int j = 0; j<fcount-2; j++) {
						System.out.print(fail[j]+1+", ");
					}
					System.out.println(fail[fcount-1]+1);
				}
				
				sc.nextLine();
				sc.nextLine();
				
				for (int j = 0; j<fail.length; j++) {
					fail[j] = 0;
				}
			}
		}

	}

}
