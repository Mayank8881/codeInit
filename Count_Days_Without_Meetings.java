
import java.util.Arrays;

class Solution {
    public int countDays(int days, int[][] meetings) {
        int n=meetings.length;
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        int day=0,start=0,end=0;
        for (int i=0;i<n;i++){
            if(meetings[i][0]>end){
                day+=meetings[i][0]-end-1;
            }
            end=Math.max(end,meetings[i][1]);
        } 
        if(end<days){
            day+=days-end;
        }
        return day;
    }
}