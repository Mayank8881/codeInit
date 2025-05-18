class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[0] - b[0]);

        for(int x : nums1){
            pq.offer(new int[] { x + nums2[0], 0});
        }

        while(k > 0 && !pq.isEmpty()){
            int[] temp = pq.poll();
            int sum = temp[0];
            int pos = temp[1];
            ans.add(List.of(sum-nums2[pos],nums2[pos]));
            if(pos+ 1 < nums2.length){
                pq.offer(new int[] { sum - nums2[pos] + nums2[pos+1], pos+1});
            }
            k--;

        }
        return ans;
    }
}