import java.io.*;
import java.util.*;
public class ccc12s5 {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int R = readInt(), C = readInt();
		int [][] cage = new int [R+1][C+1];

		int K = readInt();

		for (int i = 0; i<K; i++) {
			int r = readInt(), c = readInt();
			cage[r][c] = -1;
		}

		cage[1][1] = 1;

		for (int i = 1; i<=R; i++) {
			for (int j = 1; j<=C; j++) {
				if (cage[i][j]==0) {
					if (cage[i-1][j]>0) cage[i][j] += cage[i-1][j];
					if (cage[i][j-1]>0) cage[i][j] += cage[i][j-1];
				}
			}
		}

		System.out.println(cage[R][C]);

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
