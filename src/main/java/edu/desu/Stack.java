package main.java.edu.desu;

import java.util.Arrays;

public class Stack<Type> {

    // Your attributes for Stack
    private int maxSize;
    private int top;
    private Type[] array;

    // This is a Constructor
    public Stack(int maxSize){
        this.maxSize = maxSize;
        top = 0;
        array = (Type[]) new Object[maxSize];
    }

    // This should return the maxSize
    public int getMaxSize(){
        //to-do
        return maxSize;
    }

    // This should push a value and set it as top IF THERE IS STILL SPACE INSIDE OF THE STACK
    public void push(Type data){
        if (top<maxSize){
            array[top] = data;
            top++;
        }
        else{
        }

    }

    // Changes the size of the stack
    public void setNewMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    // This should take off the top of the stack, set the second top as the new top, and return
    // what was taken off
    public Type pop(){

        Type data = array[top-1];
        array[top-1] = null;
        top--;
        return data;
    }

    // Checks if there is nothing inside the stack
    public Boolean isEmpty(){

        return top == 0;
    }

    // Checks if the stack has reached its maxSize
    public Boolean isFull(){
        //to-do
        return top == maxSize;
    }

    // Returns the VALUE at top
    public Type top(){
        //to-do
        return array[top-1];
    }

    // Should return all the values inside stack (top to bottom)
    // use backslash n if needed to create new lines
    @Override
    public String toString() {
        //to-do
        String res = "";
        for(int x = top-1; x>=0; x--){
            res += array[x].toString()+"\n";
        }
        return res.strip();
    }
}
