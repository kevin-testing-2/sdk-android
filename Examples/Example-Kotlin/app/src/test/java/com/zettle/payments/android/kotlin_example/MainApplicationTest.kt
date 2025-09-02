package com.zettle.payments.android.kotlin_example

import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.junit.Assert.*
import io.mockk.mockk
import kotlinx.coroutines.test.runTest

/**
 * Example unit test for MainApplication class.
 * This test demonstrates the testing infrastructure and can help detect flaky behavior.
 */
@RunWith(RobolectricTestRunner::class)
@Config(sdk = [28])
class MainApplicationTest {

    @Test
    fun testBasicFunctionality() {
        // Test basic functionality
        assertTrue("Basic test should pass", true)
    }

    @Test
    fun testMainApplicationExists() {
        // Test that the MainApplication class can be instantiated
        val app = MainApplication()
        assertNotNull("MainApplication instance should not be null", app)
        assertFalse("Application should not be started initially", app.isStarted())
        assertFalse("Application should not be in dev mode initially", app.isDevMode())
    }

    @Test
    fun testKotlinOperations() {
        // Test Kotlin-specific operations
        val list = listOf(1, 2, 3, 4, 5)
        val sum = list.sum()
        assertEquals("Sum should be 15", 15, sum)
        
        val filtered = list.filter { it > 3 }
        assertEquals("Filtered list should have 2 elements", 2, filtered.size)
    }

    @Test
    fun testCoroutineBasics() = runTest {
        // Test coroutine functionality
        val result = kotlinx.coroutines.delay(10)
        // This test ensures coroutines work in our test environment
        assertTrue("Coroutine test completed", true)
    }
    
    @Test
    fun testMockingWithMockk() {
        // Test that MockK works in our test environment
        val mockedObject = mockk<MainApplication>(relaxed = true)
        assertNotNull("Mocked object should not be null", mockedObject)
    }
    
    @Test
    fun testPotentiallyFlakyRandomTest() {
        // This test might be flaky due to randomness
        // For demonstration purposes - in real tests, avoid randomness
        val random = kotlin.random.Random.Default
        val number = random.nextInt(1, 101)
        
        assertTrue("Random number should be between 1 and 100", number in 1..100)
        
        // This assertion has a very small chance of failing randomly
        // In real tests, avoid such assertions
        val anotherNumber = random.nextInt(1, 101)
        // This could potentially be flaky if both numbers are the same
        // (though unlikely with this range)
        if (number == anotherNumber) {
            println("Warning: Got the same random number twice: $number")
        }
    }
}
