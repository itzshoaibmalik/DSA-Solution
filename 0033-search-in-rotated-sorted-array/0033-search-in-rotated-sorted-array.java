class Solution {
    int search(int[] nums, int target) {
    int p = 0, q = nums.length -1;
    while (p <= q) {
        int mid = p + (q - p) / 2;
        if (nums[mid] == target) return mid;
        if (nums[p] <= nums[mid]) {
            if (nums[p] <= target && target < nums[mid]) q = mid - 1;
            else p = mid + 1;
        } else {                           
            if (nums[mid] < target && target <= nums[q]) p = mid + 1;
            else q = mid - 1;
        }
    }
    return -1;
}
}