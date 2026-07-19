import java.util.*;

class Solution {

    private boolean isPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equals(reversed);
    }

    private void findPartitions(String remainingString,
                                List<String> currentParts,
                                List<List<String>> result) {

        if (remainingString.length() == 0) {
            result.add(new ArrayList<>(currentParts));
            return;
        }

        for (int end = 0; end < remainingString.length(); end++) {

            String currentPart = remainingString.substring(0, end + 1);

            if (isPalindrome(currentPart)) {

                currentParts.add(currentPart);

                findPartitions(
                        remainingString.substring(end + 1),
                        currentParts,
                        result
                );

                currentParts.remove(currentParts.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {

        List<List<String>> result = new ArrayList<>();
        List<String> currentParts = new ArrayList<>();

        findPartitions(s, currentParts, result);

        return result;
    }
}