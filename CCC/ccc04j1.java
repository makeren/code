import java.io.*;
public class ccc04j1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int tiles = Integer.parseInt(br.readLine());
		System.out.println("The largest square has side length "+(int)Math.sqrt(tiles)+".");

	}

}
