class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0,r=0;
        while(r<m-1){
            if(g[l]<=s[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}