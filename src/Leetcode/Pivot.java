package Leetcode;

public class Pivot {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int leftSum=0;
        for (int num : nums) sum += num;

        for (int i = 0; i < nums.length; i++) {
            if(i!=0)
                leftSum+=nums[i-1];
            if(sum-leftSum-nums[i]==leftSum)
                return i;

        }

        return -1;

    }
}
