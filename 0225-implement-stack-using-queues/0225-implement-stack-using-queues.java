class MyStack {
    private Queue<Integer> first;
    private Queue<Integer> helper;

    public MyStack() {
        first = new LinkedList<>();
        helper = new LinkedList<>(); 
        
    }
    
    public void push(int x) {
        first.add(x);
        
    }
    
    public int pop() {
        int size=first.size();
        for(int i=0;i<size-1;i++){
            helper.add(first.remove());
        }
        int popValue=first.poll();
        for(int i=0;i<size-1;i++){
            first.add(helper.remove());
        }
        return popValue;
        
    }
    
    public int top() {
         int size=first.size();
        for(int i=0;i<size-1;i++){
            helper.add(first.remove());
        }
        int topValue=first.peek();
        helper.add(first.remove());
        for(int i=0;i<size;i++){
            first.add(helper.remove());
        }
        return topValue;
        
    }
    
    public boolean empty() {
        return first.size()==0;
        
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