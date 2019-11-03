import java.io.*;
public class bfs17p2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String S = br.readLine();
		String [] markers = S.split(" ");
		int [] colours = new int [6];
		
		for (int i = 0; i<N; i++) {
			if (markers[i].equals("red")) {
				colours[0]++;
			} else if (markers[i].equals("orange")) {
				colours[1]++;
			} else if (markers[i].equals("yellow")) {
				colours[2]++;
			} else if (markers[i].equals("green")) {
				colours[3]++;
			} else if (markers[i].equals("blue")) {
				colours[4]++;
			} else if (markers[i].equals("black")) {
				colours[5]++;
			}
		}
		
		int max = 0;
		int other = 0;
		
		for (int i = 0; i<colours.length; i++) {
			if (colours[i]>max) {
				other = other+max;
				max = colours[i];
			} else {
				other = other +colours[i];
			}
		}
		
		if (other>=max) {
			System.out.println(other+max);
		} else {
			System.out.println(other*2+1);
		}
		

	}

}
