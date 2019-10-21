import java.io.*;
public class ccc03s2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		for (int k = 0; k<N; k++) {

			String [] poem = new String [4];
			for (int i = 0; i<4; i++) {
				poem[i] = (br.readLine()).toLowerCase();
			}

			String [] spoem = new String [4];

			for (int i = 0; i<4; i++) {
				boolean noVowel = true;
				boolean found = false;
				for (int j = poem[i].length()-1; j>poem[i].lastIndexOf(' '); j--) {
					if ("aeiou".contains(poem[i].charAt(j)+"")) {
						noVowel = false;
						spoem[i] = poem[i].substring(j, poem[i].length());
						found = true;
						break;
					}

				}
				if (noVowel==true && found==false) {
					spoem[i] = poem[i].substring(poem[i].lastIndexOf(' ')+1, poem[i].length());
				}
			}

			if (spoem[0].equals(spoem[1]) && spoem[1].equals(spoem[2]) && spoem[2].equals(spoem[3])) {
				System.out.println("perfect");
			} else if (spoem[0].equals(spoem[1]) && spoem[2].equals(spoem[3])) {
				System.out.println("even");
			} else if (spoem[0].equals(spoem[2]) && spoem[1].equals(spoem[3])) {
				System.out.println("cross");
			} else if (spoem[0].equals(spoem[3]) && spoem[1].equals(spoem[2])) {
				System.out.println("shell");
			} else {
				System.out.println("free");
			}
		}



	}

}
