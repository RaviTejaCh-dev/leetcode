class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<>();
        int high = arr.length - 1;
        int low = 0;

        while (high - low >= k){
            int distL = Math.abs(x - arr[low]);
            int distR = Math.abs(x - arr[high]);
            if(distL > distR){
                low++;
            } else high --;
        }

        for(int i = low; i<=high; i++){
            result.add(arr[i]);
        }
        return result;
    }
}