class Solution {
    public String reverseVowels(String s) {
        int l=0,r=s.length()-1;
        char ch[]=s.toCharArray();

        while(l<r){
            if(!isVowel(ch[l])) l++;
            if(!isVowel(ch[r])) r--;
            if(isVowel(ch[l]) && isVowel(ch[r])){
                char temp=ch[l];
                ch[l]=ch[r];
                ch[r]=temp;

                l++;
                r--;
            }
        }
        return String.valueOf(ch);
    }

    public boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || 
            c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
        {
            return true;
        }
        return false;
    }
}