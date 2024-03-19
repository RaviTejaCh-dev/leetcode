class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int rob = 0;
        int noRob = 0;
        for(int i = 0; i< n; i++){
            int newRob = Math.max(rob + nums[i], noRob);
            rob = noRob;
            noRob = newRob;
        }
        return noRob;
    }
}