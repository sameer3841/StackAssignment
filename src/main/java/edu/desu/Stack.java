package main.java.edu.desu;

public class Stack<Type> {

    // Your attributes for Stack
    private int maxSize;
    private int top;
    private Type[] array;

    // This is a Constructor
    public Stack(int maxSize){
        //to-do
    }

    // This should return the maxSize
    public int getMaxSize(){
        //to-do
        return 0;
    }

    // This should push a value and set it as top IF THERE IS STILL SPACE INSIDE OF THE STACK
    public void push(Type data){
        //to-do
    }

    // Changes the size of the stack
    public void setNewMaxSize(int maxSize){
        //to-do
    }

    // This should take off the top of the stack, set the second top as the new top, and return
    // what was taken off
    public Type pop(){
        //to-do
        return null;
    }

    // Checks if there is nothing inside the stack
    public Boolean isEmpty(){
        //to-do
        return null;
    }

    // Checks if the stack has reached its maxSize
    public Boolean isFull(){
        //to-do
        return null;
    }

    // Returns the VALUE at top
    public Type top(){
        //to-do
        return null;
    }

    // Should return all the values inside stack (top to bottom)
    // use backslash n if needed to create new lines
    @Override
    public String toString() {
        //to-do
        return null;
    }
}
