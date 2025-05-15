class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double arr[]=new double[n+m];

        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        int i=0;
        for(int j=m;j<m+n;j++){
            arr[j]=nums2[i];
            i++;
        }

        Arrays.sort(arr);
        int a=(m+n)/2;
        System.out.println(a);
        if((m+n)%2==0){
            return (arr[a]+arr[a-1])/2;
        }
        else{
            return (arr[a]);
        }

    }
}