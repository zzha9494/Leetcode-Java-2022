import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q17_letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0)
            return ans;

        Map<Character, String> map = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        helper(ans, digits, new StringBuilder(), map);
        return ans;
    }

    public void helper(List<String> ans, String currentDigits, StringBuilder currentResult, Map<Character, String> map) {
        if (currentDigits.length() == 0)
            ans.add(currentResult.toString());
        else {
            for (int i=0; i < map.get(currentDigits.charAt(0)).length(); i++) {
                char x = map.get(currentDigits.charAt(0)).charAt(i);
                helper(ans, currentDigits.substring(1), currentResult.append(x), map);
//                need to delete the last char added, because of the modified StringBuilder.
                currentResult.deleteCharAt(currentResult.length() - 1);
            }
        }
    }
}
