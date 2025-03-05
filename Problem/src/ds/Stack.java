package ds;

class Stack {
	  private int array[];
	  private int top;
	  private int limit;

	  // Creating a stack
	  Stack(int size) {
	    array = new int[size];
	    limit = size;
	    top = -1;
	  }

	  // Add elements into stack
	  public void push(int x) {
	    if (isFull()) {
	      System.out.println("Overflow and program terminated\n");
	      System.exit(1);
	    }

	    System.out.println("Inserted " + x);
	    array[++top] = x;
	  }

	  // Remove element from stack
	  public int pop() {
	    if (isEmpty()) {
	      System.out.println("STACK EMPTY");
	      System.exit(1);
	    }
	    return array[top--];
	  }

	  // Utility function to return the size of the stack
	  public int size() {
	    return top + 1;
	  }

	  // Check if the stack is empty
	  public Boolean isEmpty() {
	    return top == -1;
	  }

	  // Check if the stack is full
	  public Boolean isFull() {
	    return top == limit - 1;
	  }

	  public void printStack() {
	    for (int i = 0; i <= top; i++) {
	      System.out.println(array[i]);
	    }
	  }

	  public static void main(String[] args) {
	    Stack stack = new Stack(5);

	    stack.push(10);
	    stack.push(20);
	    stack.push(30);
	    stack.push(40);

	    stack.pop();
	    System.out.println("\nAfter popping out");

	    stack.printStack();

	  }
	}

