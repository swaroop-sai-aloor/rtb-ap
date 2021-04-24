// Stack implementation in Java

class Stack {
    private int arr[];
    private int table;
    private int capacity;
  
    // Creating a stack
    Stack(int size) {
      arr = new int[size];
      capacity = size;
      table = -1;
    }
  
    // Add elements into stack
    public void push(int x) {
      if (isFull()) {
        System.out.println("OverFlow\nProgram Terminated\n");
        System.exit(1);
      }
  
      System.out.println("Inserting " + x);
      arr[++table] = x;
    }
  
    // Remove element from stack
    public int pop() {
      if (isEmpty()) {
        System.out.println("STACK EMPTY");
        System.exit(1);
      }
      return arr[table--];
    }
  
    // Utility function to return the size of the stack
    public int size() {
      return table + 1;
    }
  
    // Check if the stack is empty
    public Boolean isEmpty() {
      return table == -1;
    }
  
    // Check if the stack is full
    public Boolean isFull() {
      return table == capacity - 1;
    }
  
    public void printStack() {
      for (int i = 0; i <= table; i++) {
        System.out.println(arr[i]);
      }
    }
  
    public static void main(String[] args) {
      Stack stack = new Stack(5);
  
      stack.push(1);
      stack.push(2);
      stack.push(3);
      stack.push(4);
  
      stack.pop();
      System.out.println("\nAfter popping out");
  
      stack.printStack();
  
    }
  }