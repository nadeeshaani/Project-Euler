package com.UoK;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.

 */

public class EulerTest {
    @Test
    public void testP001(){
        assertEquals("23", new p001().run(10));
    }



}
