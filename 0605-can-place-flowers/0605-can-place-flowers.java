class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int m = flowerbed.length;
        for (int i = 0; i < m; ++i) {
            int l;
            if (i == 0) {
                l = 0;
            } else {
                l = flowerbed[i - 1];
            }

            int r;
            if (i == m - 1) {
                r = 0;
            } else {
                r = flowerbed[i + 1];
            }
            if(l + flowerbed[i] + r == 0){
                flowerbed[i] = 1;
                --n;
            }
        }
        return n <= 0;

    }
}