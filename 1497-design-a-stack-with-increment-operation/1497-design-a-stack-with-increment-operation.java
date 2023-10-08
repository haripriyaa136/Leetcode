class CustomStack {

    int arr[];
    int end = -1;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        end=-1;
        
    }
    
    public void push(int x) {
        if(end<arr.length-1){
            end=end+1;
            arr[end]=x;
            
        }

        
    }
    
    public int pop() {
        if(end==-1){
            return end;
        }
       end--;
        return arr[end+1];
    }
    
    public void increment(int k, int val) {
        int l = Math.min(end+1,k);
        for(int i=0;i<l;i++){
            arr[i]+=val;
        }
        
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */