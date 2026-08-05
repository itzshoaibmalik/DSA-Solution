class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas < totalCost)
            return -1;

        int start = 0;
        int currSum = 0;

        for (int i = 0; i < gas.length; i++) {

            currSum += gas[i] - cost[i];

            if (currSum < 0) {
                start = i + 1;
                currSum = 0;
            }
        }

        return start;
    }
}