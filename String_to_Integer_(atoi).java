class Solution {
    // public int myAtoi(String s) {
    //     int i=0;
    //     int n=s.length();
    //     while(i<n && s.charAt(i)==' '){
    //         i++;
    //     }

    //     int sign=1;
    //     if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
    //         if(s.charAt(i)=='-'){
    //             sign=-1;
    //         }
    //         i++;
    //     }
    //     int num=0;
    //     while(i<n && Character.isDigit(s.charAt(i))){
    //         int digit=s.charAt(i)-'0';

    //         if (num > (Integer.MAX_VALUE - digit) / 10) {
    //             return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    //         }
    //         num=num*10+digit;
    //         i++;
    //     }
    //     return sign*num;
    // }

    public int myAtoi(String s) {
        s=s.trim();
        if(s.isEmpty()){
            return 0;
        }

        boolean negative=false;
        int index=0;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            if( s.charAt(0) == '-'){
                negative=true;
            }
            index++;
        }

        return helper(s,index,negative,0);
    }

    public static int helper(String s,int index,boolean negative,int result){
        
        if(index >= s.length() || !Character.isDigit(s.charAt(index))) {
            return negative ? -result : result;
        }
        
        int digit=s.charAt(index)-'0';

        if (result > (Integer.MAX_VALUE - digit) / 10) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        result=result*10+digit;
        return helper(s,index+1,negative,result);

    }
}