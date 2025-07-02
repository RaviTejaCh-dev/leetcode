class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int m = haystack.length();
        int i=0;
        while ( i <= m - n){
            if(haystack.charAt(i) == needle.charAt(0)){
                int k = i;
                int j = 0;
                while(haystack.charAt(k) == needle.charAt(j)){
                    k++;
                    j++;
                    if(j == n){
                        return i;
                    }

                }

            }
             i++;
            
        }
        return -1;
    }
}