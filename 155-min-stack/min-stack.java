class MinStack {
    Stack<Integer> main;
    Stack<Integer> min;
    public MinStack() {
        main = new Stack<>();
        min = new Stack<>();
        
    }
    
    public void push(int value) {
        main.push(value);

        if(min.isEmpty() || min.peek()>=value){
            min.push(value);
        }
        
    }
    
    public void pop() {
        if(min.peek().equals(main.peek())){
            min.pop();
        }
        main.pop();
        
    }
    
    public int top() {
        return main.peek();
        
    }
    
    public int getMin() {
        return min.peek();   
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