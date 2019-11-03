import java.io.*;
public class ccc06s2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String pt = br.readLine();
		String ct = br.readLine();
		String c = br.readLine();
		
		char [] ptc = new char [27];
		char [] ctc = new char [27];
		
		int count = 0;
		
		for (int i = 0; i<ct.length(); i++) {
			boolean isFirst = true;
			for (int j = 0; j<27; j++) {
				if (ptc[j]==pt.charAt(i)) {
					isFirst = false;
					break;
				}
			}
			if (true==isFirst) {
				ptc[count] = pt.charAt(i);
				ctc[count] = ct.charAt(i);
				count++;
			}	
		}
		
		String s = "";
		for (int i = 0; i<c.length(); i++) {
			boolean isFound = false;
			for (int j = 0; j<27; j++) {
			if (c.charAt(i)==ctc[j]) {
				s+=ptc[j]+"";
				isFound = true;
				break;
			}
			}
			if (false==isFound) {
				s+=".";
			}
		}
		
		System.out.println(s);

	}

}
