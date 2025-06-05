class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();

        for(char digit : num.toCharArray()){
            while(!stack.isEmpty() && stack.peek()>digit && k>0){
                stack.pop();
                k--;
            }
            stack.push(digit);
        }   
        while(!stack.isEmpty() && k>0){
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.length() > 0 ? sb.toString() : "0";
    }
}