package com.zettle.payments.android.java_example;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 * This test demonstrates the instrumented testing infrastructure.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.zettle.payments.android.java_example", appContext.getPackageName());
    }
    
    @Test
    public void testAppIsNotNull() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertNotNull("App context should not be null", appContext);
    }
    
    @Test
    public void testDeviceHasRequiredFeatures() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        
        // Test that we can access package manager
        assertNotNull("PackageManager should be available", appContext.getPackageManager());
        
        // Test that we can access resources
        assertNotNull("Resources should be available", appContext.getResources());
    }
}
