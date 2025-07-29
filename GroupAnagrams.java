//Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.
// The problem can be solved using the Hashmap where we store he string as value and its relevant anagrams into its value then we return those values in group which is asked in the question 


class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();
        for (String s: strs){
            int[] count = new int[26];
            for(char c: s.toCharArray()){
                count[c-'a']++;
            }
            StringBuilder keyBuilder = new StringBuilder();
            for(int i: count){
                keyBuilder.append('#');
                keyBuilder.append(i);
            }
            String key = keyBuilder.toString();

            map.computeIfAbsent(key, k-> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
