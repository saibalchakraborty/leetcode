package leetcode.week3;

import java.util.Scanner;

public class SearchInRotatedSortedArray {

	static int[] nums = { 1, 3 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(calculateIndex(n, 0, nums.length - 1));
		sc.close();
	}

	private static int calculateIndex(int k, int low, int high) {
		int mid = (low + high) / 2;
		if ((low == high && nums[mid] != k) || (low > high)) {
			return -1;
		}
		if (k == nums[mid])
			return mid;
		else if (nums[mid] <= nums[high]) {

			if (k > nums[mid] && k <= nums[high])
				return calculateIndex(k, mid + 1, high);
			else
				return calculateIndex(k, low, mid - 1);
		} else if (nums[low] <= nums[mid]) {
			if (k >= nums[low] && k < nums[mid])
				return calculateIndex(k, low, mid - 1);
			else
				return calculateIndex(k, mid + 1, high);
		} else
			return -1;
	}

}
