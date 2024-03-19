class Solution {
    public int rob(int[] nums) {
       int[] a = Arrays.copyOfRange(nums, 1, nums.length);
       int[] b = Arrays.copyOfRange(nums, 0, nums.length - 1);
       return (nums.length == 1) ? nums[0] : Math.max(helperRob(a), helperRob(b));
    }
    public int helperRob(int[] nums){
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