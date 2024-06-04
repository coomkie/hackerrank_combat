class Solution {
    public boolean isSubsequence(String s, String t) {
        if (t.length() == s.length()) return s.equals(t);
        if (s.length() > t.length()) return false;
        int l = 0, r = 0;
        while (l < s.length()) {
            if (r == t.length()) return false;
            char lc = s.charAt(l++);
            char rc = t.charAt(r++);
            while (lc != rc) {
                if (r == t.length()) return false;
                rc = t.charAt(r++);
            }
        }
        return true;
    }
}