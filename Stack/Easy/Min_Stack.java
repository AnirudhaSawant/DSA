package Stack.Easy;

class MinStack {

    Stack<Long> st;
    long min;

    public MinStack() {
        st = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(long val) {
        if(st.isEmpty()) {
            min = val;
            st.push(val);
        }
        else{
            if(val <= min) {
                st.push(2 * val - min);
                min = val;
            }
            else{
                st.push(val);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return;

        long top = st.pop();
        if(top <= min) {
            min = 2 * min - top;
        }
    }
    
    public long top() {
        if(st.isEmpty()) return -1;
        if(st.peek() <= min) return min;
        return st.peek();
    }
    
    public long getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */