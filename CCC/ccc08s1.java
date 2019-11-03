import java.io.*;
import java.util.Arrays;
public class ccc08s1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String [] city = new String [10000];
		int [] temp = new int [10000];
		int [] copy = new int [10000];
		int count = 0;
		
		while (true) {
			String in = br.readLine();
			String [] line = in.split(" ");
			city[count] = line[0];
			temp [count] = Integer.parseInt(line[1]);
			copy[count] = temp[count];
			
			if (in.contains("Waterloo")) {
				break;
			}
			
			count++;
		}
		
		Arrays.sort(copy);
		
		for (int i = 0; i<10000; i++) {
			if (copy[0]==temp[i]) {
				System.out.println(city[i]);
				break;
			}
		}

	}

}
