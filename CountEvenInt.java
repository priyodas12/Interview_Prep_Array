package basic;

public class CountEvenInt {
	
	public int countEvens(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) count++;
			else if(nums[i]%2==0) {
				count++;
			}
		}
		return count;
		  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sample=new int[] {3,5,2,1,7};
		System.out.println(new CountEvenInt().countEvens(sample));
		
		
	}

}
