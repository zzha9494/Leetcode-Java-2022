import java.util.HashMap;

public class Q3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int result = 0, start = 0;

        for (int end=0; end < s.length(); end++) {
            Character c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            result = Math.max(result, end - start + 1);
        }

        return result;
    }
}
