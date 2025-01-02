class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=queries.length;
        System.out.println(n);
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            int l=queries[i][0];
            int r=queries[i][1];
            // System.out.println(x);
            for(int j=l;j<=r;j++){
                int x=words[j].length();
                if(words[j].charAt(0)=='a' || words[j].charAt(0)=='e' || words[j].charAt(0)=='i' || words[j].charAt(0)=='o' || words[j].charAt(0)=='u'){
                    if(words[j].charAt(x-1)=='a' || words[j].charAt(x-1)=='e' || words[j].charAt(x-1)=='i' || words[j].charAt(x-1)=='o' || words[j].charAt(x-1)=='u'){
                        count++;
                    }
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}