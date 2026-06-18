class Solution {
    List<Integer> scoreStack;

    public int calPoints(String[] operations) {
        scoreStack = new ArrayList<>();

        int resultSum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+") || operations[i].equals("D") || operations[i].equals("C")) {
                if (operations[i].equals("+")) {
                    scoreStack.add(scoreStack.get(
                        scoreStack.size()-1) + scoreStack.get(scoreStack.size()-2));
                }
                if (operations[i].equals("D")) {
                    scoreStack.add(scoreStack.get(scoreStack.size()-1) * 2); 
                }
                if (operations[i].equals("C")) {
                    // pop
                    scoreStack.remove(scoreStack.size()-1);
                }
            } else {
                // push
                scoreStack.add(Integer.valueOf(operations[i]));
            }
        }
        for (int i = 0; i < scoreStack.size(); i++) {
            resultSum += scoreStack.get(i);
        }
        return resultSum;
    }
}