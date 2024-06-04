class Solution {
    public int longestPalindrome(String s) {
        int maxCount=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int count=0;
            int flag=0;
            if(i>0){
                for(int k=i-1;k>=0;k--){
                    if(c==s.charAt(k)){
                        flag=1;
                    }
                }
                if(flag==0){
                    for(int j=i;j<s.length();j++){
                        if(s.charAt(j)==c){
                                count++;
                                System.out.println(count);
                                System.out.println();
                        }
                    
                    }   
                }

            }
            else{
                for(int j=i;j<s.length();j++){
                    if(s.charAt(j)==c){
                            count++;
                            System.out.println(count);
                            System.out.println();
                    }
                
                } 
            }
            
            if(count%2!=0){
                maxCount++;
            }
        }
        int t=s.length();
        if(t==1){
            return 1;
        }
        else if(maxCount==0){
            return t;
        }
        else{
            return(t-maxCount+1);
        }
    }
}