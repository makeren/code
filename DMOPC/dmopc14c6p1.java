import java.util.Scanner;

public class dmopc14c6p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		boolean flag = false;
		int N = sc.nextInt();
		String [] stations = new String [N];
		String [] names = new String [3];
		names [0] = "Bessarion";
		names [1] = "Leslie";
		names [2] = "Bayview";

		sc.nextLine();
		for (int i = 0; i<N; i++) {
			stations[i] = sc.nextLine();
		}

		for (int i = 1; i<stations.length-1; i++) {
			if (stations[i].equals(names[0])) {
				if (stations[i-1].equals(names[1])) {
					if (stations[i+1].equals(names[2])) {
						flag = true;
						break;
					}
				} else if (stations[i-1].equals(names[2])) {
					if (stations[i+1].equals(names[1])) {
						flag = true;
						break;
					}
				}
			}
		}

		if (true == flag) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}



	}

}
