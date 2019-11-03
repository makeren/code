import java.io.*;
import java.util.*;

public class globexcup18s1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		int N = Integer.parseInt(br.readLine());
		boolean original [] = new boolean [N+1];
		Arrays.fill(original, true);
		
		String s [] = br.readLine().split(" ");
		
		for (int i = 0; i<N; i++) original[Integer.parseInt(s[i])] = false;
		
		int count = 0;
		for (int i = 1; i<original.length; i++) if(original[i]) count++;
		
		System.out.println(count);

	}

}
