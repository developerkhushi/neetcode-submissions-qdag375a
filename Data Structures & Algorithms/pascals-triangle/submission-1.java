class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prevRow = null;
        List<Integer> currentRow = null;
        for (int r = 0; r < numRows; r++) {
            currentRow = new ArrayList<>();
            for (int c = 0; c <= r; c++) {
                if (c == 0 || c == r) {
                    currentRow.add(1);
                } else {
                    currentRow.add(prevRow.get(c - 1) + prevRow.get(c));
                }
            }
            result.add(currentRow);
            prevRow = currentRow;
        }
        return result;
    }
}