import java.io.IOException;

public class ccc19s3 {
	public static int square [][];
	public static boolean x [][];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		square = new int [3][3];
		x = new boolean [3][3];
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				square[i][j] = readInt();
				if (square[i][j]==1000001) x[i][j] = true;
			}
		}

		int col [] = new int [3];

		for (int i = 0; i<3; i++) {
			int count = 0, sum = 0, dif = 0;
			for (int j = 0; j<3; j++) {
				if (!x[i][j]) {
					col[j] = square[i][j];
					sum+=square[i][j];
					count++;
				}
			}
			if (count>1) {
				if (x[i][0]) {
					dif = col[2]-col[1];
					square[i][0] = col[1]-dif;
					x[i][0] = true;
				} else if (x[i][1]) {
					dif = (col[2]-col[0])/2;
					square[i][1] = col[2]-dif;
					x[i][1] = true;
				} else {
					dif = col[1]-col[0];
					square[i][2] = col[1]+dif;
					x[i][2] = true;
				}
			}
		}
		// at this point any columns with only one x are filled
		
//		int sum0 = 0, sum1 = 0, sum2 = 0;
//		
//		for (int i = 0; i<3; i++) {
//			for (int j = 0; j<3; j++) {
//				if (!x[i][j]) {
//					if (i==0) {
//						sum0+=square[i][j];
//					} else if (i==1) {
//						sum1+=square[i][j];
//					} else {
//						sum2+=square[i][i];
//					}
//				}
//			}
//		}
		
		for (int i = 0; i<3; i++) {
			int xs = 0, empty = 0;
			for (int j = 0; j<3; j++) {
				if (x[i][j]) {
					xs++;
					empty = j;
				}
			}
			square[i][empty] = 1;
			
			
		}
		
		

		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print(square[i][j]+" ");
			}
			System.out.println();
		}


	}
	
	public static void guess (int xcur, int ycur, int dif) {
		
		square[xcur][ycur] = 1;
		
		if (xcur+1<=2 && x[xcur+1][ycur]) {
			square[xcur][ycur] = 1;
		} else if (xcur-1>=0 && x[xcur-1][ycur]) {
			square[xcur][ycur] = 1;
		} else if (ycur+1<=2 && x[xcur][ycur+1]) {
			square[xcur][ycur] = 1;
		} else if (ycur-1>=0 && x[xcur][ycur-1]) {
			square[xcur][ycur] = 1;
		}
		
	}

	public static int readInt() throws IOException {
		int c = System.in.read(), ret = 0;
		boolean num = false;
		while (true) {
			if (c>='0' && c<='9') {
				num = true;
				ret = ret*10+c-'0';
			} else if (c=='X') {
				ret = 1000001;
				break;
			} else if (num) break;
			c = System.in.read();
		}
		return ret;
	}

}
