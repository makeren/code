
public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hanoi(3, 'A', 'B', 'C');

	}

	public static void Hanoi (int n, char A, char B, char C) {
		if (n==1) {
			move(A,C);
		} else {
			Hanoi (n-1, A, C, B);
			move(A,C);
			Hanoi(n-1, B, A, C);
		}
	}
	public static void move (char x, char y) {
		System.out.println(x + "-->" + y);
	}
}
