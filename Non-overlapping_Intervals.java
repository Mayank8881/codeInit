class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int start=intervals[0][0];
        int end=intervals[0][1];

        int count=-1;
        for(int[] i :intervals){
            System.out.println();
            if(i[0]<end){
                count++;
            }
            else{
                start=i[0];
                end=i[1];
            }
        }
        return count;
    }
}