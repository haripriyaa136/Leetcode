class BrowserHistory {
    ArrayList<String> al;
    int werIn = -1;
    int end;
    public BrowserHistory(String homepage) {
        al = new ArrayList<String>();
        al.add(homepage);
        werIn=0;
        end=0;
    }
    
    public void visit(String url) {
       werIn++;
        al.add(werIn,url);
        end=werIn;
        
    }
    
    public String back(int steps) {
       // werIn-=steps;
       int temp=werIn-steps;
       werIn=Math.max(0,temp);
        return al.get(werIn);
        
    }
    
    public String forward(int steps) {
         int temp=werIn+steps;
       werIn=Math.min(end,temp);
        return al.get(werIn);
        // werIn+=steps;
        // return al.get(Math.min(end,werIn));
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */