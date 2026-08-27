class MinStack {
    int top = -1;
    int min = Integer.MAX_VALUE;
    ArrayList<Integer> stack = new ArrayList<>();
    public void push(int value) {
        if(stack.isEmpty()){
            stack.add(value);
            min=value;
            top++;
        }else if (value<min){
            stack.add(value);
            min=value;
            top++;
        }else{
            stack.add(value);
            top++;
        }
    }
    
    public void pop() {
        if(stack.get(top)==min){
            stack.remove(top--);
            min=Integer.MAX_VALUE;
            for(int i = 0 ; i <=top ; i++){
                if(stack.get(i)<min){
                    min=stack.get(i);
                }
            }
        }else{
            stack.remove(top--);
        }
    }
    
    public int top() {
        return stack.get(top);
    }
    
    public int getMin() {
        return min;
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