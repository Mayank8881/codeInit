class Solution {
    public String reverseOnlyLetters(String s) {
        int l=0;
        char str[]=s.toCharArray();
        int r=s.length()-1;

        while(l<r){
            if(!Character.isLetter(str[l])){
                l++;
            }
            else if(!Character.isLetter(str[r])){
                r--;
            }
            else{
                char temp=str[l];
                str[l]=str[r];
                str[r]=temp;
                l++;
                r--;
            }
        }

        return String.valueOf(str);
    }
}