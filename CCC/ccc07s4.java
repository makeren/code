import java.io.*;
import java.util.*;
public class ccc07s4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n = readInt();
		ArrayList<Integer> [] slides = new ArrayList [n+1];
		int paths [] = new int [n+1];
		
		for (int i = 0; i<slides.length; i++) slides[i] = new ArrayList<Integer>();
		
		int a = readInt(), b = readInt();
		while (a!=0) {
			slides[a].add(b);
			a = readInt(); b = readInt();
		}
		
		for (int i = 0; i<slides.length; i++) {
			if (slides[i].contains(n)) paths[i] = 1;
		}
		
		for (int i = n; i>0; i--) {
			for (int v:slides[i]) {
				paths[i]+=paths[v];
			}
		}
		
		System.out.println(paths[1]);

		
	}
	
	public static int readInt() throws IOException {
		int ret = 0;
		boolean num = false;
		for (int i = 0; (i = System.in.read())!=-1;) {
			if (i>='0' && i<='9') {
				num = true;
				ret = ret*10+i-'0';
			} else if (num) break;
		}
		return ret;
	}

}
