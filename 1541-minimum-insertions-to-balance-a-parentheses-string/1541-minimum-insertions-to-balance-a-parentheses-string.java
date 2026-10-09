
class Solution {
    public int minInsertions(String s) {
        int ans = 0;
        int open = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                open++;
            } else {
                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++;
                } else {
                    ans++;
                }

                if (open > 0) {
                    open--;
                } else {
                    ans++;
                }
            }
        }

        return ans + open * 2;
    }
}
