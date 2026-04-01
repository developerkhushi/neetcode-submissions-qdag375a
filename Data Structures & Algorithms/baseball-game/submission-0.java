class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        
        for (String operation : operations) {
            if (operation.equals("+")) {
                int num2 = st.pop();
                int num1 = st.peek();
                st.push(num2);
                st.push(num1 + num2);
            } else if (operation.equals("D")) {
                st.push(2 * st.peek());
            } else if (operation.equals("C")) {
                st.pop();
            } else {
                st.push(Integer.parseInt(operation));
            }
        }

        int sum = 0;
        for (int num : st) sum += num;
        return sum;
    }
}