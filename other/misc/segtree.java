
public class segtree {
	public static int [] st;
	public static int [] a = {5, 7, 11, 1, 2, 3, 4};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int height = (int) (Math.ceil(Math.log(a.length)/Math.log(2)));
		System.out.println(height);
		
		int maxSize = (int) Math.pow(2, height+1)-1;
		System.out.println(maxSize);
		
		st = new int[maxSize];
		
		/* create recursion function to construct st
		 * original array
		 * left
		 * right
		 * current index */
		//          L       R     cur 
		constructST(0, a.length-1, 0);
		for (int i = 0; i<st.length; i++) {
			System.out.print(st[i] + " ");
		}

	}
	
	public static int constructST (int left, int right, int index) {
		//base point (when left = right)
		if (left==right) {
			st[index] = a[left];
			return a[left];
		}
		//get middle value
		int middle = (left+right)/2;
	
		st[index] = constructST(left, middle, 2*index+1) //left side
				  + constructST(middle+1, right, 2*index+2); //right side
		return st[index];
		
	}

}
