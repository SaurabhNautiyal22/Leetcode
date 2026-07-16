class Solution {
public String reverseWords(String s) {

        StringBuilder reversed = new StringBuilder(s);
        reversed.reverse();

        StringBuilder result = new StringBuilder();
        int n = reversed.length();

        for (int i = 0; i < n; i++) {

            StringBuilder word = new StringBuilder();

            while (i < n && reversed.charAt(i) != ' ') {
                word.append(reversed.charAt(i));
                i++;
            }

            word.reverse();

            if (word.length() > 0) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(word);
            }
        }

        return result.toString();
    }
}