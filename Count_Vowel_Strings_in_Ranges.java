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
        int m = queries.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int count = 0;
            for (int j = l; j <= r; j++) {
                String word = words[j];
                if (isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }
    private boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
