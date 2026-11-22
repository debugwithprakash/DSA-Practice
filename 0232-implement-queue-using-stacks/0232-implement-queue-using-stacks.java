class MyQueue {
    Stack<Integer> st;
    Stack<Integer> helperSt;
    int size;
    public MyQueue() {
        st = new Stack<>();
        helperSt = new Stack<>();
        size = 0;
    }
    
    public void push(int x) {
        st.push(x);
        size++;
    }
    
    public int pop() {
        for(int i = 0; i < size-1; i++) {
            helperSt.push(st.pop());
        }
        int popedEle = st.pop();
        size--;
        for(int i = 0; i < size; i++) {
            st.push(helperSt.pop());
        }
        return popedEle;
    }
    
    public int peek() {
        for(int i = 0; i < size-1; i++) {
            helperSt.push(st.pop());
        }
        int peekEle = st.peek();
        for(int i = 0; i < size-1; i++) {
            st.push(helperSt.pop());
        }
        return peekEle;
    }
    
    public boolean empty() {
        return size==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */