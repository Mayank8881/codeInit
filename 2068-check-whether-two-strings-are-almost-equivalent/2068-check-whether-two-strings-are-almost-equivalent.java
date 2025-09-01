class Solution {

	public static boolean checkAlmostEquivalent(String word1, String word2) {

		HashMap<Character, Integer> map1 =  new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 =  new HashMap<Character, Integer>();



		for (int i = 0; i < word1.length(); i++) {

			map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0)+1);
			map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0)+1);

		}


		for (char c ='a'; c <= 'z'; c++) {

			int count1 = map1.getOrDefault(c, 0);
			int count2 = map2.getOrDefault(c, 0);


			if (Math.abs(count1 - count2) > 3) {
				return false;
			}

		}


		return true;
	}
}