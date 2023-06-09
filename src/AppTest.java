import static org.junit.Assert.assertTrue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {

    @Test
    public void test1true() {
        assertTrue(true);
    }

    @Test
    public void test2true() {
        assertTrue(true);
    }

    /**
     * 
     */
    @Test
    public void testsum() {
        assertEquals(null, 2, 1 + 2, 0);;
    }
}