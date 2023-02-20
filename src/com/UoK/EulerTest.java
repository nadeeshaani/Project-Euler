package com.UoK;
import static org.junit.Assert.assertEquals;
import org.junit.Test;



public class EulerTest {
    @Test
    public void testP001(){
        assertEquals("23", new p001().run(10));
    }

    @Test
    public void testP002(){
        assertEquals("4613732", new p002().run(4000000));
    }



}
