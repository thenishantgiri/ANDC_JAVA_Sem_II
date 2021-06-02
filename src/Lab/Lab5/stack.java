package Lab.Lab5;

public class stack {

    protected int data[];

    protected int top;

    public stack() {

        this.data = new int[10]; //size of the stack
        this.top = -1; //using top as indexing, when no files are in stack the value should be -1
    }

    protected boolean isFull() {
        return top == data.length - 1;
    }

    public void push(int element) throws Exception {

        if (isFull()) {
            throw new Exception("error : stack is full.");
        }

        data[++top] = element;
    }


    protected boolean isEmpty() {
        return top == -1;
    }

    public int pop() throws Exception {

        if (isEmpty()) {
            throw new Exception("error : stack is empty.");
        }

        return data[top--];
    }

    public void display() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Stack Elements : ");
        for (int items : data) {
            System.out.println(items);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
    }
}
