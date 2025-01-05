class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<shifts.length;i++){
            int l=shifts[i][0];
            int r=shifts[i][1];
            int d=shifts[i][2];

            for(int j=l;j<=r;j++){
                int a=(int)(sb.charAt(j));
                if(d==1){
                    if(sb.charAt(j)=='z'){
                        sb.setCharAt(j,'a');
                    }
                    else{
                       sb.setCharAt(j,(char)(a+1));
                    }
                }
                else{
                    if(sb.charAt(j)=='a'){
                        sb.setCharAt(j,'z');
                    }
                    else{

                    sb.setCharAt(j,(char)(a-1));
                    }
                }
                
            }
            System.out.println(sb);
        }
        s=sb.toString();
        return s;
    }
}