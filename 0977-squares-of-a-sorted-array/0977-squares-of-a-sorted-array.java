class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;

        int i = 0;
        int j = n - 1;
        int k = n-1;
        int[] result = new int[n];
        while(k >= 0){
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];
            if( a > b){
                result[k] = a;
                i++;
            }else{
                result[k] = b;
                j--;
            }
            k--;

        }
        return result;
    }
}