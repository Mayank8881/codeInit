class Solution {
    public boolean checkValidString(String s) {
        // return check(s,0,0);
        int min=0,max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                min=min+1;
                max=max+1;
            }
            else if(s.charAt(i)==')'){
                min=min-1;
                max=max-1;
            }
            else{
                min=min-1;
                max=max+1;
            }
            if(min<0)min=0;
            if(max<0)return false;

        }
        return (min==0);
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
            return (check( s,index+1,count-1) || check( s,index+1,count-1) || check( s,index+1,count+1)) ;
        }
    }
}