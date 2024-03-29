package com.testrepo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    public AppTest(String testName)
    {
        super(testName);
    }

    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testAppMath()
    {
        assertEquals(3, new AppMath().sum(1, 2));
    }

    public void testSubAppMath()
    {
        assertEquals(1, new AppMath().subtract(2, 1));
    }

    public void testMultiply() {
        assertEquals(4, new AppMath().multiply(2, 2));
    }

    public void testSumTwice() {
        assertEquals(6, new AppMath().sumTwice(2, 2));
    }

    public void testSubtractTwice() {
        assertEquals(2, new AppMath().subtractTwice(6, 2));
    }
}
