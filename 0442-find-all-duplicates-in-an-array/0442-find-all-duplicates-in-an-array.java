class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> duplicatesList = new ArrayList<>();

        for(int i =0; i< n; i++){
            int num = Math.abs(nums[i]);
            int idx = num - 1;
            if(nums[idx] < 0){
                duplicatesList.add(idx +1);
            }
            nums[idx] *= -1;
        }
        return duplicatesList;
    }
}