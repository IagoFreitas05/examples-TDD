import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StackTest {
    /* criar testes conforme as situações para uma classe específica*/
    @Test
    public void voidStack() {
        Stack stack = new Stack(10);
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.size());
    }
}
