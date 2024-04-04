class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 0; i< n;i++){
                int idx = Math.abs(nums[i]) - 1;
                if(nums[idx] < 0){
                    res = idx + 1;  
            }
            nums[idx] *= -1;
        }

        return res;
    }
}