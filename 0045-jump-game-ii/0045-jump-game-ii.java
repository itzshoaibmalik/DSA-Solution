class Solution {
    public int jump(int[] nums) {

        int jumps = 0;
        int l = 0;
        int r = 0;

        while (r < nums.length - 1) {

            int farJump = 0;

            for (int i = l; i <= r; i++) {
                farJump = Math.max(farJump, i + nums[i]);
            }

            l = r + 1;
            r = farJump;
            jumps++;
        }

        return jumps;
    }
}