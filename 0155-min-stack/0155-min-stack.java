
class MinStack {
    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int value) {
        long val = value;

        if (st.isEmpty()) {
            st.push(val);
            min = val;
        } else {
            if (val > min) {
                st.push(val);
            } else {
                st.push(2 * val - min);
                min = val;
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long peek = st.pop();

        if (peek <= min) {
            min = 2 * min - peek;
        }

        if (st.isEmpty()) {
            min = Long.MAX_VALUE;
        }
    }

    public int top() {
        if (st.isEmpty()) return -1;

        long peek = st.peek();

        if (peek < min) {
            return (int) min;
        }

        return (int) peek;
    }

    public int getMin() {
        if (st.isEmpty()) return -1;

        return (int) min;
    }
}
