class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        List<Integer> result = new ArrayList<>();

        for (int i = min; i <= max; i++) {

            boolean found = false; 

            for (int num : nums) {
                if (num == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.add(i);
            }
        }

        return result;
    }
}