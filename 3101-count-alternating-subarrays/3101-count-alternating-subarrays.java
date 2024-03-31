class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        int n = nums.length;
        long count = 0;
        for(int i = 0; i< n; i++){
            int j = i;

            while (j + 1 < n && nums[j] != nums[j+1]){
                j++;
            }

            int len = j - i + 1;
            count += (long)len * (len + 1)/2;

            i = j; 
        }
        return count;
    }
}