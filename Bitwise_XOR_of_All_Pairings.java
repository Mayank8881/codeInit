class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int sum=0;
        int n=nums1.length;
        int m=nums2.length;
        if(n%2==0 && m%2==0){
            return 0;
        }
        if(m%2!=0){
            for(int i=0;i<nums1.length;i++){
                sum=sum^nums1[i];
            }
        }
        
        if(n%2!=0){
            for(int i=0;i<nums2.length;i++){
                sum=sum^nums2[i];
            }
        }
        
        return sum;
        
    }
}