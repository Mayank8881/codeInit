class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> br=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(br.size()>0){
                    sb.append(s.charAt(i));
                }
                br.push(s.charAt(i));
            }
            else{
               br.pop();
                if(br.size()>0){
                    sb.append(s.charAt(i));                    
                }
            }
        }
        return sb.toString();
        
    }
}