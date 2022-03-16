import domain.Stack;
import errors.EmptyStackExceptionStack;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class StackTest {
    /* criar testes conforme as situações para uma classe específica*/
    private Stack stack;

    @Before
    public void startStack() {
        stack = new Stack(10);
    }

    @Test
    public void voidStack() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void statckUp() {
        stack.stackUp("first element of stack");
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
        assertEquals("first element of stack", stack.top());
    }

    @Test
    public void StackUpUnstack() {
        stack.stackUp("First Element of Stack");
        stack.stackUp("Second Element of Stack");
        assertFalse(stack.isEmpty());
        assertEquals(2, stack.size());
        assertEquals("Second Element of Stack", stack.top());
        Object unstacked = stack.unstack();
        assertEquals(1, stack.size());
        assertEquals("First Element of Stack", stack.top());
        assertEquals("Second Element of Stack", unstacked);
    }

    @Test(expected = EmptyStackExceptionStack.class)
    public void unstackEmpty() {
        stack.unstack();
    }
}
