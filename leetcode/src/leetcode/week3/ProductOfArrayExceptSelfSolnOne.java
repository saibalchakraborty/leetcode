package leetcode.week3;

public class ProductOfArrayExceptSelfSolnOne {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		ProductOfArrayExceptSelfSolnOne pofSelf = new ProductOfArrayExceptSelfSolnOne();
		pofSelf.productExceptSelf(a);
	}

	private void productExceptSelf(int[] a) {
		int[] result = new int[a.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = prefProd(i, a) * sufProd(i, a);
		}
		for(int i:result)
			System.out.print(i + " ");
	}

	private static int prefProd(int j, int[] a) {
		if (j == 0)
			return 1;
		else
			return a[j - 1] * prefProd(j - 1, a);
	}

	private static int sufProd(int j, int[] a) {
		if (j == a.length - 1)
			return 1;
		else
			return a[j + 1] * sufProd(j + 1, a);
	}

}
