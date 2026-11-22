class pair {
    int val;
    int min;

    pair(int val, int min) {
        this.val = val;
        this.min = min;
    }
}
class MinStack {
    Stack<pair> st;

    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int value) {
        if(st.isEmpty()) st.push(new pair(value, value));
        else {
            int prevMin = st.peek().min;
            int currMin = Math.min(prevMin, value);
            st.push(new pair(value, currMin));
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;
        st.pop();
    }
    
    public int top() {
        if(st.isEmpty()) return -1;
        return st.peek().val;
    }
    
    public int getMin() {
        if(st.isEmpty()) return -1;
        return st.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */