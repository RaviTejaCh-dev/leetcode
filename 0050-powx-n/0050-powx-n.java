class Solution {
    public double myPow(double x, int n) {
        // if (n == 0) return 1.0;
        // double re = myPow(x, n/2);
        // if(n < 0){
        //     x = 1/x;
        // } 
        // if (n%2 == 0){
        //     return re * re;
        // } else {
        //     return re * re * x;
        // }

        double re = 1.0;
        if( n<0){
            x = 1/x;
        }
        while (n  != 0){
            if(n %2 != 0){
                re = re*x;
            }
            x = x*x;
            n = n/2;
        }
        return re;
    }
}

