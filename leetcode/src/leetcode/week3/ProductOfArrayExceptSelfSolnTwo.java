package leetcode.week3;

public class ProductOfArrayExceptSelfSolnTwo {

	public static void main(String[] args) {

		int[] a = { 0,0 };
		ProductOfArrayExceptSelfSolnTwo pofSelf = new ProductOfArrayExceptSelfSolnTwo();
		pofSelf.product(a);
	}

	private void product(int[] nums) {
		int[] result = new int[nums.length];
		int product = 1;
		int count = 0;
		for (int i = 0; i < result.length; i++) {
			if(nums[i]==0) {
				count++;
				continue;
			}
			product = product*nums[i];
		}
		if(count==0) {
			for (int i = 0; i < nums.length; i++) {
				result[i] = product / nums[i];
			}
		}
		else if(count > 1) {
			for (int i = 0; i < nums.length; i++) {
				result[i] = 0;
			}
		}
		else {
			for(int i=0; i< nums.length; i++) {
				if(nums[i]!=0)
					result[i] = 0;
				else
					result[i] = product; 
			}
		}
		for(int i:result)
			System.out.print(i + " ");
	}

}
