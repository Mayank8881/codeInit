class Solution {
    public boolean rotateString(String s, String goal) {
        String str=s+s;
        if(str.contains(goal)){
            return true;
        }
        else{
            return false;
        }
    }
}