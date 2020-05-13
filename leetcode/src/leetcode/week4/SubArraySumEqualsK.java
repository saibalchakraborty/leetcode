package leetcode.week4;

public class SubArraySumEqualsK {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int k = 0;
		System.out.println(subarraySum(arr, k));
	}

	private static int subarraySum(int[] nums, int k) {
		System.out.println();
		int count = 0;
		int sum;
		for (int i = 0; i < nums.length; i++) {
			sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum = sum + nums[j];
				if (sum == k) {
					count++;
				}
			}
		}
		return count;
	}
}