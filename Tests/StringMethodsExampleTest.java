import org.junit.Test;

import static org.junit.Assert.*;

public class StringMethodsExampleTest {

    @Test
    public void abcTest1() {
        boolean result = StringMethodsExample.abcTest("123abc");
        assertEquals(true, result);
    }
    @Test
    public void abcTest2() {
        boolean result = StringMethodsExample.abcTest("123.abc");
        assertEquals(false, result);
    }
    @Test
    public void abcTest3() {
        boolean result = StringMethodsExample.abcTest("abc.123");
        assertEquals(true, result);
    }
    @Test
    public void abcTest4() {
        boolean result = StringMethodsExample.abcTest("123");
        assertEquals(false, result);
    }
    @Test
    public void alternateStrings1() {
        String result = StringMethodsExample.alternateStrings("abc","xyz");
        assertEquals("axbycz", result);
    }
    @Test
    public void alternateStrings2() {
        String result = StringMethodsExample.alternateStrings("Hi", "There");
        assertEquals("HTihere", result);
    }
    @Test
    public void alternateStrings3() {
        String result = StringMethodsExample.alternateStrings("xxxx", "Thereee");
        assertEquals( "xTxhxexreee", result);
    }
    @Test
    public void alternateStrings4() {
        String result = StringMethodsExample.alternateStrings("Thereee", "xxxx");
        assertEquals(  "Txhxexrxeee", result);
    }
    public void alternateStrings5() {
        String result = StringMethodsExample.alternateStrings("", "");
        assertEquals(  "", result);
    }
    public void abcTest5() {
        boolean result = StringMethodsExample.abcTest("");
        assertEquals(false, result);
    }
}