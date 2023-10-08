class BrowserHistory {
    Stack<String> stk;
    Stack<String> helper;
    public BrowserHistory(String homepage) {
        stk = new Stack<String>();
        helper = new Stack<String>();
        stk.push(homepage);
    }
    
    public void visit(String url) {
        while(helper.size()!=0){
            helper.pop();
        }
        stk.push(url);
       
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(stk.size()==1){
                break;
            }
            helper.push(stk.pop());
        }
        return stk.peek();
      
    }
    
    public String forward(int steps) {
          for(int i=0;i<steps;i++){
            if(helper.size()==0){
                break;
            }
            stk.push(helper.pop());
        }
        return stk.peek();
      
       
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */