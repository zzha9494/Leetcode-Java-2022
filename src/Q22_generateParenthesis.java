import java.util.ArrayList;
import java.util.List;

public class Q22_generateParenthesis {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        ans.clear();
        dfs(n, 0, 0, "");
        return ans;
    }

    public void dfs (int n, int left, int right, String s) {
        if (left == n && right == n)
            ans.add(s);
        else {
            if (left < n)
                dfs(n, left + 1, right, s + "(");
            if (right < n && left > right)
                dfs(n, left, right + 1, s + ")");
        }
    }
}
