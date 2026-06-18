class Solution {
    List<Integer> scoreStack;

    public int calPoints(String[] operations) {
        scoreStack = new ArrayList<>();
        int pointer = 0;

        int resultSum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("+") || operations[i].equals("D") || operations[i].equals("C")) {
                if (operations[i].equals("+")) {
                    scoreStack.add(scoreStack.get(pointer-1) + scoreStack.get(pointer-2));
                    pointer++;
                }
                if (operations[i].equals("D")) {
                    scoreStack.add(scoreStack.get(pointer-1) * 2); 
                    pointer++;
                }
                if (operations[i].equals("C")) {
                    // pop
                    scoreStack.remove(scoreStack.size()-1);
                    pointer--;
                }
            } else {
                // push
                scoreStack.add(Integer.valueOf(operations[i]));
                pointer++;
            }
        }
        for (int i = 0; i < scoreStack.size(); i++) {
            resultSum += scoreStack.get(i);
        }
        return resultSum;
    }
}