import org.junit.Test;
import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void testStackIsEmpty() {
        MyStack stack = new MyStack(3);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPush() {
        MyStack stack = new MyStack(3);
        stack.push(4);
        stack.push(6);
        assertEquals(3, stack.push(3));
    }


    @Test
    public void testPushIsFull_throwException() {
        MyStack stack = new MyStack(2);
        stack.push(4);
        stack.push(6);
        assertThrows(StackOverflowError.class, () -> stack.push(6));
    }

    @Test
    public void testStackIsEmptyAfterPush() {
        MyStack stack = new MyStack(2);
        stack.push(4);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPop() {
        MyStack stack = new MyStack(3);
        stack.push(6);
        stack.push(8);
        stack.pop();
       assertEquals(8, stack.pop());
    }

    @Test
    public void testStackIsEmptyAfterPop() {
        MyStack stack = new MyStack(3);
        stack.push(6);
        stack.push(8);
        stack.pop();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testStackIsEmptyAfterPop2() {
        MyStack stack = new MyStack(3);
        stack.push(6);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        MyStack stack = new MyStack(3);
        stack.push(6);
        stack.push(2);
        stack.peek();
        assertEquals(2, stack.peek());
    }
    
    @Test
    public void testStackIsEmptyAfterPeek2() {
        MyStack stack = new MyStack(3);
        stack.push(2);
        stack.push(9);
        stack.peek();
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSize() {
        MyStack stack = new MyStack(3);
        stack.push(2);
        stack.push(9);
        assertEquals(2, stack.size(2));
    }

    @Test
    public void testStackSizeIsZero() {
        MyStack stack = new MyStack(3);
        assertThrows(IllegalArgumentException.class, () -> stack.size(0));
    }

    @Test
    public void testSearch() {
        MyStack stack = new MyStack(3);
        stack.push(6);
        stack.push(8);
        stack.push(2);
        stack.search(8);
        assertTrue(stack.search(8));
    }

    @Test
    public void testSearchIsFalse() {
        MyStack stack = new MyStack(3);
        stack.push(6);
        stack.push(8);
        stack.push(2);
        stack.search(5);
        assertFalse(stack.search(5));

    }

}
