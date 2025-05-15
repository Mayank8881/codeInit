class Solution {
    public int integerReplacement(int n) {
        long a =n;
        int count = 0;
        while(a!=1){
            if(a%2==0){
                a= a/2;
            }
            else{
                if(a==3 || (a-1)%4 == 0){
                    a = a-1;
                }else{
                    a = a+1;
                }
            }
            ++count;
        }
        return count;
    }
    public static void main(String[] args){
        Solution s= new Solution();
        int ans = s.integerReplacement(8);
        System.out.print(ans);
    }
}