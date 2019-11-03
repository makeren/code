import java.io.*;
import java.util.Arrays;
public class ccc07s2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//boxes in
		char [][] boxes = new char [n][3];
		for (int i = 0; i<n ;i++) {
			int count = 0;
			String d = br.readLine();
			for (int j = 0; j<3; j++) {
				boxes[i][j] = d.charAt(count);
				count+=2;
			}
			Arrays.sort(boxes[i]);
			
		}
		//items in
		int m = Integer.parseInt(br.readLine());
		char [][] items = new char [m][3];
		for (int i = 0; i<m ;i++) {
			int count = 0;
			String d = br.readLine();
			for (int j = 0; j<3; j++) {
				items[i][j] = d.charAt(count);
				count+=2;
			}
			Arrays.sort(items[i]);
		}
		
		// checking
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print(boxes[i][j]+" ");
			}
			System.out.println();
		}

		for (int i = 0; i<m; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print(items[i][j]+" ");
			}
			System.out.println();
		}
		// checking done
		
		
		for (int i = 0; i<m; i++) {
			boolean isFound = true;
			int size = 0;
			for (int j = 0; j<n; j++) {
				for (int k = 0; k<3; k++) {
					if (items[i][k]>boxes[n][k]) {
						isFound = false;
						break;
					}
				}
			}
		}
		

	}

}
