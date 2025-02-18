class Solution {
    public boolean checkValidString(String s) {
        return check(s,0,0);
    }
    public boolean check(String s,int index,int count){
        if(count<0){
            return false;
        }
        if(index==s.length()){
            return count==0;
        }
        if(s.charAt(index)=='('){
            return check( s,index+1,count++);
        }
        else if(s.charAt(index)==')'){
            return check( s,index+1,count--);
        }
        else{
            return check( s,index+1,count);
        }
    }
}