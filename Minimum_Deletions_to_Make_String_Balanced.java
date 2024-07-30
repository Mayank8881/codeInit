import java.util.*;
class Solution {
    public int minimumDeletions(String s) {
        int n=s.length();
        int arr[]=new int[n];
        int acount=0;
        int bcount=0;
        for(int i=n-1;i>=0;i--){
            arr[i]=acount;
            if(s.charAt(i)=='a'){
                acount++;
            }
        } 
        int global_count=10000;
        for(int i=0;i<n;i++){
            global_count=Math.min(global_count,bcount+arr[i]);
            if(s.charAt(i)=='b'){
                bcount++;
            }
        }
        return global_count;

    }
}