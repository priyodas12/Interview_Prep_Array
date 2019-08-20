package basic;

import java.util.Arrays;

public class DiffLargeSmall {
	
	public int bigDiff(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length-1]-nums[0];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample= {3,1,9,4};
		System.out.println(new DiffLargeSmall().bigDiff(sample));
	}

}
