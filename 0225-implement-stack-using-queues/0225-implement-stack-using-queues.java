class MyStack {
    Queue<Integer> q;
    int size;

    public MyStack() {
        q = new LinkedList<>();
        size = 0;
    }
    
    public void push(int x) {
        q.offer(x);
        size++;
    }
    
    public int pop() {
        if(size == 0) return -1;
        for(int i = 0; i < size-1; i++) {
            int ele = q.poll();
            q.offer(ele);
        }
        int popedEle = q.poll();
        size--;
        return popedEle;
    }
    
    public int top() {
        if(size == 0) return -1;
        for(int i = 0; i < size-1; i++) {
            int ele = q.poll();
            q.offer(ele);
        }
        int topEle = q.poll();
        q.offer(topEle);
        return topEle;
    }
    
    public boolean empty() {
        return size==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */