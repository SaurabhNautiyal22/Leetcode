import java.util.*;

class Solution {

    HashSet<List<Integer>> uniqueCombinations = new HashSet<>();

    private void findCombinations(
            int[] candidates,
            int currentIndex,
            int remainingTarget,
            List<List<Integer>> result,
            List<Integer> currentCombination) {

        if (currentIndex == candidates.length || remainingTarget < 0) {
            return;
        }

        if (remainingTarget == 0) {

            if (!uniqueCombinations.contains(currentCombination)) {
                result.add(new ArrayList<>(currentCombination));
                uniqueCombinations.add(new ArrayList<>(currentCombination));
            }

            return;
        }

        currentCombination.add(candidates[currentIndex]);

        findCombinations(
                candidates,
                currentIndex + 1,
                remainingTarget - candidates[currentIndex],
                result,
                currentCombination
        );

        findCombinations(
                candidates,
                currentIndex,
                remainingTarget - candidates[currentIndex],
                result,
                currentCombination
        );

        currentCombination.remove(currentCombination.size() - 1);

        findCombinations(
                candidates,
                currentIndex + 1,
                remainingTarget,
                result,
                currentCombination
        );
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();

        findCombinations(
                candidates,
                0,
                target,
                result,
                currentCombination
        );

        return result;
    }
}