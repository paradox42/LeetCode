import java.util.*;


public class TwoSum {
	public static void main(String[] args) {
		int[] result = twoSum(new int[]{3,2,4},6);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] twoSum(int[] nums, int target){
		int length = nums.length;
		HashMap<Integer,Integer> numSet = new HashMap<Integer,Integer>();
		for(int i=0;i<length;i++){
			numSet.put(nums[i], i);
		}
		
		for(int i=0;i<length;i++){
			int needNum = target - nums[i];
			if(numSet.containsKey(needNum)){
				if(numSet.get(needNum) != i){
					return new int[]{i, numSet.get(needNum)};
				}
			}
		}
		
		return new int[]{0,0};
	}
}
