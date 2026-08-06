class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n; ; i++){
            int prod = 1;
            int num = i;

            while(num > 0){
                int rem = num % 10;
                prod *= rem;
                num = num / 10;
            }
            if(prod % t == 0){
                return i;
            }
            
        }
        
    }
}