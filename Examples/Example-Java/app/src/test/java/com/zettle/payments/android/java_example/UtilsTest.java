package com.zettle.payments.android.java_example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.*;

/**
 * Example unit test for Utils class.
 * This test demonstrates the testing infrastructure and can help detect flaky behavior.
 */
@RunWith(RobolectricTestRunner.class)
@Config(sdk = 28)
public class UtilsTest {

    @Test
    public void testBasicFunctionality() {
        // Test basic functionality
        assertTrue("Basic test should pass", true);
    }

    @Test
    public void testUtilsClassExists() {
        // Test that the Utils class can be instantiated
        Utils utils = new Utils();
        assertNotNull("Utils instance should not be null", utils);
    }

    @Test
    public void testMathOperations() {
        // Simple math test that should be deterministic
        int result = 2 + 2;
        assertEquals("2 + 2 should equal 4", 4, result);
    }

    @Test
    public void testStringOperations() {
        // Test string operations
        String test = "Hello World";
        assertEquals("String length should be 11", 11, test.length());
        assertTrue("String should contain 'World'", test.contains("World"));
    }
    
    @Test
    public void testPotentiallyFlakyTimeBasedTest() {
        // This test might be flaky if it depends on timing
        // For demonstration purposes - in real tests, avoid time dependencies
        long startTime = System.currentTimeMillis();
        
        // Simulate some work
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        
        // This assertion might be flaky on slow CI systems
        assertTrue("Operation should take at least 10ms", duration >= 10);
        assertTrue("Operation should take less than 1000ms", duration < 1000);
    }
}
