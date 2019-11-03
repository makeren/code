import java.util.LinkedList;

public class ccc08j2b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> l = new LinkedList <String>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		
		// first to last
		String S = l.removeFirst();
		l.addLast(S);
		
		//last to first
		String A = l.removeLast();
		l.addFirst(A);
		
		//swap 1 with 2
		String temp = l.get(1);
		l.add(1, l.get(2));
		l.add(2,temp);

	}

}
