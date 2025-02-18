class Solution {
    public boolean checkValidString(String s) {
        return check(s,0,0);
    }
    public boolean check(String s,int index,int count){
        if(count<0){
            return false;
        }
        if(index==s.length()){
            if(count==0){
                // System.out.println(count);
                return true;
            }
            return false;
        }
        if(s.charAt(index)=='('){
            return check( s,index+1,count+1);
        }
        else if(s.charAt(index)==')'){
            return check( s,index+1,count-1);
        }
        else {
            return (check( s,index+1,count) || check( s,index+1,count-1) || check( s,index+1,count+1)) ;
        }
    }
}