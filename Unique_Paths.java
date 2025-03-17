class Solution {
    public int uniquePaths(int m, int n) {
        return paths(m-1,n-1);
    }
    public int paths(int m,int n){
        if(m==0 && n==0) return 1;
        if(m<0 || n<0) return 0;

        int up=paths(m-1,n);
        int left=paths(m,n-1);

        return up+left;
    }
}