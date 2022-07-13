import java.util.HashMap;
import java.util.Stack;

public class Q20_Valid_Parentheses {
    public boolean isValid(String s) {
        int n = s.length();

        if (n % 2 == 1)
            return false;

        HashMap<Character, Character> pairs = new HashMap<Character, Character>() {
            {
            put(')', '(');
            put(']', '[');
            put('}', '{');
            }
        };

        Stack<Character> stack = new Stack<>();
        for (int i=0; i<n; i++) {
            char c = s.charAt(i);
            if (!pairs.containsKey(c))
                stack.push(c);
            else {
                if (stack.empty() || stack.pop() != pairs.get(c))
                    return false;
            }
        }
        return stack.empty();
    }
}
