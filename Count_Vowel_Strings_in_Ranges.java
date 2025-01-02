// class Solution {
//     public int[] vowelStrings(String[] words, int[][] queries) {
//         int n=queries.length;
//         System.out.println(n);
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             int count=0;
//             int l=queries[i][0];
//             int r=queries[i][1];
//             // System.out.println(x);
//             for(int j=l;j<=r;j++){
//                 int x=words[j].length();
//                 if(words[j].charAt(0)=='a' || words[j].charAt(0)=='e' || words[j].charAt(0)=='i' || words[j].charAt(0)=='o' || words[j].charAt(0)=='u'){
//                     if(words[j].charAt(x-1)=='a' || words[j].charAt(x-1)=='e' || words[j].charAt(x-1)=='i' || words[j].charAt(x-1)=='o' || words[j].charAt(x-1)=='u'){
//                         count++;
//                     }
//                 }
//             }
//             arr[i]=count;
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n + 1];
        
        // Precompute prefix sum for words starting and ending with vowels
        for (int i = 0; i < n; i++) {
            if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
                prefixSum[i + 1] = prefixSum[i] + 1;
            } else {
                prefixSum[i + 1] = prefixSum[i];
            }
        }
        
        // Answer each query in O(1)
        int m = queries.length;
        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            result[i] = prefixSum[r + 1] - prefixSum[l];
        }
        
        return result;
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

