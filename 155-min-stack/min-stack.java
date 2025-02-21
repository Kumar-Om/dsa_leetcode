class MinStack {
    long min =Integer.MAX_VALUE;
    Stack<Long>st=new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push((long)val);
            min=val;
        }
        else{
            if(val<min){
                st.push(2L*val-min);
                min=val;
            }
            else{
                st.push((long)val);
            }
        }
    }
    
    public void pop() {
        if(st.isEmpty())return;
        long x=st.pop();
        
        if(x<min){
            min= 2 * min - x;

        }
        if (st.isEmpty()) { 
            min = Integer.MAX_VALUE;  // **Reset min when stack is empty**
        }
    }
    
    public int top() {
        if(st.isEmpty())return -1;
        long x=st.peek();
        if(x<min)return (int)min;
        else return (int)x;
    }
    
    public int getMin() {
        return (int)min;
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