class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int k=0,sum=0;
        int n=nums1.length*nums2.length;
        int arr[]=new int[n];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                arr[k]=nums1[i]^nums2[j];
                sum=sum^arr[k];
                k++;            
            }
        }
        return sum;
        
    }
}