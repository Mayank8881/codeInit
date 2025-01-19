class Solution {
    public String reverseWords(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                stack.push(s.charAt(i));
            }
            else{
                while(stack.size()>0){
                    sb.append(stack.pop());
                }
                if(i==s.length()-1){
                    if(s.charAt(i-1)!=' '){
                         sb.append(" ");
                    }
                }
                else{
                    if(s.charAt(i+1)!=' '){
                         sb.append(" ");
                    }
                }   
            }

        }
        while(stack.size()>0){
            sb.append(stack.pop());
        }
        return sb.toString().trim();
    }
}