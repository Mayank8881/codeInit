class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder("");
        System.out.println(sb);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=48 && s.charAt(i)<=57){
                // sb.delete(CharAt(i));
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}