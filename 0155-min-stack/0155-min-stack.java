class MinStack {
    Stack<Long> st;
    long min;
    public MinStack() {
        st = new Stack<>();
        min = -1;
    }
    
    public void push(int value) {
        long val = value;
        if(st.isEmpty()) { // if stack is empty
            st.push(val);
            min = val;
        }
        else { // if stack is not empty
            if(val<min) { // if value is less then peek
                long newPeek = val+(val-min);
                st.push(newPeek);
                min = val;
            }
            else { // if value is less greater then or equals to peek
                st.push(val);
            }
        }
    }
    
    public void pop() {
        long peek = st.peek();
        if(peek<min) { // if peek is less then min
            st.pop();
            min = min+(min-peek);
        }
        else { // if peek is greater then equals to min
            st.pop();
        }
    }
    
    public int top() {
        long peek = st.peek();
        if(peek<min) { // if peek is less then min
            return (int)min; 
        }
        else { // if peek is greater then or equals to min
            return (int)peek;
        }
    }
    
    public int getMin() {
        return (int)min;
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