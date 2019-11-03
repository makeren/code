import java.util.Scanner;

public class segtree3 {
	public static int [] A;
	public static int [] tree;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		A  = new int [N];
		for (int i = 0; i<N; i++) {
			A[i] = sc.nextInt();
		}

		int height = (int) Math.ceil(Math.log(A.length)/Math.log(2)); // calculating the height
		int size = (int) Math.pow(2, height+1) - 1; // calculating the maximum size
		tree = new int [size];

		// beginning index, ending index, segment tree index
		constructSegTree(0, A.length-1, 0); // creating the array using recursion
		for (int i = 0; i<tree.length; i++) {
			System.out.print(tree[i]+" ");
		}
	}

	// recursion function
	// need range of array and index (starts at 0)
	public static int constructSegTree(int bi, int ei, int index) {
		// base point, when the range is only one element, copy from the original array
		if (bi==ei) {
			tree[index] = A[bi]; //ei would also work
			return tree[index];
		}

		int mid = (bi+ei)/2;
		// splitting the range into left and right halves
		tree[index] = constructSegTree(bi, mid, 2*index+1) //left half, left index
				+ constructSegTree(mid+1, ei, 2*index+2); //right half, right index
		return tree[index];
	}

	public static int query (int l, int r, int low, int high, int index) {
		// l and r are indexes of the query
		// low and high are the current l and r for each recursive call
		if(l>high || r<low) return 0; // does not exist

		if(l<=low && r>=high) return tree[index]; // the range you're looking for is inside this range
		else {
			int mid = (low+high)/2;
			if (r<=mid)	return query(l, r, low, mid, index*2+1); //query range is in the left subtree (1-3)
			else if (l>mid) return query(l, r, mid+1, high, index*2+2); //query range is in the right subtree (5-6)
			else return query(l, r, low, mid, index*2+1) +
					query(l, r, mid+1, high, index*2+2); //query range is between the left and right subtree (1-5)
		}
	}

	public static void update(int x, int v, int low, int high, int index) {
		//x is the index to update, v is the value to change the index to
		//low is current left, high is current right
		//index is the current index
		if (low==x && low==high) {
			tree[index] = v; A[x] = v;
		} else {
			int mid = (low+high)/2;
			if (x<=mid) update(x, v, low, mid, index*2+1);
			else update(x, v, mid+1, high, index*2+2);
		}
		tree[index] = tree[index*2+1] + tree[index*2+2];
	}

	/*	public static void differenceUpdate(int s, int e, int d, int x, int i) {
	 *		//x is the index to update, v is the value to change the index to
	 *		//low is current left, high is current right
	 *		//index is the current index
	 *		if (s>x || e<x) {
	 *			return 
	 *		} else {
	 *			int mid = (low+high)/2;
	 *			
	 *			if (x<=mid) update(x, v, low, mid, index*2+1);
	 *			else update(x, v, mid+1, high, index*2+2);
	 *		}
	 *		tree[index] = tree[index*2+1] + tree[index*2+2];
	 *	} */

}
