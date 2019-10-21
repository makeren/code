import java.io.*;

public class ccc04j3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());

		String [] adj = new String [n];
		String [] noun = new String [m];

		for (int i = 0; i<adj.length; i++) {
			adj[i] = br.readLine();
		}

		for (int i = 0; i<noun.length; i++) {
			noun[i] = br.readLine();
		}
		
		for (int i = 0; i<adj.length; i++) {
			for (int j = 0; j<noun.length; j++) {
				System.out.println(adj[i]+" as "+noun[j]);
			}
		}

	}

}
