class Solution {
    public String[] findWords(String[] words) {
        String[] n = new String[words.length];
        int k = 0;
        for (int i = 0; i < words.length; i++) {
            int check = checkRow(words[i].charAt(0));
            for (int j = 1; j < words[i].length(); j++) {
                if (check != checkRow(words[i].charAt(j))) {
                    check = 0;
                    break;
                }
            }
            if (check != 0) {
                n[k] = words[i];
                k++;
            }
        }
        String ans[] = new String[k];
        for (int i = 0; i < k; i++) {
            ans[i] = n[i];
        }
        return ans;
    }

    public int checkRow(char c) {
        c = Character.toLowerCase(c);
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";
        if (str1.contains(String.valueOf(c))) {
            return 1;
        } else if (str2.contains(String.valueOf(c))) {
            return 2;
        } else if (str3.contains(String.valueOf(c))) {
            return 3;
        }
        return 0;
    }
}