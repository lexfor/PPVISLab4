package src.converter;


class Stack {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public Stack(int max) {
        this.maxSize = max;
        this.stackArray = new char[maxSize];
        top = -1;
    }
    public char peek() {

        return stackArray[top];
    }
    public boolean isEmpty() {

        return (top == -1);
    }
    public void push(char j) {

        stackArray[++top] = j;
    }
    public char pop() {

        return stackArray[top--];
    }

}