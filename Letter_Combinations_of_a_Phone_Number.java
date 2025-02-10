class Solution {
    public static String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return list;
        }
        List<String> list=new ArrayList<>();
        printDial(digits,0,new StringBuilder(),list);
        return list;
    }

    public static void printDial(String digits,int i,StringBuilder sb,List<String> list){
        if (i==digits.length()) {
            list.add(sb.toString());
            return;
        }
        for (char ch:arr[digits.charAt(i) - '0'].toCharArray()) {
            sb.append(ch);
            printDial(digits,i+1,sb,list);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}