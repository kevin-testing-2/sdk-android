package com.zettle.payments.android.kotlin_example

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 * This test demonstrates the instrumented testing infrastructure.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.zettle.payments.android.kotlin_example", appContext.packageName)
    }
    
    @Test
    fun testAppIsNotNull() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertNotNull("App context should not be null", appContext)
    }
    
    @Test
    fun testDeviceHasRequiredFeatures() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        
        // Test that we can access package manager
        assertNotNull("PackageManager should be available", appContext.packageManager)
        
        // Test that we can access resources
        assertNotNull("Resources should be available", appContext.resources)
    }
    
    @Test
    fun testKotlinSpecificFeatures() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        
        // Test Kotlin extension properties work
        val packageName = appContext.packageName
        assertTrue("Package name should not be empty", packageName.isNotEmpty())
        assertTrue("Package name should contain 'kotlin_example'", packageName.contains("kotlin_example"))
    }
}
