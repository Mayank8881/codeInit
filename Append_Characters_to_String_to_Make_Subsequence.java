class Solution {
    public int appendCharacters(String s, String t) {
        int i,j,count=1,m=0;
        for(i=0;i<t.length();i++){
            char c=t.charAt(i);
            for(j=i;j<s.length();j++){
                char d=s.charAt(j);
                if(c==d){
                    break;
                }
                else if(c!=d){
                    if(j==s.length()-1){
                        count=i;
                        System.out.println(i);
                    }
                    
                }
            
            }
            if(count!=1){
                break;
            }
            

        }
        return (t.length()-count);
    }
}