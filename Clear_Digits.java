class Solution {
    public String clearDigits(String s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){              //for(char c : s.toCharArray())
            if(s.charAt(i)>=48 && s.charAt(i)<=57){ //if(Character.isDigit(c))
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}