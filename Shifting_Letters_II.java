class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        // StringBuilder sb=new StringBuilder(s);
        // for(int i=0;i<shifts.length;i++){
        //     int l=shifts[i][0];
        //     int r=shifts[i][1];
        //     int d=shifts[i][2];

        //     for(int j=l;j<=r;j++){
        //         int a=(int)(sb.charAt(j));
        //         if(d==1){
        //             if(sb.charAt(j)=='z'){
        //                 sb.setCharAt(j,'a');
        //             }
        //             else{
        //                sb.setCharAt(j,(char)(a+1));
        //             }
        //         }
        //         else{
        //             if(sb.charAt(j)=='a'){
        //                 sb.setCharAt(j,'z');
        //             }
        //             else{

        //             sb.setCharAt(j,(char)(a-1));
        //             }
        //         } 
        //     }
        // }
        // s=sb.toString();
        // return s;
        int n=s.length();
        int arr[]=new int[n];

        for(int[] shift : shifts){
            if(shift[2]==1){
                arr[shift[0]]++;
                if(shift[1]+1<n){
                    arr[shift[1]+1]--;
                }
            }
            else{
                arr[shift[0]]--;
                if(shift[1]+1<n){
                    arr[shift[1]+1]++;
                }
            }
        }
        int sum=0;
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sum=(sum+arr[i])%26;
            if(sum<0){
                sum+=26;
            }

            char c=(char)('a'+((s.charAt(i)-'a'+sum)%26));
            sb.setCharAt(i,c);
        }
        return sb.toString();

    }
}