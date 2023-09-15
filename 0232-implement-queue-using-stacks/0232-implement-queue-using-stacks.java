class MyQueue {
    Stack<Integer> first = new Stack<Integer>();
    Stack<Integer> helper = new Stack<Integer>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        int initialSize =first.size();
        for(int i=0;i<initialSize;i++){
            helper.push(first.pop());
        }
        int popValue = helper.pop();
        for(int i=0;i<initialSize-1;i++){
            first.push(helper.pop());
        }
        return popValue;
    }
    
    public int peek() {
         int initialSize =first.size();
        for(int i=0;i<initialSize;i++){
            helper.push(first.pop());
        }
        int peekValue = helper.peek();
        for(int i=0;i<initialSize;i++){
            first.push(helper.pop());
        }
        return peekValue;
        
    }
    
    public boolean empty() {
        return first.size()==0;
        
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