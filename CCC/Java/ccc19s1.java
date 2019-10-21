import java.io.*;
public class ccc19s1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		int [][] num = new int [2][2];
		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;
		
		String ins = br.readLine();
		int h = 0, v = 0;
		for (int i = 0; i<ins.length(); i++) {
			if (ins.charAt(i)=='H') h++;
			else v++;
		}
		int temp1 = 0, temp2 = 0;
		if (h%2!=0) {
			temp1 = num[0][0];
			temp2 = num[0][1];
			num[0][0] = num[1][0];
			num[0][1] = num[1][1];
			num[1][0] = temp1;
			num[1][1] = temp2;
		}
		
		if (v%2!=0) {
			temp1 = num[0][0];
			temp2 = num[1][0];
			num[0][0] = num[0][1];
			num[1][0] = num[1][1];
			num[0][1] = temp1;
			num[1][1] = temp2;
		}
		
		for (int i = 0; i<2; i++) {
			for (int j = 0; j<2; j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		

	}
	public static int readInt() throws IOException {
		int c = System.in.read(), ret = 0;
		boolean num = false;
		while (true) {
			if (c>='0' && c<='9') {
				num = true;
				ret = ret*10+c-'0';
			} else if (num) break;
			c = System.in.read();
		}
		return ret;
	}

}
