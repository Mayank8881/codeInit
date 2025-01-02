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

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

        int m = queries.length;
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            int count = 0;

            // Count words starting and ending with vowels in the range [l, r]
            for (int j = l; j <= r; j++) {
                if (isVowel(words[j].charAt(0), vowels) && isVowel(words[j].charAt(words[j].length() - 1), vowels)) {
                    count++;
                }
            }

            result[i] = count;
        }

        return result;
    }

    // Helper function to check if a character is a vowel using a Set
    private boolean isVowel(char c, Set<Character> vowels) {
        return vowels.contains(c);
    }
}
