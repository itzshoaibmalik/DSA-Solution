class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for(int i = 0; i < nums.length; i++){
            leftSum += nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            int totalSum = leftSum - nums[i] - rightSum;
            if(totalSum == rightSum){
                return i;
            }
            rightSum += nums[i];
        }
        return -1;
    }
}