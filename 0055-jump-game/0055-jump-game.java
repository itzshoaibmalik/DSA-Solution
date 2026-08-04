class Solution {
    public boolean canJump(int[] nums) {
        int maxIndex = 0;

        int i = 0;

        while(i < nums.length){
            if(i > maxIndex) return false;

            maxIndex = Math.max(maxIndex, i + nums[i]);
            i++;
        }
        return true;
        
    }
}