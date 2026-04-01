class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prevRow = new ArrayList<>();
        List<Integer> currentRow;
        for (int i = 0; i < numRows; i++) {
            currentRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    currentRow.add(1);
                } else {
                    currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
                }
            }
            result.add(currentRow);
            prevRow = currentRow;
        }
        return result;
    }
}