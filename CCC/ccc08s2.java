import java.io.*;
public class ccc08s2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
	
		int r = Integer.parseInt(br.readLine());
		while (r!=0) {
		int ans = 0;
		for (int x = -r; x<=r; x++) {
			int y = (int) Math.sqrt(r*r-x*x);
			ans+=2*y+1;
		}
		System.out.println(ans);
		r = Integer.parseInt(br.readLine());
		}

	}

}
