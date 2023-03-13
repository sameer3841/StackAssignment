package test.java.edu.desu;

import org.junit.jupiter.api.Test;
import main.java.edu.desu.Stack;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void isEmptyTest(){
        Stack<String> stringStack = new Stack<>(4);
        //test 01
        assertTrue(stringStack.isEmpty(),"LEARN TO CODE STUPID!!!");
        //test 02
        stringStack.push("hello");
        assertFalse(stringStack.isEmpty(),"LEARN TO CODE STUPID!!!");
    }

    @Test
    public void getMaxTest(){
        Stack<Integer> integerStack = new Stack<>(5);
        //test 01
        int expected = 5;
        int actual = integerStack.getMaxSize();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");
        //test 02
        integerStack.setNewMaxSize(3);
        expected = 3;
        actual = integerStack.getMaxSize();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");
    }

    @Test
    public void pushTest(){
        Stack<Integer> integerStack = new Stack<>(4);
        //test 01
        integerStack.push(6);
        int expected = 6;
        int actual = integerStack.top();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");
        //test 02
        integerStack.push(3);
        integerStack.push(5);
        expected = 5;
        actual = integerStack.top();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");
    }

    @Test
    public void isFullTest(){
        Stack<Integer> integerStack = new Stack<>(2);
        //test 01
        assertFalse(integerStack.isFull(),"LEARN TO CODE STUPID!!!");
        //test 02
        integerStack.push(3);
        integerStack.push(2);
        assertTrue(integerStack.isFull(),"LEARN TO CODE STUPID!!!");
    }

    @Test
    public void popTest(){
        Stack<Integer> integerStack = new Stack<>(4);
        integerStack.push(5);
        integerStack.push(3);
        integerStack.push(9);
        integerStack.push(7);
        //test 01
        integerStack.pop();
        int expected = 9;
        int actual = integerStack.top();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");
        //test 02
        integerStack.pop();
        expected = 3;
        actual = integerStack.top();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");
    }

    @Test
    public void toStringTest(){
        Stack<Integer> integerStack = new Stack<>(4);
        integerStack.push(4);
        integerStack.push(7);
        integerStack.push(3);
        integerStack.push(9);
        //test 01
        String expected = "9\n3\n7\n4";
        String actual = integerStack.toString();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");
        //test 02
        integerStack.pop();
        expected = "3\n7\n4";
        actual = integerStack.toString();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");

        Stack<Integer> integerStack1 = new Stack<>(4);
        expected = "";
        actual = integerStack1.toString();
        assertEquals(expected,actual,"LEARN TO CODE STUPID!!!");
    }
}
