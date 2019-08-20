package basic;

public class CenteredAvarage {
	
	public int centeredAverage(int[] nums) {
		if(nums.length==1) return nums[0];
		else if(nums.length%2==0) {
			return (nums[nums.length/2]+nums[nums.length/2-1])/2;
		}
		else return nums[nums.length/2];
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] sample= {2,3,4,4,5,6};
		System.out.println(new CenteredAvarage().centeredAverage(sample));

	}

}
