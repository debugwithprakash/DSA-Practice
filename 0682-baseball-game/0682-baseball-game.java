class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+")) {
                int pre = st.pop();
                int preOfPre = st.pop();
                int num = pre+preOfPre;
                st.push(preOfPre);
                st.push(pre);
                st.push(num);
            }
            else if(operations[i].equals("D")) {
                int num = 2*st.peek();
                st.push(num);
            }
            else if(operations[i].equals("C")) {
                st.pop();
            }
            else {
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }
        }

        int totalSum = 0;
        while(!st.isEmpty()) {
            totalSum += st.pop();
        }

        return totalSum;
    }
}