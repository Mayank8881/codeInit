class Solution {
    double sum=1;
    public double myPow(double x, int n) {
        if(n==0){
            return 1;
        }
        if(n<0){
            n=-n;
            x=1/x;
            return x*myPow(x,n-1);
        }
        return x*myPow(x,n-1);
    }
}