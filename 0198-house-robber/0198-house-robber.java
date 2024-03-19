class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int rob = 0;
        int noRob = 0;

        for(int i = 0; i<n; i++){
            int newRob = noRob + nums[i];
            int noNewRob = Math.max(noRob, rob);
            rob = newRob;
            noRob = noNewRob;
        }
        return Math.max(rob,noRob);   
    }
}