class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        StringBuilder str=new StringBuilder();
        int i;
        int kk=k;
        for( i=0;i<n;i=i+k){
            int sum=0;
            for(int j=i;j<kk;j++){
                int aa=s.charAt(j);
                int fa=aa-97;
                sum=sum+fa;
                
            }
            int per=sum%26;
            int fper=97+per;
            char f=(char)fper;
            str.append(f);
            kk=kk+k;
            
        }
        String sstr=str.toString();
        return sstr;
                
        
    }
}