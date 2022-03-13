import domain.Stack;
import org.junit.Test;

import static org.junit.Assert.*;


public class StackTest {
    /* criar testes conforme as situações para uma classe específica*/
    @Test
    public void voidStack() {
        Stack stack = new Stack(10);
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }

    @Test
    public void statckUp() {
        Stack stack = new Stack(10);
        stack.stackUp("first element of stack");
        assertFalse(stack.isEmpty());
        assertEquals(1, stack.size());
        assertEquals("first element of stack", stack.top());
    }
}
